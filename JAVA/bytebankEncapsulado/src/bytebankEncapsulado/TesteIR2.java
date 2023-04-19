package bytebankEncapsulado;

public class TesteIR2 {

    public static void main(String[] args) {

        double salario = 4500.0;
        double aliquota = 0;
        double deducao = 0;
        double impostoCalculado = 0;

        if(salario >= 1900 && salario <= 2800) {
            aliquota = 0.075;
            deducao = 142;
        }else  if(salario > 2800 && salario <= 3751) {
            aliquota = 0.15;
            deducao = 350;
        }
        else  if(salario > 3751 && salario <= 4664) {
            aliquota = 0.225;
            deducao = 636;
        }
        
        impostoCalculado = salario * aliquota - deducao;
        
        System.out.println("Imposto: " + (salario * aliquota ) + " Deducao: " + deducao);
        System.out.println("Imposto Calculado: " + impostoCalculado);
        System.out.println("Salario Liquido: " + (salario - impostoCalculado));
        
    }
}
