package colorcoder;


public class ColorPairTest {

  
  public void testNumberToPair(int pairNumber,
      Color.Major expectedMajor,
      Color.Minor expectedMinor)
  {
    ColorPair colorPair =  ColorPair.getColorFromPairNumber(pairNumber);
      System.out.println("Got pair " + colorPair.ToString());
      assert(colorPair.getMajor() == expectedMajor);
      assert(colorPair.getMinor() == expectedMinor);
  }

  public void testPairToNumber(
      Color.Major major,
      Color.Minor minor,
      int expectedPairNumber)
  {
      int pairNumber = ColorPair.getPairNumberFromColor(major, minor);
      System.out.println("Got pair number " + pairNumber);
      assert(pairNumber == expectedPairNumber);
}
}
