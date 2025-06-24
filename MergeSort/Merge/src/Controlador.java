public class Controlador {
    public void Merge() {
        MergeSort merge = new MergeSort();
        int[] array = {85, 12, 3, 99, 4, 27, 65, 32, 19, 87, 11, 45, 67, 23, 9, 56, 74, 31, 98, 13};
        int n = array.length;

        System.out.print("\nVetor original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        long inicio = System.nanoTime(); // início da medição

        merge.mergeSort(array, 0, n - 1);

        long fim = System.nanoTime(); // fim da medição
        long duracao = fim - inicio;

        System.out.print("\nVetor ordenado Merge: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        merge.QuantidadesEtapas();
        System.out.println("Tempo de execução MergeSort: " + duracao + " ns (" + duracao / 1_000_000.0 + " ms)");
    }

    public void Quick() {
        QuickSort quick = new QuickSort();
        int[] exemplo = {85, 12, 3, 99, 4, 27, 65, 32, 19, 87, 11, 45, 67, 23, 9, 56, 74, 31, 98, 13};
        int n = exemplo.length;

        System.out.print("\nVetor original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(exemplo[i] + " ");
        }
        System.out.println();

        long inicio = System.nanoTime(); // inicia medição de tempo

        quick.quickSort(exemplo, 0, n - 1);

        long fim = System.nanoTime(); // fim da medição
        long duracao = fim - inicio; // tempo total em nanossegundos

        System.out.print("Vetor ordenado Quick: ");
        for (int i = 0; i < n; i++) {
            System.out.print(exemplo[i] + " ");
        }

        quick.QuantidadeEtapas();
        System.out.println("Tempo de execução QuickSort: " + duracao + " ns (" + duracao / 1_000_000.0 + " ms)");
    }
    public void QuickMerge(){
        QuickMergeSort hibrid = new QuickMergeSort();
        int[] exemplo = {85, 12, 3, 99, 4, 27, 65, 32, 19, 87, 11, 45, 67, 23, 9, 56, 74, 31, 98, 13};
        int n = exemplo.length;

        System.out.print("\nVetor original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(exemplo[i] + " ");
        }
        System.out.println();

        long inicio = System.nanoTime(); // inicia medição de tempo

        hibrid.quickMergeSort(exemplo, 0, n - 1);

        long fim = System.nanoTime(); // fim da medição
        long duracao = fim - inicio; // tempo total em nanossegundos

        System.out.print("Vetor ordenado Quick-Merge: ");
        for (int i = 0; i < n; i++) {
            System.out.print(exemplo[i] + " ");
        }

        hibrid.QuantidadeEtapas();
        System.out.println("Tempo de execução Quick-Merge: " + duracao + " ns (" + duracao / 1_000_000.0 + " ms)");
    }
    }


