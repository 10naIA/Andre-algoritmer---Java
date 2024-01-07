import java.util.Arrays;
import java.util.Random;

class SelectionSortAlg {

    // HUSK: pseudokode n-2 = n-1 i ekte kode!
    public int[] selectionSort(int[] A) {
        int n = A.length;
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i+1; j < n; j++) {
                if(A[j] < A[min]) {
                    min = j;
                }
            }
            if(i != min) {
                int midl = A[i];
                A[i] = A[min];
                A[min] = midl;
            }
        }
        return A;
    }
}

class SelectionSortHoved {
    public static void main(String[] args) {
        SelectionSortAlg ss = new SelectionSortAlg();
        int [] testListe = new int[6];
        Random random = new Random();
        for(int i = 0; i < testListe.length; i++) {
            testListe[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(ss.selectionSort(testListe)));
    }
}