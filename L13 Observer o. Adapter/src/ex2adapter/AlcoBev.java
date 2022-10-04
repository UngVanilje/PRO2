package ex2adapter;

public class AlcoBev extends Item{
    private double theNetprice;
    private String theDescription;

    public AlcoBev(double netprice, String name, double theNetprice, String theDescription) {
        super(netprice, name);
        this.theNetprice = theNetprice;
        this.theDescription = theDescription;
    }

    public double getTheNetprice() {
        return theNetprice;
    }

    public void setTheNetprice(double theNetprice) {
        this.theNetprice = theNetprice;
    }

    public String getTheDescription() {
        return theDescription;
    }

    public void setTheDescription(String theDescription) {
        this.theDescription = theDescription;
    }

    public double getVat(){
        double price = 0;
        if(getNetprice() > 150)
            return price = getNetprice() * 2.2;
        else
            return getNetprice() * 1.8;
    }
}
