package ShoppingBasket;
import Behaviours.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Deal implements Dealable{
  private Basketable basket;
  private ArrayList<String> itemsBOGOF;
  private ArrayList<Purchasable> itemsInBasket;
  private boolean buyOneGetOneFree;
  private boolean tenPercentOff;
  private boolean loyaltyCard;

  public Deal(){
    itemsBOGOF = new ArrayList<String>();
    itemsInBasket = new ArrayList<Purchasable>();
    buyOneGetOneFree = false;
    tenPercentOff = false;
    loyaltyCard = false;
  }

  public double checkForDeals(Basketable basket){
    if(buyOneGetOneFree){
      basket.modifyTotal(buyOneGetOneFree(basket));
    } else {
      basket.calculateSubTotal();
      basket.modifyTotal(basket.getSubTotal());
    }
      // if(tenPercentOff){
      //   basket.modifyTotal(tenPercentOff(basket));
      // }
      // if(loyaltyCard){
      //   basket.modifyTotal(twoPercentOffWithLoyaltyCard(basket));
      // }
    return basket.getTotal();
  }

  public void setBOGOF(boolean buyOneGetOneFree){
    this.buyOneGetOneFree = buyOneGetOneFree;
  }

  private double buyOneGetOneFree(Basketable basket){
    HashMap<String, Integer> itemQuantities = new HashMap<>();
    basket.calculateSubTotal();
    double total = basket.getSubTotal();
    itemsInBasket = basket.getItems();

    for(Purchasable item : itemsInBasket){
      String itemName = item.getItemName();
      if(itemsBOGOF.contains(itemName) && itemQuantities.containsKey(itemName)){
        itemQuantities.put(itemName, itemQuantities.get(itemName)+1);
      } else {
        itemQuantities.put(itemName, 1);
      }
    }

    for(String itemName : itemQuantities.keySet()){
      if(itemQuantities.get(itemName) % 2 != 0){
        itemQuantities.put(itemName, itemQuantities.get(itemName)-1);
      }
    }

    for(Purchasable item : itemsInBasket){
      int numberOfDeductions = itemQuantities.get(item.getItemName()) / 2;
      double totalDeduction = item.getPrice() * numberOfDeductions;
      itemQuantities.put(item.getItemName(), 0);
      total -= totalDeduction;
    }

    return total;
  }

  public void addBOGOFItem(String itemName){
    itemsBOGOF.add(itemName);
  }

}