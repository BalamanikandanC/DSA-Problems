import java.util.Arrays;
public class Main {

        public static void main (String[] args ){
            Long[] arr=new Long[]{1L,2L,3L,5L,4L,7L,10L};
            sortIt(arr);
            for(Long n:arr) System.out.print(n+" ");
        }
        public static void sortIt(Long[] arr) {
            // Transform odd numbers to negative to facilitate descending order sorting
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    arr[i] *= -1;
                }
            }

            // Sort the entire array
            Arrays.sort(arr);

            // Restore odd numbers to positive (undo the negative transformation)
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    arr[i] *= -1;
                }
            }
        }
}