public class Uniao {
    public static int[] realizarUniao(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];

        for(int i = 0; i < array3.length; i++) {
            if(i < array1.length){
                array3[i] = array1[i];
            }else{
                array3[i] = array2[i-array1.length];
            }
        }
        array3 = removerDuplicatas(array3);
        return array3;

    }
    public static int[] removerDuplicatas(int[] array) {
        int[] arrayDeUnicos = new int[array.length];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            int valorAtual = array[i];
            boolean duplicado = false;

            for (int j = 0; j < contador; j++) {
                if (arrayDeUnicos[j] == valorAtual) {
                    duplicado = true;
                    break;
                }
            }

            if (!duplicado) {
                arrayDeUnicos[contador] = valorAtual;
                contador++;
            }
        }

        int[] arraySet = new int[contador];
        for (int i = 0; i < contador; i++) {
            arraySet[i] = arrayDeUnicos[i];
        }

        return arraySet;
    }

}