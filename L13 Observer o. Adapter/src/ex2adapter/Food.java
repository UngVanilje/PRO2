package ex2adapter;

public class Food extends Item{

    public Food(double netprice, String name){
        super(netprice, name);
    }

    @Override
    public double calcVAT() {
        return getNetprice() * 1.05;
    }
}
