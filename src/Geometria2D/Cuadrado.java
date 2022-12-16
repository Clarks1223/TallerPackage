package Geometria2D;

public class Cuadrado {
    double area, perimetro, diagonal;
    public Cuadrado(){
        area=0;
        perimetro=0;
        diagonal=0;
    }

    public double getArea(double lad) {
        area=CalcArea(lad);
        return area;
    }

    public double getPerimetro(double lad) {
        perimetro=CalcPer(lad);
        return perimetro;
    }

    public double getDiagonal(double lad) {
        diagonal=CalcDiag(lad);
        return diagonal;
    }

    private double CalcArea(double lad){
        return Math.pow(lad,2);
    }

    private double CalcPer(double lad){
        return lad+lad+lad+lad;
    }
    private double CalcDiag(double lad){
        return lad*Math.sqrt(2);
    }
}