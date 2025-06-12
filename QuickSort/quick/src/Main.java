public class Main {
    public static void main(String[] args) {
        QuickSort quick = new QuickSort();
        int[] exemplo = {85, 12, 3, 99, 4, 27, 65, 32, 19, 87, 11, 45, 67, 23, 9, 56, 74, 31, 98, 13};
        int n= exemplo.length;

        System.out.print("Vetor original: ");
        for(int i=0; i<n;i++){
            System.out.print(exemplo[i]+" ");
        }
        System.out.println();

        quick.quickSort(exemplo,0,n-1);

        System.out.print("Vetor ordenado: ");
        for(int i=0; i<n;i++){
            System.out.print(exemplo[i]+" ");
        }
        quick.QuantidadeEtapas();
    }

}