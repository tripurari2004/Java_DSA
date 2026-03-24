public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();

        Dog d1 = new Dog();
        d1.eat();
        d1.legs = 4;
        System.out.println(d1.legs);
    }
}

//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    };
    void breathe(){
        System.out.println("breathes");
    }
}

//Signle level inheritance
//Derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swim in water");
    }
}


//Multi level inheritance
class Mammal extends Animal{
    int legs;
}


class Dog extends Mammal{
    String breed;
}