import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro: \n");
        int parametro1 = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: \n");
        int parametro2 = terminal.nextInt();

        try{
            contar(parametro1, parametro2);

        }catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();
    }


    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();

        } else {
            int contagem = parametro2 - parametro1;

            for (; contagem > 0; parametro1++) {
                System.out.println(parametro1);
                contagem--;
            }
        }
    }
}