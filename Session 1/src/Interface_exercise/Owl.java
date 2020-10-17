package Interface_exercise;


public class Owl implements IAnimal, IFlyingAnimal {
    public void makeSound() {
//begin of modifiable zone................T/31eff26c-17aa-4bec-a308-a76efc9ee9d9
        System.out.println("The owl hoots");
//end of modifiable zone..................E/31eff26c-17aa-4bec-a308-a76efc9ee9d9
    }

    public void Fly() {
//begin of modifiable zone................T/707ff5f8-136f-4f6e-9a06-96f0ce3916e9
        System.out.println("The owl flies with wings");
//end of modifiable zone..................E/707ff5f8-136f-4f6e-9a06-96f0ce3916e9
    }

}
