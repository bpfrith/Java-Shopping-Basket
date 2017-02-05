import org.junit.*;
import static org.junit.Assert.*;
import ShoppingBasket.*;
import Behaviours.*;
import java.util.ArrayList;

public class BasketTest{

  Purchasable item;
  Basket basket;

  @Before
  public void before(){
    item = new Item("Cheese", 5.00);
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

  @Test
  public void canModifyTotal(){
    basket.modifyTotal(20.00);
    assertEquals(20.00, basket.getTotal(), 0.01);
  }

  @Test
  public void canGetItems(){
    basket.addItem(item);
    ArrayList<Purchasable> currentItems = basket.getItems();
    Item currentItem = (Item) currentItems.get(0);
    assertEquals("Cheese", currentItem.getItemName());
  }

}