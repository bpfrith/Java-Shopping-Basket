import static org.junit.Assert.*;
import org.junit.*;
import ShoppingBasket.*;

public class ItemTest {
  Item item;

  @Before
  public void before() {
    item = new Item("Tooth Brush", 2.60, 1);
  }

  @Test
  public void hasItemName(){
    assertEquals("Tooth Brush", item.getItemName());
  }

  @Test
  public void hasPrice(){
    assertEquals(item.getPrice(), 2.60, 0.01);
  }

  @Test
  public void hasQuantity(){
    assertEquals(item.getQuantity(), 1);
  }

}