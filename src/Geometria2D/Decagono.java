package Geometria2D;

public class Decagono {
    /*Figura geometrica con 10 lados*/
    double apotema;
    double area;
    double perimetro;
    public Decagono(){
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
        return 5*calcApot(lad)*lad;
    }
    private double calcPerm(double lad){
        return 10*lad;
    }
    private double calcApot(double lad){
        return (lad/2)*(Math.sin(72)/Math.sin(18));
    }
}