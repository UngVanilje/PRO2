package ex2adapter;

public class AlcoBev{
    private double theNetprice;
    private String theDescription;

    public AlcoBev(double theNetprice, String theDescription) {
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
        if(theNetprice > 150)
            return price = theNetprice * 2.2;
        else
            return theNetprice * 1.8;
    }
}
