public class Main {
    public static void main(String[] args) {
        int[] arr=new int[]{134, 27, 58, 90, 4, 73, 18, 65, 22, 81, 13, 92, 37, 50, 88, 12, 29, 46, 77, 55, 81, 98,
                6, 71, 99, 45, 82, 24, 39, 62, 33, 86, 20, 51, 93, 78, 16, 30, 57, 11, 70, 87, 52, 66, 14, 89, 28,
                95, 47, 74, 84, 3, 53, 63, 85, 10, 31, 61, 19, 21, 96, 44, 69, 40, 76, 67, 1, 48, 97, 41, 26,
                60, 75, 54, 59, 83, 7, 68, 17, 9, 28, 72, 15, 25, 43, 5, 49, 64, 86, 8, 32, 57, 94, 42, 35, 56, 26};
        int currentMinimum,temp;
        for(int i=0;i<arr.length-1;i++){
            currentMinimum=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[currentMinimum]){
                    currentMinimum=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[currentMinimum];
            arr[currentMinimum]=temp;
        }
        for(int n: arr) System.out.print(n+" ");
    }
}