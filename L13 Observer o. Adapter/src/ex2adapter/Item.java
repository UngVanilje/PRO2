package ex2adapter;

public class Item {
    private double netprice;
    private String name;

    public Item(double netprice, String name) {
        this.netprice = netprice;
        this.name = name;
    }

    public double getNetprice() {
        return netprice;
    }

    public void setNetprice(double netprice) {
        this.netprice = netprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double calcVAT(){
        return netprice;
    }
}


