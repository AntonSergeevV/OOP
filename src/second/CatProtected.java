package second;

import first.FelidaeProtected;

public class CatProtected extends FelidaeProtected {

    public void print(){
        System.out.println(super.name+super.age);
    }
}
