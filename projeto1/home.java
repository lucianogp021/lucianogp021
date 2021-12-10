package projeto1;
import java.util.Scanner;
public class home{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Você tem "+idade+" anos");
    }
    }