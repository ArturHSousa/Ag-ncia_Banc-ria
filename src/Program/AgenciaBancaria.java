package Program;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {

    static Scanner sc = new Scanner(System.in); // Scanner declarado como static para poder ser usado em todas as classes "public"
    static ArrayList<Conta> contasBancarias; //lista de contas

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }

    public static void operacoes(){

        System.out.println("____________________________________________");
        System.out.println("         Bem Vindos a nossa agência         ");
        System.out.println("--------------------------------------------");
        System.out.println("         Digite a opção que deseja          ");
        System.out.println("____________________________________________");
        System.out.println("|  Opção 1 - Criar conta    |");
        System.out.println("|  Opção 2 - Depositar      |");
        System.out.println("|  Opção 3 - Sacar          |");
        System.out.println("|  Opção 4 - Trasferir      |");
        System.out.println("|  Opção 5 - Listar         |");
        System.out.println("|  Opção 6 - Sair           |");

        int operacao = sc.nextInt();

        switch (operacao){
            case 1:
                CriarConta();
                break;
            case 2:
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                trasferir();
                break;
            case 5:
                listar();
                break;
            case 6:
                System.out.println("Obrigado por acessar nossa agência!");
                System.exit(0); //break apenas sai do switch case, já o exit finaliza o programa
            default:
                System.out.println("Opção Invalida!");
                operacoes();
        }

    }

    public static void CriarConta() {

        System.out.println("\nNome: ");
        String nome1 = sc.next();

        System.out.println("\nCPF: ");
        String CPF1 = sc.next();

        System.out.println("\nemail: ");
        String email1 = sc.next();

        User cliente = new User(nome1, CPF1, email1); //Instancia a classe "User" dentro da classe "CriarConta" para Assimilar as Strings nome, CPF e email da User para essa

        Conta conta = new Conta(cliente);

        contasBancarias.add(conta);

        System.out.println("Sua conta foi criada com sucesso!");

        operacoes();
    }

    //Encontrar conta do tipo "Conta" da classe Conta
    public static Conta encontrarConta(int numeroConta){
        Conta conta = null;
        if(contasBancarias.size() > 0){ //Verifica se a contas bancarias
            for(Conta c : contasBancarias){ //Instanciando a conta,   expressao  "c : contasBancarias"  refaz esse "for" para cada conta dentro de "contasBancarias"
                if(c.getNumeroConta() == numeroConta){ //se a conta for igual ao numero da conta digitada
                    conta = c;
                }
            }
        }
        return conta;
    }

    public static void depositar() {
        System.out.println("Número da conta: ");
        int numeroDaConta = sc.nextInt();

        Conta conta = encontrarConta(numeroDaConta); //passar variavel "numeroDaConta" para o metodo "encontrarConta" para que aplique a logica da mesma

        if(conta != null){
            System.out.println("Qual valor deseja depositar? ");
            Double valorDepositar = sc.nextDouble();
            conta.depositar(valorDepositar);
            System.out.println("Valor depositado com sucesso! ");
        }
        else{
            System.out.println(" Conta não encontrada! ");
        }
        operacoes();
    }
}
