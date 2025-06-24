public class QuickMergeSort {
    int etapas = 0;
    final int LIMIAR = 10; // define o limite para usar MergeSort

    MergeSort merge = new MergeSort();

    public void trocar(int[] vetor, int a, int b) {
        int temp = vetor[a];
        vetor[a] = vetor[b];
        vetor[b] = temp;
        etapas++;
    }

    public int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivo) {
                i++;
                trocar(vetor, i, j);
            }
        }
        trocar(vetor, i + 1, fim);
        return i + 1;
    }

    public void quickMergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            // Usa MergeSort se o tamanho for pequeno
            if (fim - inicio + 1 <= LIMIAR) {
                merge.mergeSort(vetor, inicio, fim);
                etapas += merge.etapas;
            } else {
                int posicaoPivo = particionar(vetor, inicio, fim);
                quickMergeSort(vetor, inicio, posicaoPivo - 1);
                quickMergeSort(vetor, posicaoPivo + 1, fim);
            }
        }
    }

    public void QuantidadeEtapas() {
        System.out.printf("\nA Quantidade total de etapas é igual à: %d%n", etapas);
    }
}
