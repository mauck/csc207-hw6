package edu.grinnell.csc207.mauckchi.layout;

import java.io.PrintWriter;

/**
 * A w-by-h grid of a single character
 * 
 * @author mauckchi
 */
public class Grid
    implements TextBlock
{
  int width;
  int height;
  char character;

  /**
   * Build a new grid
   */
  public Grid(int width, int height, char ch)
  {
    this.width = width;
    this.height = height;
    this.character = ch;
  } // Grid(int, int, char)

  /**
   * Determine how many rows are in the grid.
   */
  public int height()
  {
    return this.height;
  } // height()

  /**
   * Determine how many columns are in the grid.
   */
  public int width()
  {
    return this.width;
  } // width()

  /**
   * Get one row from the grid.
   *
   * @pre i < this.height()
   * @exception Exception
   * if the row number is invalid.
   */
  public String row(int i)
  // try StringUtils.repeat -- need to download something...
    throws Exception
  {
    if ((i >= 0) && (i <= this.height))
      {
        return new String(new char[this.width]).replace("\0",String.valueOf(this.character));
      } // if
    else
      {
        throw new Exception("Invalid row " + i);
      } // else
  } // row(int)
  
  public static void main(String[] args)
  {
    PrintWriter pen = new PrintWriter(System.out, true);
    TBUtils.print(pen, new BoxedBlock(new Grid(7,3, '*')));
    TBUtils.print(pen, new Grid(7,3,'*'));
  }
} // class Grid