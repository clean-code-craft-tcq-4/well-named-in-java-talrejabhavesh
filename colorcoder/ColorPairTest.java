package colorcoder;

import static org.junit.Assert.*;

public class ColorPairTest {

  
  public void testNumberToPair(int pairNumber,
      Color.Major expectedMajor,
      Color.Minor expectedMinor)
  {
    ColorPair colorPair = ColorPair.GetColorFromPairNumber(pairNumber);
      System.out.println("Got pair " + colorPair.ToString());
    assertEquals(expectedMajor,colorPair.getMajor());
      assertEquals(expectedMinor,colorPair.getMinor());
  }

  public void testPairToNumber(
      Color.Major major,
      Color.Minor minor,
      int expectedPairNumber)
  {
      int pairNumber = ColorPair.GetPairNumberFromColor(major, minor);
      System.out.println("Got pair number " + pairNumber);
        assertEquals(expectedPairNumber,pairNumber);
}
}
