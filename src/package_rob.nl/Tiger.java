package package_rob.nl;

public class Tiger extends Feline{

    //    standaard constructor


    public Tiger() {
    }

    @Override
    public void makeNoise() {
//        super.makeNoise(); deze niet gebruiken, anders noise van animal
        System.out.println("Tijger brullen");
    }

    @Override
    public void eat() {
//        super.eat();

        System.out.println("tiger food");
    }
}
