package com.farevee.groceries;

public class BulkContainer
    extends BulkItem
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  String container;
  
  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
   * Create a new BulkContainer item
   * 
   * @param container
   * @param food
   * @param unit
   * @param amount
   */
  public BulkContainer(String container, BulkFood food, Units unit, int amount)
  {
    super(food, unit, amount);
    this.container = container;
  } // BulkContainer(String, BulkFood, Units, int)
  
  //+---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public String toString()
  {
    return this.container + " of " + super.toString();
  } // toString()

  public boolean equals(BulkContainer other)
  {
    return this.container.equals(other.container) &&
           super.equals(other);
  } // equals(BulkContainer)
  
  public boolean equals(Object obj)
  {
    if (this == obj)
      {
        return true;
      } // if
    else if (obj instanceof BulkContainer)
      {
        return this.equals(obj);
      } // else if
    else
      {
        return false;
      } // else
  } // equals(Object)
} // class BulkContainer
