package colorcoder;

public class Main {
    

    public static void main(String[] args) {
      
      ColorPairTest test=new ColorPairTest();
      test.testNumberToPair(4, Color.Major.WHITE, Color.Minor.BROWN);
      test.testNumberToPair(5, Color.Major.WHITE, Color.Minor.SLATE);
    
      test.testPairToNumber(Color.Major.BLACK, Color.Minor.ORANGE, 12);
      test.testPairToNumber(Color.Major.VIOLET, Color.Minor.SLATE, 25);
    }
}
