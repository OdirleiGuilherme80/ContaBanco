import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
        //mensagem de boas-vindas ao cliente
           System.out.println("Bem-Vindo ao Banco Java Finance, vamos realizar seu cadastro agora?");
           System.out.println("Para isso basta seguir as instruções, é muito facíl !!\n");

           // Iniciando processo de cadastro de dados

           System.out.println("Começaremos primeiramente pelo seu nome e sobrenome \n");

           System.out.println("Digite seu Nome:  \n");
           String nome = scanner.next();
           System.out.println("Digite seu Sobrenome:  \n");
           String sobrenome = scanner.next();

           System.out.println("número da agência:  \n");
           int agency = scanner.nextInt();

           System.out.println("insira número da conta corrente: \n");
           int contabanco = scanner.nextInt();

           System.out.println("digite o valor a depositar:  \n");
           Double saldo = scanner.nextDouble();
            
           // fim de cadastro e parabenização por conclusão
           System.out.println("Parabéns cadastro realizado com sucesso! Segue algumas informações importantes! \n");

           // connfirmação de dados cadastrais em tela e saldo inicial disponível

           System.out.println("Olá " + nome + " " +sobrenome + ", obrigado por criar uma conta em nosso banco, sua Agência Bancaria é " + agency + ", conta corrente " + contabanco + ", seu saldo atualizado é de " + saldo + " já disponível para saques e transações.");
    }







       
    }
}
