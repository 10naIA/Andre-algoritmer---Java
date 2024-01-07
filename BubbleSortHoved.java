import java.util.Arrays;
import java.util.Random;

class BubbleSortAlg {

    // HUSK: pseudokode n-2 = n-1 i ekte kode!
    public int[] bubbleSort(int[] A) {
        int n = A.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(A[j] > A[j+1]) {
                    int midlJ = A[j];
                    A[j] = A[j+1];
                    A[j+1] = midlJ;
                }
            }
        }
        return A;
    } 
}

class BubbleSortHoved {
    public static void main(String[] args) {
        int [] testListe = new int[6];
        Random random = new Random();
        for(int i = 0; i < testListe.length; i++) {
            testListe[i] = random.nextInt(100);
        }
        BubbleSortAlg bs = new BubbleSortAlg();
        System.out.println(Arrays.toString(bs.bubbleSort(testListe)));
    }
}
