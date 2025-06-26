public class Controlador {
    public void Merge() {
        MergeSort merge = new MergeSort();
        int[] array = {85, 12, 3, 99, 4, 27, 65, 32, 19, 87, 11, 45, 67, 23, 9, 56, 74, 31, 98, 13};

        System.out.print("\nVetor original: ");
        for (int num : array) System.out.print(num + " ");

        long inicio = System.nanoTime();
        merge.sort(array, 0, array.length - 1);
        long fim = System.nanoTime();

        System.out.print("\nVetor ordenado Merge: ");
        for (int num : array) System.out.print(num + " ");

        merge.imprimirContadores();
        System.out.println("Tempo de execução MergeSort: " + (fim - inicio) + " ns (" + (fim - inicio) / 1_000_000.0 + " ms)");
    }

    public void Quick() {
        QuickSort quick = new QuickSort();
        int[] array = {85, 12, 3, 99, 4, 27, 65, 32, 19, 87, 11, 45, 67, 23, 9, 56, 74, 31, 98, 13};

        System.out.print("\nVetor original: ");
        for (int num : array) System.out.print(num + " ");

        long inicio = System.nanoTime();
        quick.quickSort(array, 0, array.length - 1);
        long fim = System.nanoTime();

        System.out.print("\nVetor ordenado Quick: ");
        for (int num : array) System.out.print(num + " ");

        quick.imprimirContadores();
        System.out.println("Tempo de execução QuickSort: " + (fim - inicio) + " ns (" + (fim - inicio) / 1_000_000.0 + " ms)");
    }

    public void QuickMerge() {
        QuickMergeSort hibrid = new QuickMergeSort();
        int[] array = {85, 12, 3, 99, 4, 27, 65, 32, 19, 87, 11, 45, 67, 23, 9, 56, 74, 31, 98, 13};

        System.out.print("\nVetor original: ");
        for (int num : array) System.out.print(num + " ");

        long inicio = System.nanoTime();
        hibrid.quickMergeSort(array, 0, array.length - 1);
        long fim = System.nanoTime();

        System.out.print("\nVetor ordenado Quick-Merge: ");
        for (int num : array) System.out.print(num + " ");

        hibrid.imprimirContadores();
        System.out.println("Tempo de execução Quick-Merge: " + (fim - inicio) + " ns (" + (fim - inicio) / 1_000_000.0 + " ms)");
    }
}
