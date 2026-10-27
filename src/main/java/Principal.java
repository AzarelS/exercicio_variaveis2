
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtde = 20;
        int num[] = new int[qtde];
        for (int i = 0; i < qtde; i++) {
            System.out.println("Escreva o ("+ i + ") valor do vetor: ");
            num[i] = Integer.parseInt(sc.nextLine());
        }
        
        for (int i = 0; i < qtde-1; i++) {
            for (int j = i+1; j < qtde; j++) {
                if (num[i] > num[j]) {
                    int aux = num[j];
                    num[j] = num[i];
                    num[i] = aux;
                }
            }
        }
        
        System.out.println("Os valores do vetor de forma crescente e: ");
        for (int i = 0; i < qtde; i++) {
            
            System.out.println(num[i]);
            
        }
    }
}
