public class Circle {
    // Private data fields
    private double radius;
    private double diameter;
    private double area;

    // Constructor
    public Circle() {
        this.radius = 1.0;
        calculateDiameterAndArea();
    }

    // Overloaded constructor to allow setting the radius at creation
    public Circle(double radius) {
        this.radius = radius;
        calculateDiameterAndArea();
    }

    // Method to set the radius and update diameter and area
    public void setRadius(double radius) {
        this.radius = radius;
        calculateDiameterAndArea();
    }

    // Method to get the radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate the diameter and area based on the radius
    private void calculateDiameterAndArea() {
        this.diameter = 2 * radius;
        this.area = Math.PI * Math.pow(radius, 2);
    }

    // Method to get the diameter
    public double getDiameter() {
        return diameter;
    }

    // Method to get the area
    public double getArea() {
        return area;
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        // Declare and initialize Circle objects
        Circle circleA = new Circle(1.5); // Small radius
        Circle circleB = new Circle(1500.5); // Large radius
        Circle circleC = new Circle(); // Default radius = 1.0
        
        // Set radius of circleC to 1.0
        circleC.setRadius(1.0);

        // Display the values of all Circle objects
        System.out.println("The area of a is " + circleA.getArea());
        System.out.println("The diameter of a is " + circleA.getDiameter());

        System.out.println("The area of b is " + circleB.getArea());
        System.out.println("The diameter of b is " + circleB.getDiameter());

        System.out.println("The area of c is " + circleC.getArea());
        System.out.println("The diameter of c is " + circleC.getDiameter());
    }
}

