package package_rob.nl;

public class Main {
    public static void main(String[] args) {

//        make a new Lion

        Lion lionKlaas = new Lion();
        lionKlaas.makeNoise();

        Feline felineTest = new Feline();
        felineTest.roam();

        Tiger tigertje = new Tiger();
        tigertje.eat();
        tigertje.makeNoise();

        Cat catje = new Cat();
        catje.eat();
        catje.makeNoise();

        Hippo dikkeHippo = new Hippo();
        dikkeHippo.eat();
        dikkeHippo.makeNoise();

        Wolf wolfje = new Wolf();
        wolfje.makeNoise();
        wolfje.eat();
        wolfje.roam();

        Dog dogje=new Dog();
        dogje.makeNoise();
        dogje.eat();




//        make array van Animals


        Animal[] ArrayFromAnimals = new Animal[6];
        ArrayFromAnimals[0] = lionKlaas;
        ArrayFromAnimals[1] = tigertje;
        ArrayFromAnimals[2] = catje;
        ArrayFromAnimals[3] = dikkeHippo;
        ArrayFromAnimals[4]= wolfje;
        ArrayFromAnimals[5]=dogje;


    }

}