import java.util.Scanner;

public class Contador{

    public static void main(String[] args) {
        int parametro1;
        int parametro2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro parametro: ");
        parametro1 = sc.nextInt();
        System.out.print("Informe o segundo parametro: ");
        parametro2 = sc.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int begin, int end) throws ParametrosInvalidosException {
        if(begin > end)
            throw new ParametrosInvalidosException();

        for(int i = begin; i <= end; i++)
            System.out.println("Imprimindo o numero " + i);
    }

}

class ParametrosInvalidosException extends Exception {
    @Override
    public String getMessage() {
        return "O primeiro argumento deve menor do que o segundo.";
    }
}
