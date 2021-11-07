package Task12;

public class Rectangle {
    private int a;
    private int b;
    private boolean geom;


    public Rectangle(){};

    public Rectangle(int a, int b,boolean geom) {
        this.a = a;
        this.b = b;
        this.geom=geom;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean getGeom() {
        return geom;
    }

    public static void Square(int a, int b){
        int S=a*b;
        System.out.println("Square of Rectangle = "+S);
    }


}
