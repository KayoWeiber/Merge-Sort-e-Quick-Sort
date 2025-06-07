
public class Main {

    public static void main(String[] args) {
        MergeSoft merge = new MergeSoft();
        int[] array = {85, 12, 3, 99, 4, 27, 65, 32, 19, 87, 11, 45, 67, 23, 9, 56, 74, 31, 98, 13};
        int n = array.length;

        System.out.print("Vetor original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        merge.mergeSort(array, 0, n - 1);

        System.out.print("\nVetor ordenado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
