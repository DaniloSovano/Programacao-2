public class MainUniao {
    public static void main(String[] args) {

        int[] lista1 = {2,4,6,8,10};
        int[] lista2 = {1,1,3,5,7,9};
        int[] lista3 = new int[lista1.length + lista2.length];
        for(int i = 0; i < lista3.length; i++) {
            if(i < lista1.length){
                lista3[i] = lista1[i];
            }else{
                lista3[i] = lista2[i-lista2.length+1];
            }
        }
        for (int i = 0; i < lista3.length; i++) {
            if
            System.out.println(lista3[i]);
        }
    }
}
