package colorcoder;

public class ColorPair {

  private Color.Major major;
  private Color.Minor minor;
  final static String MajorNames[] = {
      "White", "Red", "Black", "Yellow", "Violet"
  };
  final static int numberOfMajors = MajorNames.length;
  final static String MinorColorNames[] = {
      "Blue", "Orange", "Green", "Brown", "Slate"
  };
  final static int numberOfMinorColors = MinorColorNames.length;
  
  
  public ColorPair(Color.Major major, Color.Minor minor)
  {
      this.major = major;
      this.minor = minor;
  }
  
  
  
  public Color.Major getMajor() {
      return this.major;
  }
  

  public Color.Minor getMinor() {
      return this.minor;
  }
  
  public String ToString() {
      String colorPairStr = MajorNames[this.major.getIndex()];
      colorPairStr += " ";
      colorPairStr += MinorColorNames[this.minor.getIndex()];
      return colorPairStr;
  }
  
  
  public static ColorPair GetColorFromPairNumber(int pairNumber) {
    int zeroBasedPairNumber = pairNumber - 1;
    Color.Major major = 
        Color.Major.fromIndex(zeroBasedPairNumber / numberOfMinorColors);
    Color.Minor minor =
        Color.Minor.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
    return new ColorPair(major, minor);
}
  
  
  public static int GetPairNumberFromColor(Color.Major major, Color.Minor minor) {
    return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
}
  
  
}
