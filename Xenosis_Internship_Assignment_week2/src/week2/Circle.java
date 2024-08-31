//Write a program that uses constructors to initialize objects and demonstrates method overloading.
package week2;

public class Circle {
	private double radius;

    // Default constructor
    public Circle() {
        this.radius = 1.0; // Default radius
    }

    // Parameterized constructor
    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
            this.radius = 1.0; // Default radius if invalid input
        }
    }
 // Method to set the radius
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
        }
    }

    // Method to get the radius
    public double getRadius() {
        return radius;
    }
 // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Overloaded method to calculate the area with a given radius
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
 // Overloaded method to calculate the circumference with a given radius
    public double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // Method to display the details of the circle
    public void displayCircle() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

	public static void main(String[] args) {
		// Create Circle objects using different constructors
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);

        // Display the circles' details
        System.out.println("Circle1 details (using default constructor):");
        circle1.displayCircle();

        System.out.println("\nCircle2 details (using parameterized constructor):");
        circle2.displayCircle();

        // Use overloaded methods to calculate area and circumference with a different radius
        double radius = 10.0;
        System.out.println("\nCustom calculations with radius " + radius + ":");
        System.out.println("Area: " + circle1.calculateArea(radius));
        System.out.println("Circumference: " + circle1.calculateCircumference(radius));
	}
}
