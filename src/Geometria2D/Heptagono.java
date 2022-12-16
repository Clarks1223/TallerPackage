package Geometria2D;

public class Heptagono {
    /*Figura geometrica con 7 lados*/
    double area, perimetro, apotema;
    public Heptagono(){
        area=0;
        perimetro=0;
        apotema=0;
    }
    public double getArea(double lad) {
        return area=CalcArea(lad);
    }

    public double getPerimetro(double lad) {
        return perimetro=CalcPer(lad);
    }

    public double getApotema(double lad) {
        return apotema=CalcApote(lad);
    }

    private double CalcApote(double lad){
        return Math.sqrt(3*(lad/2))/2;
    }
    private double CalcArea(double lad){
        return (CalcPer(lad)*CalcApote(lad))/2;
    }
    private double CalcPer(double lad){
        return lad+lad+lad+lad+lad+lad;
    }
}