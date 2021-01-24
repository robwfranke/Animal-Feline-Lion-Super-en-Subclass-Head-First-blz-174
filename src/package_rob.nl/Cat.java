package package_rob.nl;

public class Cat extends Feline {

    //    standaard constructor


    public Cat() {
    }

    @Override
    public void makeNoise() {
//        super.makeNoise(); deze niet gebruiken, anders noise van animal
        System.out.println("Cat miauw");
    }

    @Override
    public void eat() {

        System.out.println("cat brokken");    }
}
