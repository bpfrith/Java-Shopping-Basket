package Behaviours;

public interface Dealable {
  public void setBOGOF(boolean buyOneGetOneFree);
  public double checkForDeals(Basketable basket);
  public void addBOGOFItem(String itemName);
  public void setTenPercentOff(boolean tenPercentOff);
    public void setLoyaltyCard(boolean loyaltyCard);

}