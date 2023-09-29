import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuario
        //Obter pela Scanner os valores digitados no terminal
        //Exibir a mensagem conta criada
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência");
        String Agência = scanner.next();

        System.out.println("Por favor, digite o número da Conta");
        int Numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome");
        String Nome = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome");
        String sobrenome = scanner.next();
        
        
        System.out.println("Seu saldo");
        double saldo = scanner.nextDouble();


        System.out.println(" Olá " + Nome + " " + sobrenome +  " obrigado por criar uma conta em nosso banco sua agência é "  + Agência +  " conta "  + Numero +  " e saldo "  + saldo +  " já está disponível para saque. ");



    }
}
