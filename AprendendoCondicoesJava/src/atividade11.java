[22:13, 01/09/2024] +55 49 9185-2171: import java.util.Scanner;
public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Peça ao usuário para inserir o salário bruto de um funcionário.
        //2. Solicite o número de anos que o funcionário trabalhou na empresa.
        //3. Aplique as seguintes regras de bonificação:
        //    - Para mais de 10 anos de trabalho: bônus de 10% sobre o salário bruto.
        //    - Para entre 5 e 10 anos de trabalho: bônus de 5% sobre o salário bruto.
        //    - Para menos de 5 anos de trabalho: sem bônus.
        //4. Aplique as seguintes regras de desconto de impostos com base no salário bruto:
        //    - Salário bruto acima de R$ 5000.00: 27% de imposto.
        //    - Salário bruto entre R$ 3000.00 e R$ 4999.99: 18% de imposto.
        //    - Salário bruto abaixo de R$ 3000.00: 10% de imposto.
        //5. Calcule o salário líquido considerando o bônus e o desconto de imposto.
        //6. Imprima o salário bruto, o bônus recebido, o imposto descontado e o salário líquido.

        double salarioBruto = 0.0;
        int anosTrabalhados = 0;
        double percentualBonus = 0.0;
        double percentualImposto = 0.0;
        double salarioLiquido = 0.0;
        double valorBonus = 0.0;
        double valorImposto = 0.0;

        System.out.println("Olá, informe-nos o salário bruto do funcionário: ");
        salarioBruto = sc.nextDouble();
        System.out.println("Agora nos diga, por quantos anos ele trabalhou pela empresa: ");
        anosTrabalhados = sc.nextInt();

        if (anosTrabalhados > 10) {
            percentualBonus = 10;
        } else if (anosTrabalhados >= 5 && anosTrabalhados <= 10) {
            percentualBonus = 5;
        } else {
            percentualBonus = 0;
        }

        if (salarioBruto > 5000) {
            percentualImposto = 27;
        } else if (salarioBruto >= 3000 && salarioBruto <= 4999.99) {
            percentualImposto = 18;
        } else {
            percentualImposto = 10;
        }

        valorBonus = (percentualBonus / 100) * salarioBruto;
        valorImposto = (percentualImposto / 100) * salarioBruto;

        salarioLiquido = salarioBruto + valorBonus - valorImposto;

        System.out.println("O salário bruto é: R$ " + salarioBruto);
        System.out.println("O bônus recebido é: R$ " + valorBonus);
        System.out.println("O imposto descontado é: R$ " + valorImposto);
        System.out.println("O salário líquido é: R$ " + salarioLiquido);

    }
}
[22:13, 01/09/2024] +55 49 9185-2171: 11
        [22:14, 01/09/2024] +55 46 9927-5413: Fez a 4?
        [22:14, 01/09/2024] João Pedro: olk
[22:15, 01/09/2024] +55 49 9185-2171: import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //verificação de login
        //criar uma variavel que receba usuario e senha

        String usuario = "alunoUnipar";
        String senha = "1234";

        System.out.println("Digite o nome do usuário");
        usuario = sc.next();

        System.out.println("Digite a senha do usuário *somente números");
        senha = sc.next();

        if (usuario == "alunoUnipar" && senha == "1234"){
            System.out.println("Login realizado com sucesso!");
        }
        else {
            System.out.println("usuario ou senha incorreto");
        }

    }}