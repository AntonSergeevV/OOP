public class Felidae {

    String name;

    public Felidae(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("sleep");
    }
    public void sleep(int howLong){
        System.out.println("Felidae sleep "+howLong);
    }

    public void eat() {
        System.out.println("eat");
    }
    public static void printSleep(Felidae felidae){
        felidae.sleep();
    }

    public static void main(String[] args) {
        Felidae felidae = new Felidae("Cat");
        Felidae cat = new Cat("Cat");
        Felidae tiger = new Tiger("Tiger");
        if (cat instanceof Cat){
            ((Cat)cat).catPlay();
        }
    }
}
