public class MergeSoft {
    public void Merge(int[] array, int left, int middle, int right){
        //calcula o tamanho das sub-listas
        int n1 = middle-left+1;
        int n2 = right-middle;

        //cria os arrays temporários
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        //copia os dados para arrays temporários
        for( int i =0;i<n1;i++){
            leftArray[i] = array[left + i];
        }
        for(int j = 0;j<n2;++j){
            rightArray[j] = array[middle +1 +j];
        }
        
        //indices paras sub-listas e o array mesclado
        int i_left=0;
        int j_right=0;
        int k_merged=left;

        //mecla os arrays temporarios para o principal
        while(i_left< n1 && j_right <n2) 
        {
            if(leftArray[i_left]<=rightArray[j_right]){
                array[k_merged] = leftArray[i_left];
                i_left++;
            }else{
                array[k_merged]=rightArray[j_right];
                j_right++;
            }
            k_merged++;
        }
        //copia os elementos restantes da sub-lista esquerda
        while (i_left<n1){
            array[k_merged]=leftArray[i_left];
            i_left++;
            k_merged++;
        }
        //copia os elementos restantes da sub-lista direita
        while (j_right<n2){
            array[k_merged] = rightArray[j_right];
            j_right++;
            k_merged++;
        }

    }
    public void mergeSort(int[]array,int left,int right){
        if(left<right){
            int middle=left+(right - left)/2; //encontra o meio do array
            
            mergeSort(array,left,middle); //Ordena a primeira metade recursivamente
            mergeSort(array,middle+1,right); //Ordena a segunda metade recursivamente

            Merge(array,left,middle,right); //mescla as duas metades já ordenas

        }
    }

}
