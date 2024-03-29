package ex2;
public class Triangle extends FigureComponent {

    private String name;
    private double length;

    public Triangle(String name, double length) {
        super(name);
        this.name = name;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        System.out.printf("Name: %s Circ: %.2f\n", getName(), calcCirc());
    }

    @Override
    public double calcCirc() {
        return 3*length;
    }
}