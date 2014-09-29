package com.farevee.groceries;

public class ManyPackages
    implements Item
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  Package type;
  int count;
  
  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  public ManyPackages(Package type, int count)
  {
    this.type = type;
    this.count = count;
  } // ManyPackages(Package, int)
  
  //+---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public String toString()
  {
    return count + " \u00D7 " + this.type.toString();
  } // toString()

  public Weight getWeight()
  {
    return new Weight(this.type.weight.unit, this.type.weight.amount * count);
  } // getWeight()

  public int getPrice()
  {
    return this.type.price * this.count;
  } // getPrice()

  public boolean equals(Object obj)
  {
    if (this == obj)
      {
        return true;
      } // if
    else
      {
        return false;
      } // else
  } // equals(Object)
} // class ManyPackages
