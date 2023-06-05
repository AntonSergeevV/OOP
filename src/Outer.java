public class Outer {
    private int outerVar = 3;

    public void printOuter(Inner inner) {
        System.out.println(this.outerVar);
        System.out.println(inner.innerVar);
    }

    public class Inner {
        private int innerVar = 33;

        private void printInner() {
            System.out.println(innerVar);
            System.out.println(Outer.this.outerVar);
        }
    }
    public static void main(String [ ] args){
        Outer outer=new Outer();
        Inner inner=outer.new Inner();
        outer.printOuter(inner);
    }
}
