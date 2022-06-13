package colorcoder;

public class Color {
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
    BLUE(5),
    ORANGE(6),
    GREEN(7),
    BROWN(8),
    SLATE(9);
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
