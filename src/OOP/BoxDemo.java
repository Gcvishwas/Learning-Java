// Superclass
class Box {
    double length, breadth, height;

    // Constructor
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    // Method to calculate volume
    double getVolume() {
        return length * breadth * height;
    }
}

// Subclass
class BoxWeight extends Box {
    double weight;

    // Constructor using super to call superclass constructor
    BoxWeight(double l, double b, double h, double w) {
        super(l, b, h);
        weight = w;
    }

    // Method to display weight
    void displayWeight() {
        System.out.println("Weight: " + weight);
    }
}

// Main class
public class BoxDemo {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(2, 3, 4, 5);
        BoxWeight box2 = new BoxWeight(5, 6, 7, 10);

        System.out.print("Box 1\nVolume: " + box1.getVolume() + " ");
        box1.displayWeight();

        System.out.print("Box 2\nVolume: " + box2.getVolume() + " ");
        box2.displayWeight();
    }
}
