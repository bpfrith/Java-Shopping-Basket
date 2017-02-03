import static org.junit.Assert.*;
import org.junit.*;
import ShoppingBasket.*;

public class ItemTest{

  @Before
  public void before(){
    item = new Item(10);
  }

  @Test
  public void hasCost(){
    assertEquals(cost, item.getcost());
  }
  
}