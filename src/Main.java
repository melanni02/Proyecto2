import java.util.Scanner;

public class Main {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        double X1,X2,X3,X4,Y1,Y2,Y3,Y4, aT,aR,aC,C1,C2,C3,C4,c1,c2,c3,c4, A1,A2,A3, A4, a1,a2,a3,a4,ar,area,
                B1,B2,B3,B4,b1,b2,b3,b4,x1,x2,x3,x4,y1,y2,y3,y4,tx1,tx2,tx3,tx4,TX1,TX2,TX3,TX4,ty1,ty2,ty3,ty4,
                TY1,TY2,TY3,TY4;

        System.out.println("Coordenada Cuadrado 1: ");
        X1= sc.nextDouble();
        Y2=sc.nextDouble();
        System.out.println("Coordenada Cuadrado 2: ");
        X2= sc.nextDouble();
        Y3=sc.nextDouble();
        System.out.println("Coordenada Cuadrado 3: ");
        X3= sc.nextDouble();
        Y4=sc.nextDouble();
        System.out.println("Coordenada Cuadrado 4: ");
        X4= sc.nextDouble();
        Y1=sc.nextDouble();

        b1=Y1*X2;
        b2=Y2*X3;
        b3=Y3*X4;
        b4=Y4*X1;
        System.out.println("____________________________________");
        System.out.println("Coordenada Rectangulo 1: ");
        x1= sc.nextDouble();
        y2=sc.nextDouble();
        System.out.println("Coordenada Rectangulo 2: ");
        x2= sc.nextDouble();
        y3=sc.nextDouble();
        System.out.println("Coordenada Rectangulo 3: ");
        x3= sc.nextDouble();
        y4=sc.nextDouble();
        System.out.println("Coordenada Rectangulo 4: ");
        x4= sc.nextDouble();
        y1=sc.nextDouble();

        a1=y1*x2;
        a2=y2*x3;
        a3=y3*x4;
        a4=y4*x1;

        System.out.println("________________________________________");
        System.out.println("Ingresa la coordenada Trapecio 1: ");
        TX1=sc.nextDouble();
        TY4=sc.nextDouble();
        System.out.println("Ingresa la coordenada Trapecio 2: ");
        TX4=sc.nextDouble();
        TY3=sc.nextDouble();
        System.out.println("Ingresa la coordenada Trapecio 3:");
        TX3=sc.nextDouble();
        TY2=sc.nextDouble();
        System.out.println("Ingresa la coordenada Trapecio 4:");
        TX2=sc.nextDouble();
        TY1=sc.nextDouble();

        c1=Y1*X4;
        c2=Y4*X3;
        c3=Y3*X2;
        c4=Y2*X1;

        aC=(X1*Y2)+(X2*Y3)+(X3*Y4)+(X4*Y1)-(Y1*X2)+(Y2*X3)+(Y3*X4)+(Y4*X1)/2;
        System.out.println("El area del cuadrado es: "+aC);

        aR=(x1*y2)+(x2*y3)+(x3*y4)+(x4*y1)-(y1*x2)+(y2*x3)+(y3*x4)+(y4*x1)/2;
        System.out.println("El area del rectangulo es: "+aR);

       aT=(X1*Y4)+(X4*Y3)+(X3*Y2)+(X2*Y1)-(Y1*X4)+(Y4*X3)+(Y3*X2)+(Y2*X1)/2;
        System.out.println("El area del trapecio es: "+ aT);
    }
}
