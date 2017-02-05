package ShoppingBasket;
import Behaviours.*;

public class Item implements Purchasable{
  private String itemName;
  private Double price;

  public Item(String itemName, Double price){
    this.itemName = itemName;
    this.price = price;
  }
   public String getItemName(){
    return this.itemName;
   }
   
  public Double getPrice(){
    return this.price;
   }
 
}