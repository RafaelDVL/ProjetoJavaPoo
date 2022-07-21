package eq2;

import java.lang.Math;
public class Xlinha extends Delta{

    private double xi;
    private double xii;

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getXii() {
        return xii;
    }

    public void setXii(double xii) {
        this.xii = xii;
    }


    //(-b + Math.sqrt (delta))  / ( 2*a ) equação do x1
    //(-b - Math.sqrt (delta)) / ( 2*a ) equação do x2

    public void calculaxi(){

        xi = ((-getB()+(Math.sqrt(getDelta())))/(getA()*2));
    }
    public void calculaxii(){

        xii = ((-getB()-(Math.sqrt(getDelta())))/(getA()*2));
    }

}
