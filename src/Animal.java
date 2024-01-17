public abstract class Animal {

    private String species;

    public Animal(String species) {
    }

    abstract void makeSound();

    void displayInfo(){
        System.out.println("Species is " + species);
    }

}
