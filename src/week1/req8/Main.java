package week1.req8;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Cat("Fifi", 4, "oval head", "furry tail");
        System.out.println(cat.eat());
        System.out.println(cat.talk());
        System.out.println(cat.walk());

        Animal dog = new Dog();
        System.out.println(dog.eat());
        System.out.println(dog.talk());
        System.out.println(dog.walk());

        Animal duck = new Duck();
        System.out.println(duck.eat());
        System.out.println(duck.talk());
        System.out.println(duck.walk());

        Animal chicken = new Chicken();
        System.out.println(chicken.eat());
        System.out.println(chicken.talk());
        System.out.println(chicken.walk());

    }
}
