public class Constants {
    public static final int ZERO;
    public static final int ONE;
    static {
        ZERO=0;
        ONE=1;
        System.out.println("static");
    }
    public Constants(){
        System.out.println("Constructor");
    }
    public static int addNumbers( int x, int y){
        return x+y;
    }

    public static void main(String[] args){
        Constants constants=new Constants();

    }
}
