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
        area=CalcArea(rad);
        return area;
    }

    public double getPerimetro(double rad) {
        perimetro=CalcPer(rad);
        return perimetro;
    }

    public double getDiametro(double rad) {
        diametro=CalDiam(rad);
        return diametro;
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
