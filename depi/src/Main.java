public class Animal {
    void eat(){
        System.out.println("eat");
    }
}

class Animal{
    
}

class Dog extends Animal{
    void eat(){
        super.eat();
        System.out.println("eat");
    }
}