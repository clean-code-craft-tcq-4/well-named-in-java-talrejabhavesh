package colorcoder;

public class Color {
  
  /**
   * @author TAB1JA
   * 
   *
   */
  public enum Major {
    WHITE(0),
    RED(1),
    BLACK(2),
    YELLOW(3),
    VIOLET(4);
    private int index;
    private Major(int index) {
        this.index = index;
    }
    int getIndex() {
        return index;
    }
    public static Major fromIndex(int index) {
        for(Major color: Major.values()) {
            if(color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }
};
/**
 * @author TAB1JA
 *
 */
public enum Minor {
    BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);
    private int index;
    private Minor(int index) {
        this.index = index;
    }
    int getIndex() {
        return index;
    }
    public static Minor fromIndex(int index) {
        for(Minor color: Minor.values()) {
            if(color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }
};
}
