public class MainUniao {
    public static void main(String[] args) {
        int[] arrayA = {10,10,10,10,10,10,10,20};
        int[] arrayB = {1,1,1,2,2,2,3,3,8,1,2,2,5,0,25,};

        System.out.print("Array A: ");
        for (int val : arrayA) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.print("Array B: ");
        for (int val : arrayB) {
            System.out.print(val + " ");
        }


        int[] uniao= UniaoOrdenada.realizarUniao(arrayA, arrayB);

        System.out.println("\nUnião: ");
        for (int val : uniao) {
            System.out.print(val + " ");
        }
    }
}


