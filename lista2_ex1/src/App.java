import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double n1 = ler.nextDouble();
        System.out.println("");

        System.out.print("Digite outro numero: ");
        double n2 = ler.nextDouble();
        System.out.println("");

        if (n1 > n2){
            System.out.println(n1);
        }
        else{
            System.out.println(n2);
        }

    }
}
