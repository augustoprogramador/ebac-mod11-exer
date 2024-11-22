public class Boletim {
    double[] notas;

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void calculaMedia() {
        double media = 0;
        for (int i = 0; i < 4; i++) {
            media += notas[i];
        }
        media /= 4;

        System.out.println(media);
        informaAproveitamento(media);
    }

    private void informaAproveitamento(double media) {
        String str = String.format("A média do aluno é: %.2f", media);
        System.out.println(str);
        if (media <= 4.49) {
            System.out.println("O aluno está reprovado!");
            return;
        }
        if (media >= 4.5 && media <= 5.99) {
            System.out.println("O aluno está reprovado!");
            return;
        }
        System.out.println("O aluno está APROVADO!!!");
    }
}
