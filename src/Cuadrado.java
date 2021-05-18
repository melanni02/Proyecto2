public class Cuadrado extends Cuadrilatero{

    private int B1, B2,B3, B4;
    private int b1, b2,b3, b4;
    private int X1,X2,X3,X4;
    private int Y1,Y2,Y3,Y4;
    private double areaC;


    public Cuadrado(String trapecio) {
        super(trapecio);
    }
    public void areaR(){
        System.out.println("El area del rectaqngulo es: ");
        B1=X1*Y2;
        B2=X2*Y3;
        B3=X3*Y4;
        B4=X4*Y1;

        b1=Y1*X2;
        b2=Y2*X3;
        b3=Y3*X4;
        b4=Y4*X1;
    }

    public int getB1() {
        return B1;
    }

    public void setB1(int b1) {
        B1 = b1;
    }

    public int getB2() {
        return B2;
    }

    public void setB2(int b2) {
        B2 = b2;
    }

    public int getB3() {
        return B3;
    }

    public void setB3(int b3) {
        B3 = b3;
    }

    public int getB4() {
        return B4;
    }

    public void setB4(int b4) {
        B4 = b4;
    }

    public int getX1() {
        return X1;
    }

    public void setX1(int x1) {
        X1 = x1;
    }

    public int getX2() {
        return X2;
    }

    public void setX2(int x2) {
        X2 = x2;
    }

    public int getX3() {
        return X3;
    }

    public void setX3(int x3) {
        X3 = x3;
    }

    public int getX4() {
        return X4;
    }

    public void setX4(int x4) {
        X4 = x4;
    }

    public int getY1() {
        return Y1;
    }

    public void setY1(int y1) {
        Y1 = y1;
    }

    public int getY2() {
        return Y2;
    }

    public void setY2(int y2) {
        Y2 = y2;
    }

    public int getY3() {
        return Y3;
    }

    public void setY3(int y3) {
        Y3 = y3;
    }

    public int getY4() {
        return Y4;
    }

    public void setY4(int y4) {
        Y4 = y4;
    }

    public double getAreaC() {
        return areaC;
    }

    public void setAreaC(double areaC) {
        this.areaC = areaC;
    }
}
