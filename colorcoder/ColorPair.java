package colorcoder;

public class ColorPair {
  static final  String[]  MajorColors= {
      "White", "Red", "Black", "Yellow", "Violet"
  };
  static final  int NUMBER_OF_MAJOR_COLORS = MajorColors.length;
  static final  String[]  MinorColors= {
      "Blue", "Orange", "Green", "Brown", "Slate"
  };
  static final  int NUMBER_OF_MINOR_COLORS = MinorColors.length;
  private Color.Major major;
  private Color.Minor minor;

  
  
  /**
   * @param major
   * @param minor
   */
  public ColorPair(Color.Major major, Color.Minor minor)
  {
      this.major = major;
      this.minor = minor;
  }
  
  
  
  /**
   * @return
   */
  public Color.Major getMajor() {
      return this.major;
  }
  

  /**
   * @return
   */
  public Color.Minor getMinor() {
      return this.minor;
  }
  
  public String ToString() {
      String colorPairStr = MajorColors[this.major.getIndex()];
      colorPairStr += " ";
      colorPairStr += MinorColors[this.minor.getIndex()-5];
      return colorPairStr;
  }
  
  
  /**
   * @param pairNumber
   * @return
   */
  public static ColorPair getColorFromPairNumber(int pairNumber) {
    int zeroBasedPairNumber = pairNumber - 1;
    Color.Major major = 
        Color.Major.fromIndex(zeroBasedPairNumber / NUMBER_OF_MAJOR_COLORS);
    Color.Minor minor =
        Color.Minor.fromIndex((zeroBasedPairNumber % NUMBER_OF_MINOR_COLORS)+5);

    return new ColorPair(major, minor);
}
  
  
  /**
   * @param major
   * @param minor
   * @return
   */
  public static int getPairNumberFromColor(Color.Major major, Color.Minor minor) {
    return major.getIndex() * NUMBER_OF_MINOR_COLORS + minor.getIndex() -4;
}
  
  

}
