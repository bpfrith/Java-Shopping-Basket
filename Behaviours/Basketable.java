package Behaviours;

import java.util.ArrayList;

public interface Basketable {
  public int itemCount();
  public void addItem(Purchasable item);
  public void removeItem(Purchasable item);
  public void empty();
  public ArrayList<Purchasable> getItems();
  public void calculateSubTotal();
  public double getSubTotal();
  public double getFinalTotal();
}