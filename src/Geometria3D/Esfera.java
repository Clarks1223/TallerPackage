package Geometria3D;

public class Esfera {
    double area;
    double volumen;
    double radio;
    public Esfera() {
        area = 0;
        volumen = 0;
        radio = 0;
    }
    public double getAreaE(double rad) {
        return area=calcularAreaE(rad);
    }

    public double getVolumen(double rad) {
        return volumen=calcularVolumen(rad);
    }

    public double getRadio(double diam) {
        return radio=calcularRadio(diam);
    }

    private double calcularAreaE (double rad) {
        return (4*Math.PI*Math.pow(rad,2));
    }
    private double calcularVolumen (double rad) {
        return ((1.3333333)*Math.PI*Math.pow(rad,3));
    }
    private double calcularRadio (double diam) {
        return (diam/2);
    }
}
