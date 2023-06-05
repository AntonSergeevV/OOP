public class Calculator {
    public int addNumbers(int x, int y, int z) {
        int sum = addNumbers(addNumbers(x, y), z);
        return sum;

    }

    public int addNumbers(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public int addNumbers(int x) {
        return x;
    }

    public int addNumbers(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    public TwoVar addMult(int x, int y) {
        int sum = x + y;
        int mult = x * y;
        TwoVar twoVar = new TwoVar();
        twoVar.i1 = sum;
        twoVar.i2 = mult;
        return twoVar;
    }
    public void woofWoof(){
        System.out.println("Woof Woof!");
        woofWoof();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.woofWoof();
    }
}
