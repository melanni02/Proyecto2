import com.sun.scenario.effect.impl.prism.PrImage;

import java.util.Scanner;

public class Trapecio extends Cuadrilatero{

    private int C1, C2,C3, C4;
    private int c1, c2,c3, c4;
    private int X1,X2,X3,X4;
    private int Y1,Y2,Y3,Y4;
    private double areaT;

    public void areaT(){
        System.out.println("El area del trapecio es: ");
        C1=X1*Y4;
        C2=X4*Y3;
        C3=X3*Y2;
        C4=X2*Y1;

        c1=Y1*X4;
        c2=Y4*X3;
        c3=Y3*X2;
        c4=Y2*X1;
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

    public int getC1() {
        return C1;
    }

    public void setC1(int c1) {
        C1 = c1;
    }

    public int getC2() {
        return C2;
    }

    public void setC2(int c2) {
        C2 = c2;
    }

    public int getC3() {
        return C3;
    }

    public void setC3(int c3) {
        C3 = c3;
    }

    public int getC4() {
        return C4;
    }

    public void setC4(int c4) {
        C4 = c4;
    }

    public Trapecio(String trapecio) {
        super(trapecio);

    }
}


