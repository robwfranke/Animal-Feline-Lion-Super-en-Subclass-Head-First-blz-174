package package_rob.nl;

public class Dog extends Canine {

    public Dog() {
    }

    @Override
    public void makeNoise() {
//        super.makeNoise();
        System.out.println("dog geluid");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("dog voedsel");
    }
}
