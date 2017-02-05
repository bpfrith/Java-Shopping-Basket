package models;
import behaviours.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Deal implements Dealable{
  private Basketable basket;
  private ArrayList<String> itemsForBOGOF;
  private ArrayList<Itemable> itemsInBasket;
  private boolean buyOneGetOneFree;
  private boolean tenPercentOff;
  private boolean loyaltyCard;

  public Deal(){
    itemsForBOGOF = new ArrayList<String>();
    itemsInBasket = new ArrayList<Itemable>();
    buyOneGetOneFree = false;
    tenPercentOff = false;
    loyaltyCard = false;
  }

  public void setBOGOF(boolean buyOneGetOneFree){
    this.buyOneGetOneFree = buyOneGetOneFree;
  }