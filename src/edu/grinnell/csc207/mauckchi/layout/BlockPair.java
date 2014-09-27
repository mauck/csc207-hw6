package edu.grinnell.csc207.mauckchi.layout;

/**
 * Two copies of the same text block, side by side
 * 
 * @author mauckchi
 */

public class BlockPair
    implements TextBlock
{
  /**
   * Create a new block that is made up of two copies of the
   * same original block
   * 
   * @param tb
   */
  public BlockPair(TextBlock tb)
  {
    // STUB
  } // BlockPair(TextBlock)
  
  /**
   * Determine how many rows are in the block.
   */
  public int height()
  {
    // STUB
  } // height()
  
  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    // STUB
  } // width()
  
  /**
   * Get the ith row of the block.
   */
  public String row(int i)
  {
    // STUB
  } // row(int)
} // class BlockPair
