
interface Flyable {
    void Fly();
}
interface Swimmable {
    void swim();
}
class  Duck implements Flyable,Swimmable {

    @Override
    public void Fly() {
        System.out.println("duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("duck is swimming");
    }
}



public class AbstractPractice1 {
    public static void main(String [] args) {
        Duck duck = new Duck();
        duck.Fly();
        duck.swim();
    }
}
