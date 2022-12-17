package Geometria3D;

public class Cilindro {
    double areaLateral;
    double areaTotal;
    double volumen;
    public Cilindro() {
        areaLateral = 0;
        areaTotal = 0;
        volumen = 0;
    }

    public double getAreaLateral(double rad, double alt) {
        return areaLateral=calcularAL(rad,alt);
    }

    public double getAreaTotal(double rad, double alt) {
        return areaTotal=calcularAT(rad,alt);
    }

    public double getVolumen(double rad, double alt) {
        return volumen=calcularVol(rad,alt);
    }

    private double calcularAT(double rad, double alt) {
        return ((2* Math.PI*rad)*(alt*rad));
    }
    private double calcularVol(double rad, double alt) {
        return ((Math.PI*Math.pow(rad,2))*alt);
    }
    private double calcularAL(double rad, double alt) {
        return (2*Math.PI*rad*alt);
    }
}
