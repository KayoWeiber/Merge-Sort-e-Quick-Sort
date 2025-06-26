public class MergeSort {
    private int comparacoes = 0;
    private int trocas = 0;

    public int getComparacoes() {
        return comparacoes;
    }

    public int getTrocas() {
        return trocas;
    }

    // Junta duas sublistas já ordenadas
    public void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copia os elementos para arrays temporários
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        int i_left = 0, j_right = 0, k_merged = left;

        // Compara e mescla os elementos na ordem correta
        while (i_left < n1 && j_right < n2) {
            comparacoes++;
            if (leftArray[i_left] <= rightArray[j_right]) {
                array[k_merged] = leftArray[i_left];
                trocas++;
                i_left++;
            } else {
                array[k_merged] = rightArray[j_right];
                trocas++;
                j_right++;
            }
            k_merged++;
        }

        // Copia o restante da sublista esquerda, se houver
        while (i_left < n1) {
            array[k_merged] = leftArray[i_left];
            trocas++;
            i_left++;
            k_merged++;
        }

        // Copia o restante da sublista direita, se houver
        while (j_right < n2) {
            array[k_merged] = rightArray[j_right];
            trocas++;
            j_right++;
            k_merged++;
        }
    }

    // Função principal de ordenação
    public void sort(int[] array, int left, int right) {
        if (left == 0 && right == array.length - 1) {
            comparacoes = 0;
            trocas = 0;
        }

        if (left < right) {
            int middle = left + (right - left) / 2;
            sort(array, left, middle);
            sort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    // Exibe os contadores de comparações e trocas
    public void imprimirContadores() {
        System.out.printf("\nQuantidade de Comparações: %d%n", comparacoes);
        System.out.printf("Quantidade de Trocas (Movimentações): %d%n", trocas);
    }
}
