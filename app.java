package eq2;

import java.util.Arrays;
import java.util.Scanner;

public class app{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //string d = "test";xl == "test"; string xl = d;

        Delta delta = new Delta();
        Xlinha xl = new Xlinha();

        System.out.println("Digite o valor de a:");
        delta.setA(input.nextDouble());
        xl.setA(delta.getA());

        System.out.println("Digite o valor de b:");
        delta.setB(input.nextDouble());
        xl.setB(delta.getB());

        System.out.println("Digite o valor de c:");
        delta.setC(input.nextDouble());
        xl.setC(delta.getC());

        delta.formDelta();
        xl.setDelta(delta.getDelta());
        System.out.println(" O valor de Delta: " + delta.getDelta());


        if(delta.getDelta() >=0){

            xl.calculaxi();
            xl.calculaxii();
            System.out.println("O valor de x1: " + xl.getXi());
            System.out.println("O valor de x2: " + xl.getXii());

        } else {
            System.out.println("Delta invalido ou menor que zero, não foi possivel calcular as raizes");
        }

    }
}