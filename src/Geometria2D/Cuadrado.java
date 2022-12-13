package Geometria2D;

public class Cuadrado {
    double lado;
    public Cuadrado(){
        lado=0;
    }
    public double CalcArea(double lad){
        return Math.pow(lad,2);
    }

    public double CalcPEr(double lad){
        return lad+lad+lad+lad;
    }
    public double CalcDiag(double lad){
        return lad*Math.sqrt(2);
    }
}