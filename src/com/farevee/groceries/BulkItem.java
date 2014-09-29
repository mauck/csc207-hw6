package com.farevee.groceries;

public class BulkItem
    implements Item
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  BulkFood food;
  Units unit;
  int amount;
  
  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
   * Create a new BulkItem item
   * 
   * @param food
   * @param unit
   * @param amount
   */
  public BulkItem(BulkFood food, Units unit, int amount)
  {
    this.food = food;
    this.unit = unit;
    this.amount = amount;
  } // BulkItem(BulkFood, Units, int)
  
  //+---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public String toString()
  {
    return this.getWeight() + " of " + this.food.toString();
  } // toString()

  public Weight getWeight()
  {
    return new Weight(this.unit, this.amount);
  } // getWeight()

  public int getPrice()
  {
    return this.food.pricePerUnit * this.amount;
  } // getPrice()
  
  public boolean equals(BulkItem other)
  {
    return this.food.equals(other.food) &&
           this.unit.equals(other.unit)&&
           this.amount == other.amount;
  } // equals(BulkItem)

  public boolean equals(Object obj)
  {
    if (this == obj)
      {
        return true;
      } // if
    else if (obj instanceof BulkItem)
      {
        return this.equals(obj);    
      } // else if
    else
      {
        return false;
      } // else
  } // equals(Object)
} // class BulkItem
