package com.farevee.groceries;

public class Weight
{
  //+--------+------------------------------------------------------
  // | Fields |
  // +--------+
  Units unit;
  int amount;
  
  //+--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
   * Create a new weight with a given unit and amount
   * 
   * @param unit
   * @param amount
   */
  public Weight(Units unit, int amount)
  {
    this.unit = unit;
    this.amount = amount;
  } // Weight(Units, int)
  
  //+-----------+---------------------------------------------------
  // | Accessors |
  // +-----------+
  public String toString()
  {
    if (amount > 1)
      {
        return this.amount + " " + this.unit.plural;
      } // if
    else
      {
        return this.amount + " " + this.unit.name;
      } // else
  } // toString()
} // class Weight
