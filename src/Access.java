public class Access {
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    private int password;

    private int age = 1;
    public boolean happy=true;
    private void printAge(){
        System.out.println("Age " + this.age);
    }
    public void printPublic(){
        printAge();
    }

}
