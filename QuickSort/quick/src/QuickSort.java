public class QuickSort {
    public void trocar(int[] vetor,int a,int b){ // função para trocar dois elementos de posição
        int temp =vetor[a];
        vetor[a] = vetor[b];
        vetor[b] = temp;
    }
    public  int particionar(int[] vetor,int inicio, int fim){ // função para particionar o vetor e retornar a posição do pivô
        int pivo =vetor[fim];
        int i = inicio-1;

        for(int j = inicio; j<fim;j++){
            if(vetor[j]<=pivo){ // se o elemento atual for menor ou igual ao pivô
                i++; // avança a fronteira para incluir mais um elemento menor
                trocar(vetor,i,j); // coloca o elemento menor na região correta, trocando com a posição 'i'
            }
        }
        trocar(vetor,i+1,fim); // coloca o pivô em sua posição correta no meio dos menores e maiores
        return i+1; // retorna o índice onde o pivô ficou fixado
    }
    public void quickSort(int[] vetor, int inicio, int fim){
        if(inicio<fim){ // verifica se ainda há pelo menos dois elementos para ordenar
            int posicaoPivo = particionar(vetor,inicio,fim); // particiona e obtém a posição final do pivô
            quickSort(vetor,inicio,posicaoPivo-1); // ordena recursivamente a parte à esquerda do pivô
            quickSort(vetor,posicaoPivo+1,fim); // ordena recursivamente a parte à direita do pivô
        }
    }

}
