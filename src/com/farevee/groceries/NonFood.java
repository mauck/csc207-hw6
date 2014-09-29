package com.farevee.groceries;

public class NonFood
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
   * Create new NonFood item
   * 
   * @param name
   * @param weight
   * @param price
   */
  public NonFood(String name, Weight weight, int price)
  {
    this.name = name;
    this.weight = weight;
    this.price = price;
  } // NonFood(String, Weight, int)
  
  //+---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public String toString()
  {
    return this.name;
  } // toString()

  public Weight getWeight()
  {
    return this.weight;
  } // getWeight()

  public int getPrice()
  {
    return this.price;
  } // getPrice()

  public boolean equals(NonFood other)
  {
    return this.name.equals(other.name) &&
           this.weight.equals(other.weight) &&
           this.price == other.price;
  } // equals(NonFood)
  
  public boolean equals(Object obj)
  {
    if (this == obj)
      {
        return true;
      } // if
    else if (obj instanceof NonFood)
      {
        return this.equals(obj);
      } // else if
    else
      {
        return false;
      } // else
  } // equals(Object)
} // clas NonFood
