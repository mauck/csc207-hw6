package com.farevee.groceries;

public class Package
    implements Item
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  String name;
  Weight weight;
  int price;
  
  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
   * Create a new Package item
   * 
   * @param name
   * @param weight
   * @param price
   */
  public Package(String name, Weight weight, int price)
  {
    this.name = name;
    this.weight = weight;
    this.price = price;
  } // Package(String, Weight, int)
  
  //+---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public String toString()
  {
    return this.weight.amount + " " + this.weight.unit.abbrev + " package " + " of " + name;
  } // toString()

  public Weight getWeight()
  {
    return this.weight;
  } // getWeight()

  public int getPrice()
  {
    return this.price;
  } // getPrice()

  public boolean equals(Package other)
  {
    return this.name.equals(other.name) &&
           this.weight.equals(other.weight) &&
           this.price == other.price;
  } // equals(Package)
  
  public boolean equals(Object obj)
  {
    if (this == obj)
      {
        return true;
      } // if
    else if (obj instanceof Package)
      {
        return this.equals(obj);
      } // else if
    else
      {
        return false;
      } // else
  } // equals(Object)
} // clas Package