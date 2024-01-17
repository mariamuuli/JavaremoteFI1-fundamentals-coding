public class Bird extends Animal {

    private boolean CanFly;


    public Bird (String species, boolean canfly){
        super(species);
        this.CanFly = canfly;

    }
    @Override
    void makeSound() {

    }
}