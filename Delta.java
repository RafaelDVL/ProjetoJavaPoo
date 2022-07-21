package eq2;

public class Delta extends Equacao {

    private double delta;

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }


    //delta = ((b*b)-(4*a*c))

    public void formDelta(){
        delta = ((getB()*getB())-(4*getA()*getC()));
    };


}
