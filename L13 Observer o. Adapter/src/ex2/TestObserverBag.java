package ex2;

public class TestObserverBag {
    public static void main(String[] args) {
        Observer ob1 = new MyObserver();

        ObservableBag obsBag = new ObservableBag();
        obsBag.registerObserver(ob1);


        obsBag.addString("Kinderaeg");
        obsBag.addString("Gulleroed");
        obsBag.addString("Kinderaeg");
        obsBag.addString("Gulleroed");
        obsBag.addString("Maelk");
        obsBag.addString("Maelk");
        obsBag.addString("Maelk");
        obsBag.addString("Maelk");
        obsBag.removeString("Maelk");
        obsBag.addString("Pepsi Max");
        obsBag.addString("Pepsi Max");
        obsBag.addString("Pepsi Max");
        obsBag.addString("Pepsi Max");
        obsBag.addString("Pepsi Max");

        System.out.println("Antal af vare: " + obsBag.getCount("Gulleroed"));
        System.out.println("Antal af vare: " + obsBag.getCount("Pepsi Max"));
        System.out.println();


    }
}
