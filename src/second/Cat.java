package second;

public class Cat extends Felidae {
    @Override
    public void play() {
        System.out.println("Cat sleep");
    }
    @Override
    public void sleep(){
        System.out.println("Cat sleet three times");
    }
    @Override
    public String toString(){
        return "Simba";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args){
        Cat cat=new Cat();
        System.out.println(cat.toString());
    }
}
