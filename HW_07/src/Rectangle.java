public class Rectangle extends Shape {
    private double weight;
    private double height;

    public Rectangle() {
    }

    public Rectangle(String color, double weight, double height) {
        super(color);
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public double calcArea() {
        return weight * height;
    }
}
