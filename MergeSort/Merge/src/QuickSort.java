public class QuickSort {
    private int comparacoes = 0;
    private int trocas = 0;

    public void trocar(int[] vetor, int a, int b) {
        int temp = vetor[a];
        vetor[a] = vetor[b];
        vetor[b] = temp;
        trocas++;
    }

    public int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            comparacoes++;
            if (vetor[j] <= pivo) {
                i++;
                trocar(vetor, i, j);
            }
        }
        trocar(vetor, i + 1, fim);
        return i + 1;
    }

    public void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio == 0 && fim == vetor.length - 1) {
            comparacoes = 0;
            trocas = 0;
        }

        if (inicio < fim) {
            int posicaoPivo = particionar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    public void imprimirContadores() {
        System.out.printf("\nQuantidade de Comparações: %d%n", comparacoes);
        System.out.printf("Quantidade de Trocas (Movimentações): %d%n", trocas);
    }
}
