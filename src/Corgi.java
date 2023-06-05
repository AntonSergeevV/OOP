public class Corgi {

    private int age;
    private boolean happy;

    public Corgi(){
        this(4);
    }

    public Corgi(int age) {
        this.age = age;
    }
    public Corgi(int age,boolean happy){
        this.age=age;
        this.happy=happy;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public boolean isHappy() {
        return happy;
    }

    public int getAge() {
        return this.age;
    }

    public void printAge() {
        System.out.println(this.age);
    }

    public void woofWoof() {
        System.out.println("Woof Woof!");
    }
}
