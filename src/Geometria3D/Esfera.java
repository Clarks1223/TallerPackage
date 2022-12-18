package Geometria3D;

public class Esfera {
    double area;
    double volumen;
    double diametr;
    public Esfera() {
        area = 0;
        volumen = 0;
        diametr = 0;
    }
    public double getAreaE(double rad) {
        return area=calcularAreaE(rad);
    }

    public double getVolumen(double rad) {
        return volumen=calcularVolumen(rad);
    }

    public double getDiame(double rad) {
        return diametr=calcularDiame(rad);
    }

    private double calcularAreaE (double rad) {
        return (4*Math.PI*Math.pow(rad,2));
    }
    private double calcularVolumen (double rad) {
        return ((1.3333333)*Math.PI*Math.pow(rad,3));
    }
    private double calcularDiame (double rad) {
        return (rad*2);
    }
}
