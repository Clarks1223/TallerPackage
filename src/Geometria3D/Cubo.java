package Geometria3D;

public class Cubo {
    double area;
    double volumen;
    double diagonalMayor;
    public Cubo() {
        area = 0;
        volumen = 0;
        diagonalMayor = 0;
    }

    public double getAreaC(double lad) {
        return area=calcularArea(lad);
    }

    public double getVolumen(double lad) {
        return volumen=calcularVol(lad);
    }

    public double getDiagonalMayor(double lad) {
        return diagonalMayor=calcularDgM(lad);
    }

    private double calcularArea(double lad) {
        return (Math.pow(lad,3));
    }
    private double calcularVol(double lad) {
        return (6*Math.pow(lad,2));
    }
    private double calcularDgM(double lad) {
        return (lad*Math.sqrt(3));
    }
}
