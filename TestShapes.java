// Circle class
class Circle {
    // Private field for radius
    private double radius;

    // Default constructor
    public Circle() {
        this.radius = 0;
    }

    // Overloaded constructor
    public Circle(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
    }

    // Accessor for radius
    public double getRadius() {
        return radius;
    }

    // Mutator for radius
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Cylinder class extending Circle
class Cylinder extends Circle {
    // Private field for height
    private double height;

    // Default constructor
    public Cylinder() {
        super(); // Calls Circle's default constructor
        this.height = 0;
    }

    // Overloaded constructor
    public Cylinder(double radius, double height) {
        super(radius); // Calls Circle's overloaded constructor
        if (height >= 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height cannot be negative.");
        }
    }

    // Accessor for height
    public double getHeight() {
        return height;
    }

    // Mutator for height
    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height cannot be negative.");
        }
    }

    // Method to calculate volume
    public double getVolume() {
        return getArea() * height;
    }
}

// Sphere class extending Circle
class Sphere extends Circle {
    // Default constructor
    public Sphere() {
        super(); // Calls Circle's default constructor
    }

    // Overloaded constructor
    public Sphere(double radius) {
        super(radius); // Calls Circle's overloaded constructor
    }

    // Method to calculate volume
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }
}

// Test program
public class TestShapes {
    public static void main(String[] args) {
        // Create and test a Circle
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.getArea());

        // Create and test a Cylinder
        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Cylinder Volume: " + cylinder.getVolume());

        // Create and test a Sphere
        Sphere sphere = new Sphere(5);
        System.out.println("Sphere Volume: " + sphere.getVolume());
    }
}

