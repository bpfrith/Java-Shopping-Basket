package ShoppingBasket;
import Behaviours.*;
import java.util.ArrayList;

public class Basket{

  private ArrayList<Purchasable> items;
  private Double total;

  public Basket(){
    items = new ArrayList<Purchasable>();
  }

  public int itemCount(){
    return items.size();
  }

}