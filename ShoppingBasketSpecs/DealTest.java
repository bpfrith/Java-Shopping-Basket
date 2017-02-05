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
  public void canPerformBOGOF(){
    deal.setBOGOF(true);
    deal.addBOGOFItem("Cheese");

    basket.addItem(itemCheese);
    basket.addItem(itemCheese);
    basket.addItem(itemCheese);

    basket.checkDeals(deal);
    assertEquals(10.00, basket.getTotal(), 0.01);
  }

}