package colorcoder;

public class Main {
   
  static void printColorManual() {
    int pairNumber=1;
    for(Major majorColor: Major.values()) {
      for(Minor minorColor: Minor.values()) {
        System.out.println("PAIR NO-"+pairNumber+"= ["+majorColor+","+minorColor+"]");
        pairNumber++;
      }
    }
  }

    public static void main(String[] args) {
      
      ColorPairTest test=new ColorPairTest();
      test.testNumberToPair(4, Color.Major.WHITE, Color.Minor.BROWN);
      test.testNumberToPair(5, Color.Major.WHITE, Color.Minor.SLATE);
    
      test.testPairToNumber(Color.Major.BLACK, Color.Minor.ORANGE, 12);
      test.testPairToNumber(Color.Major.VIOLET, Color.Minor.SLATE, 25);
      
      printColorManual();
 
    }

}
