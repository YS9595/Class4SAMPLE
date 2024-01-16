public class Dog extends Animal {

    //Constructor
    public Dog (String type, String color) {
       super("Dog",color,type);
    }

    //Behaviour
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}
