package ex2adapter;

public class ElApplication extends Item {

    public ElApplication(double netprice, String name){
        super(netprice, name);
    }


    @Override
    public double calcVAT() {
        double vat = getNetprice() * 1.30;
        if(vat < 3)
            return getNetprice() + 3.0;
        else
            return getNetprice() * 1.70;
    }
}

