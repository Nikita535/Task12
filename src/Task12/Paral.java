package Task12;

public class Paral extends Rectangle{
     private int c;




    public Paral(int a, int b, int c,boolean geom) {
        //констркутор базового класса
        super(a, b,geom);
        this.c = c;
    }

    public int getC() {
        return c;
    }



    public void setC(int c) {
        this.c = c;
    }

    public static void Square(int a, int b, int c){
        int S=2*(a*b+b*c+a*c);
        System.out.println("Square of Paral = "+S);
    }

}
