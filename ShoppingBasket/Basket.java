package ShoppingBasket;
import Behaviours.*;
import java.util.ArrayList;

public class Basket implements Basketable{

  private ArrayList<Purchasable> items;
  private Double subTotal;
  private Double total;

  public Basket(){
    items = new ArrayList<Purchasable>();
  }

  public int itemCount(){
    return items.size();
  }

  public void addItem(Purchasable item){
    items.add(item);
  }

  public void removeItem(Purchasable item){
    items.remove(item);
  }

  public void emptyBasket(){
    items.clear();
  }

  public void calculateSubTotal(){
    double n = 0.00;
    for(int i = 0; i < itemCount(); i++){
     n += items.get(i).getPrice();
   }
   subTotal = n;
 }

 public double getSubTotal(){
   return subTotal;
 }

 public double getTotal(){
   return total;
 }

 public void checkDeals(Dealable deal){
   total = deal.checkForDeals(this);
 }

 public void modifyTotal(Double newTotal){
   this.total = newTotal;
 }

 public ArrayList<Purchasable> getItems(){
   return items;
 }

}