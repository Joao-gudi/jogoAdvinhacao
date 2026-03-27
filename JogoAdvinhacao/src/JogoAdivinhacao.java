import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int geradorNumeros = new Random().nextInt(100);
        int tentativas = 0;
        int chute = 0;



        while (tentativas < 5){
            System.out.println("Digite um numero para advinhar: ");
            chute = leitura.nextInt();
            tentativas++;

            if(chute == geradorNumeros){
                System.out.println("Parabéns, você acertou o numero secreto com: " + tentativas + " tentativas");
                break;
            }else if (chute > geradorNumeros) {
                System.out.println("O numero secreto é menor!");

            }else {
                System.out.println("O numero secreto é maior");
            }

        }


        if (tentativas == 5 && chute != geradorNumeros){
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + geradorNumeros);
        }




    }
}