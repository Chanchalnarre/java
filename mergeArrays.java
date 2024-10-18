import java.util.Arrays;

public class mergeArrays{
    public static void main(String[] args) {
        int[] A = {1,2,8,9,};
        int[] B = {3,5,6,7,10};

        int[] C = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        while (i < A.length) {
            C[k++] = A[i++];
        }

        while (j < B.length) {
            C[k++] = B[j++];
        }

        System.out.println("Merged array: " + Arrays.toString(C));
    }
}
