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

}