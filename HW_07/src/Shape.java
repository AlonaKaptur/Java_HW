public class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' + "class='" + getClass() +
                '}';
    }
}
