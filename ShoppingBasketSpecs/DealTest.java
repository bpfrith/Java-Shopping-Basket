import ShoppingBasket.*;
import Behaviours.*;
import org.junit.*;
import static org.junit.Assert.*;

public class DealTest{

  Dealable deal;
  Basketable basket;
  Purchasable itemToothBrush;
  Purchasable itemCheese;
  Purchasable itemOstrichSteaks;

  @Before
  public void before(){
    deal = new Deal();
    basket = new Basket();
    itemToothBrush = new Item("Tooth Brush", 2.50);
    itemCheese = new Item("Cheese", 5.00);
    itemOstrichSteaks = new Item("Ostrich Steaks", 4.99);
  }

  @Test
  public void canBOGOF(){
    deal.setBOGOF(true);
    deal.addBOGOFItem("Cheese");

    basket.addItem(itemCheese);
    basket.addItem(itemCheese);
    basket.addItem(itemCheese);

    basket.checkDeals(deal);
    assertEquals(10.00, basket.getTotal(), 0.01);
  }

  @Test
  public void canTake10PercentOff(){
    deal.setTenPercentOff(true);

    basket.addItem(itemCheese);
    basket.addItem(itemOstrichSteaks);
    basket.addItem(itemOstrichSteaks);
    basket.addItem(itemOstrichSteaks);
    basket.addItem(itemToothBrush);

    basket.checkDeals(deal);
    assertEquals(20.22, basket.getTotal(), 0.01);
  }

  @Test
  public void noDiscountWithTotalLessThan20(){
    deal.setTenPercentOff(true);

    basket.addItem(itemToothBrush);

    basket.checkDeals(deal);
    assertEquals(2.50, basket.getTotal(), 0.01);
  }

  @Test
  public void cantake2PercentOff(){
    deal.setLoyaltyCard(true);

    basket.addItem(itemCheese);

    basket.checkDeals(deal);
    assertEquals(4.90, basket.getTotal(), 0.01);
  }

  @Test
  public void performsDealsInRightOrder(){
    deal.setBOGOF(true);
    deal.setTenPercentOff(true);
    deal.setLoyaltyCard(true);

    deal.addBOGOFItem("Cheese");

    basket.addItem(itemCheese);
    basket.addItem(itemCheese);
    basket.addItem(itemCheese);
    basket.addItem(itemCheese);
    basket.addItem(itemCheese);
    basket.addItem(itemOstrichSteaks);
    basket.addItem(itemOstrichSteaks);
    basket.addItem(itemOstrichSteaks);
    basket.addItem(itemToothBrush);

    basket.checkDeals(deal);
    assertEquals(28.63, basket.getTotal(), 0.01);
  }

}