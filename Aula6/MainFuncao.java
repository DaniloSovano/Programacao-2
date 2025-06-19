package Aula6;
import java.util.Scanner;

public class MainFuncao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        String menu = """
                      O que você deseja fazer?
                      1 - Calcular raízes da equação de segundro grau
                      2 - Gerar equação a partir das raízes
                      """;
        System.out.println(menu);
        op = sc.nextInt();
        switch(op){
            case 1:
                double[] result;
                System.out.println("Digite os valores das variaveis da equação: ");
                double a,b,c;
                System.out.println("A: ");
                a = sc.nextDouble();
                System.out.println("B: ");
                b = sc.nextDouble();
                System.out.println("C: ");
                c = sc.nextDouble();
                result = Funcao.calcularRaizes(a,b,c);
                System.out.println(String.format("R1 = %.2f\nR2 = %.2f", result[0],result[1]));
            case 2 :
                String equacao;
                System.out.println("Digite as raízes para gerar a equação:");
                double x1,x2;
                System.out.println("Raíz 1: ");
                x1 = sc.nextDouble();
                System.out.println("Raíz 2: ");
                x2 = sc.nextDouble();
                equacao =  Funcao.gerarEquacao(x1,x2);
                System.out.println(equacao);
        }




    }


}
