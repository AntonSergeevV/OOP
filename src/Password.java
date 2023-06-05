public class Password {
    private int password;

    public void setPassword(int newPassword){
        password=newPassword;
    }
    public boolean checkPassword(int guessPassword){
        return password==guessPassword;

    }
    public static void main(String []args){
        Password password=new Password();
        password.setPassword(123);
        System.out.println(password.checkPassword(123));
    }
}
