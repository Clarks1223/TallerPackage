package Geometria3D;

public class PiramideCuadrangular {
    double areaCLatPC;
    double areaBasPC;
    double voluPC;
    public PiramideCuadrangular () {
        areaCLatPC = 0;
        areaBasPC = 0;
        voluPC = 0;
    }

    public double getAreaCLatPC(double base, double alt) {
        return areaCLatPC=calcuAreaLPC(base, alt);
    }

    public double getAreaBasPC(double base) {
        return areaBasPC=calcuAreaBaPC(base);
    }

    public double getVoluPC(double base, double alt) {
        return voluPC=calcVolPC(base, alt);
    }

    private double calcuAreaLPC(double base, double alt) {
        return ((base*alt)/2);
    }
    private double calcuAreaBaPC(double base) {
        return (Math.pow(base,2));
    }
    private double calcVolPC(double base, double alt) {
        return ((Math.pow(base,2)*alt)/3);
    }

}
