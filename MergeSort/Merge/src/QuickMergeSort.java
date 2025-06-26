public class QuickMergeSort {
    private int comparacoes = 0;
    private int trocas = 0;
    private final int LIMIAR = 10;

    MergeSort merge = new MergeSort();

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

    public void quickMergeSort(int[] vetor, int inicio, int fim) {
        if (inicio == 0 && fim == vetor.length - 1) {
            comparacoes = 0;
            trocas = 0;
        }

        if (inicio < fim) {
            if (fim - inicio + 1 <= LIMIAR) {
                merge.sort(vetor, inicio, fim);
                comparacoes += merge.getComparacoes();
                trocas += merge.getTrocas();
            } else {
                int posicaoPivo = particionar(vetor, inicio, fim);
                quickMergeSort(vetor, inicio, posicaoPivo - 1);
                quickMergeSort(vetor, posicaoPivo + 1, fim);
            }
        }
    }

    public void imprimirContadores() {
        System.out.printf("\nQuantidade de Comparações: %d%n", comparacoes);
        System.out.printf("Quantidade de Trocas (Movimentações): %d%n", trocas);
    }
}
