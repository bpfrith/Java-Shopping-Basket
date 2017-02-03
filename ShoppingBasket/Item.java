package ShoppingBasket;
import Behaviours.*;

public class Item{
  private String itemName;
  private Double price;
  private int quantity;

  public Item(String itemName, Double cost, int quantity){
    this.itemName = itemName;
    this.price = price;
    this.quantity = quantity;
  }
   public String getItemName(){
    return this.itemName;
   }
   
  public Double getPrice(){
    return this.price;
   }
  
  public int getQuantity(){
    return this.quantity;
  }
 
}