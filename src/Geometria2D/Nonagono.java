package Geometria2D;

public class Nonagono {
    /*Figura geometrica con 9 lados*/
    double apotema;
    double area;
    double perimetro;
    public Nonagono(){
        apotema=0;
        area=0;
        perimetro=0;
    }

    public double getApotema(double lad) {
        return apotema=calcApot(lad);
    }

    public double getArea(double lad) {
        return area=calcArea(lad);
    }

    public double getPerimetro(double lad) {
        return perimetro=calcPerm(lad);
    }

    private double calcArea(double lad){
        return (9*calcApot(lad)*lad)/2;
    }
    private double calcPerm(double lad){
        return 9*lad;
    }
    private double calcApot(double lad){
        return (lad/2)*(Math.sin(70)/Math.sin(20));
    }
}