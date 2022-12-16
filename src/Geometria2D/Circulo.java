package Geometria2D;

public class Circulo {
    double area;
    double perimetro;
    double diametro;
    public Circulo(){
        area=0;
        perimetro=0;
        diametro=0;
    }

    public double getArea(double rad) {
        return area=CalcArea(rad);
    }

    public double getPerimetro(double rad) {
        return perimetro=CalcPer(rad);
    }

    public double getDiametro(double rad) {
        return diametro=CalDiam(rad);
    }

    private double CalcArea(double rad){
        return Math.PI*Math.pow(rad,2);
    }

    private double CalcPer(double rad){
        return 2*Math.PI*rad;
    }
    private double CalDiam(double rad){
        return 2*(rad);
    }

}
