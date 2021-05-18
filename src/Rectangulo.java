import java.util.Random;
import java.util.Scanner;

public class Rectangulo extends Cuadrilatero{

    private int A1, A2,A3, A4;
    private int a1, a2,a3, a4;
    private int X1,X2,X3,X4;
    private int Y1,Y2,Y3,Y4;
    private double areaR;


    public Rectangulo(String trapecio) {
        super(trapecio);
    }

    public void areaR(){
        System.out.println("El area del rectaqngulo es: ");
        A1=X1*Y2;
        A2=X2*Y3;
        A3=X3*Y4;
        A4=X4*Y1;

        a1=Y1*X2;
        a2=Y2*X3;
        a3=Y3*X4;
        a4=Y4*X1;
    }

    public int getA1() {
        return A1;
    }

    public void setA1(int a1) {
        A1 = a1;
    }

    public int getA2() {
        return A2;
    }

    public void setA2(int a2) {
        A2 = a2;
    }

    public int getA3() {
        return A3;
    }

    public void setA3(int a3) {
        A3 = a3;
    }

    public int getA4() {
        return A4;
    }

    public void setA4(int a4) {
        A4 = a4;
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

    public double getAreaR() {
        return areaR;
    }

    public void setAreaR(double areaR) {
        this.areaR = areaR;
    }
}
