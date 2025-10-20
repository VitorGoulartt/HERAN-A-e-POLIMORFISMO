import Empresa.Produto;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Produto produto1 = new Produto("lampada", "kian", 89090, 10, 15);

        System.out.println("safada?");
        produto1.alterarquantidade(sc.nextInt());
        sc.close();
    }
}
