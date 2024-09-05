import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

      Scanner scanner = new Scanner(System.in);

      
      
      System.out.println("Seja bem vindo,ao seu banco! \nPor favor, digite as informações corretas para criar a conta ");

      System.out.println("Digite seu primeiro nome: ");
      String nomeCliente = scanner.next();

      System.out.println("Digite seu sobrenome: ");
      String sobrenomeCliente = scanner.next();

      System.out.println("Digite seu numero da conta: ");
      int numeroConta = scanner.nextInt();

      System.out.println("Digite seu numero da sua agência: ");
      int agencia = scanner.nextInt();

      System.out.println("Digite seu numero de seu saldo: ");
      double saldo = scanner.nextDouble();


      System.out.println("Olá, "+nomeCliente.concat(" ").concat(sobrenomeCliente) + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +numeroConta+ " e seu saldo "+saldo+" já está disponível para saque!" );
      

      




    }
}
