package Geometria2D;

public class Octagono {
    /*Figura geometrica con 8 lados*/
    double apotema, area, perimetro;
    public Octagono(){
        apotema=0;
        area=0;
        perimetro=0;
    }

    public double getApotema(double lad) {
        return apotema=calcApot(lad);
    }

    public double getArea(double per, double ap) {
        return area=calcArea(per, ap);
    }

    public double getPerimetro(double lad) {
        return perimetro=calcPerm(lad);
    }

    private double calcArea(double per, double apt){
        return (per*apt)/2;
    }
    private double calcPerm(double lad){
        return lad*8;
    }
    private double calcApot(double lad){
        return lad/(2*Math.tan(22.5));
    }
}
