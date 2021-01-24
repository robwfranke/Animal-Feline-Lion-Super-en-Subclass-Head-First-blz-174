package package_rob.nl;

public class Lion extends Feline {
//    standaard constructor


    public Lion() {
    }

    @Override
    public void makeNoise() {
//        super.makeNoise(); deze niet gebruiken, anders noise van animal
        System.out.println("Leeuw brullen");
    }

    @Override
    public void eat() {

        System.out.println("lion food");    }
}
