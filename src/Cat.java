public class Cat extends Felidae{

    public Cat(String name){
        super(name);
    }
    public void printName(){
        System.out.println(super.name);
        super.eat();
    }
    public void play(){
        System.out.println("Cat play");
    }
    public void sleep(){
        System.out.println("Cat sleep");
    }
    public void catPlay(){
        System.out.println("Cat play");
    }
}
