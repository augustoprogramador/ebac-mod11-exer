import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boletim bol = new Boletim();
        double[] notas = new double[4];

        for (int i = 0; i < 4; i++) {
            String str = String.format("Informe a %dª nota do aluno", i + 1);
            System.out.println(str);
            notas[i] = scan.nextDouble();
        }

        bol.setNotas(notas);
        bol.calculaMedia();
    }
}