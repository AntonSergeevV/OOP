package second;

public class CatCol extends Felidae implements Color, Owner {
    @Override
    public int getColor() {
        return Color.BLACK;
    }

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void sleep() {

    }

    @Override
    public String getOwner() {
        return "Nope";
    }
}
