package Geometria3D;

public class Cono {
    double areaTotal;
    double areaLateral;
    double volumen;
    public Cono() {
        areaLateral = 0;
        areaTotal = 0;
        volumen = 0;
    }

    public double getAreaTotal(double rad, double gen) {
        return areaTotal=calcularAreaTot(rad, gen);
    }

    public double getAreaLateral(double rad, double gen) {
        return areaLateral=calcularAL(rad, gen);
    }

    public double getVolumen(double rad, double alt) {
        return volumen=calcularVol(rad, alt);
    }

    private double calcularAreaTot(double rad, double gen) {
        return ((Math.PI*rad*gen)+(Math.PI*Math.pow(rad,2)));
    }
    private double calcularVol(double rad, double alt) {
        return ((Math.PI*alt*Math.pow(Math.PI,2))/3);
    }
    private double calcularAL(double rad, double gen) {
        return (Math.PI*rad*gen);
    }
}
