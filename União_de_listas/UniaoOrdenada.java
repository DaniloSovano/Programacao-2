public class UniaoOrdenada {
    public static void ordenar(int[] array) {
        int tamanho = array.length;
        for (int i = 0; i < tamanho - 1; i++) {

            int indiceMenor = i;
            for (int j = i + 1; j < tamanho; j++) {
                if (array[j] < array[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int aux = array[indiceMenor];
            array[indiceMenor] = array[i];
            array[i] = aux;
        }
    }


    public static int[] realizarUniao(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];

        for(int i = 0; i < array3.length; i++) {
            if(i < array1.length){
                array3[i] = array1[i];
            }else{
                array3[i] = array2[i-array1.length];
            }
        }
        ordenar(array3);
        array3 = removerDuplicatas(array3);
        return array3;

    }
    public static int[] removerDuplicatas(int[] array) {
        if(array.length == 0){
            return new int[0];
        }

        int contador = 0;
        int[] temp = new int[array.length];

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] != array[i+1]) {
                temp[contador] = array[i];
                contador++;
            }
        }
        temp[contador] = array[array.length - 1];
        contador++;
        int[] arraySet = new int[contador];
        for (int i = 0; i < contador; i++) {
            arraySet[i] = temp[i];
        }

        return arraySet;
    }
}