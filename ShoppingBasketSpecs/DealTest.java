import models.*;
import Behaviours.*;
import org.junit.*;
import static org.junit.Assert.*;

public class DealCheckerTest {

  Dealable dealChecker;
  Basketable basket;
  Itemable itemToothBrush;
  Itemable itemCheese;
  Itemable itemOstrichSteaks;

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
      dealChecker.setBOGOF(true);
      dealChecker.addBOGOFItem("Cheese");

      basket.addItem(itemCheese);
      basket.addItem(itemCheese);
      basket.addItem(itemCheese);

      basket.checkDeals(deal);
      assertEquals(15.00, basket.getTotal(), 0.01);
    }