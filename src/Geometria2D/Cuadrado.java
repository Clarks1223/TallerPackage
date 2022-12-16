package Geometria2D;

public class Cuadrado {
    double area, perimetro, diagonal;
    public Cuadrado(){
        area=0;
        perimetro=0;
        diagonal=0;
    }

    public double getArea(double lad) {
        return area=CalcArea(lad);
    }

    public double getPerimetro(double lad) {
        return perimetro=CalcPer(lad);
    }

    public double getDiagonal(double lad) {
        return diagonal=CalcDiag(lad);
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