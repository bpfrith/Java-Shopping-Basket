package Behaviours;

import java.util.ArrayList;

public interface Basketable {
  public int itemCount();
  public void addItem(Purchasable item);
  public void removeItem(Purchasable item);
  public void emptyBasket();
  public void calculateSubTotal();
  public double getSubTotal();
  public double getTotal();
  public void checkDeals(Dealable dealChecker);
  public void modifyTotal(Double newTotal);
  public ArrayList<Purchasable> getItems();
}