package Geometria2D;

public class Endecagono {
    /*Figura geometrica con 11 lados*/
    double apotema;
    double area;
    double perimetro;
    public Endecagono(){
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
        return (11*calcApot(lad)*lad)/2;
    }
    private double calcPerm(double lad){
        return 11*lad;
    }
    private double calcApot(double lad){
        return (lad/2)*(Math.sin(9*Math.PI/22)/Math.sin(Math.PI/11));
    }
}
