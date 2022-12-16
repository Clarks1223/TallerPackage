package Geometria2D;

public class Pentagono {
    /*Figura geometrica con 5 lados*/

    double apotema, area, perimetro;
    public Pentagono(){
        apotema=0;
        area=0;
        perimetro=0;
    }

    public double getApotema(double lad) {
        return apotema=CalcApote(lad);
    }

    public double getArea(double lad) {
        return area=CalcArea(lad);
    }

    public double getPerimetro(double lad) {
        return perimetro=CalcPer(lad);
    }

    private double CalcApote(double lad){
        return lad/1.45;
    }
    private double CalcArea(double lad){
        return (5*lad*CalcApote(lad))/2;
    }
    private double CalcPer(double lad){
        return lad+lad+lad+lad+lad;
    }
}
