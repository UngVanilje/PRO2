package ex2adapter;

public class Food extends Item{

    public Food(){
        super();
    }

    @Override
    public double calcVAT() {
        return getNetprice() * 1.05;
    }
}
