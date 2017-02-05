import org.junit.*;
import static org.junit.Assert.*;
import ShoppingBasket.*;
import Behaviours.*;

public class BasketTest{

  Purchasable item;
  Basket basket;

  @Before
  public void before(){
    item = new Item("Cheese", 5.00, 3);
    basket = new Basket();
  }

  @Test
  public void startsEmpty(){
    assertEquals(0, basket.itemCount());
  }

  @Test
  public void canAddItem(){
    basket.addItem(item);
    assertEquals(1, basket.itemCount());
  }

  @Test
  public void canRemoveItem(){
    basket.addItem(item);
    basket.removeItem(item);
    assertEquals(0, basket.itemCount());
  }

  @Test
  public void canEmptyBasket(){
    basket.addItem(item);
    basket.addItem(item);
    assertEquals(2, basket.itemCount());
    basket.emptyBasket();
    assertEquals(0, basket.itemCount());
  }

  @Test
  public void canCalculateSubTotal(){
    basket.addItem(item);
    basket.calculateSubTotal();
    assertEquals(5.00, basket.getSubTotal(), 0.01);
  }

}