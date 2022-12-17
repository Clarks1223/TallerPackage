package Geometria3D;

public class Prisma {
    double areaT;
    double areaL;
    double volP;
    public Prisma() {
        areaT = 0;
        areaL = 0;
        volP = 0;
    }

    public double getAreaT(double lado, double base, double altu) {
        return areaT=calcAreaT(lado, base, altu);
    }

    public double getAreaL(double lado, double base, double altu) {
        return areaL=calcAreaL(lado, base, altu);
    }

    public double getVolP(double lado, double base, double altu) {
        return volP=calcVol(lado, base, altu);
    }

    private double calcAreaT(double lado, double base, double altu) {
        return (2*(lado+base)*altu+2*lado*base);
    }
    private double calcAreaL(double lado, double base, double altu) {
        return (2*(lado+base)*altu);
    }
    private double calcVol(double lado, double base, double altu) {
        return (lado*base*altu);
    }
}
