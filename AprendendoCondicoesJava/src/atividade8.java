import java.util.Scanner;
public class Atividade8 {
    //pedir para o usuario inserir uma temperatura
    //imprimir se for >30 QUENTE entre 15 e 30 AGRADAVEL <15 FRIO
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura = 0;

        System.out.println("digite a temperatura: ");
        temperatura = sc.nextDouble();

        if (temperatura >30) {
            System.out.println(" quentee!");
        }
        else if (temperatura <15 && temperatura >=30) {
            System.out.println(" agradável");
        }
        else if (temperatura <15){
            System.out.println("frio");
        }
    }
}