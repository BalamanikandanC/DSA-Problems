import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Boolean[] flag=new Boolean[10]; //Instead of using an array flag to track seen digits, use a HashSet which allows for O(1) average-time complexity for both insertion and lookup operations.
        Arrays.fill(flag,false);
        int[] array=new int[]{111,222,444,577,339};
        int temp;
        int newArraySize=0;
        for(int i=0;i<array.length;i++){
            temp=array[i];
            while(temp!=0){
                int r=temp%10;
                if(flag[r]==false){
                    flag[r]=true;
                    newArraySize++;
                }
                temp=temp/10;
            }
        }
        int[] newArray=new int[newArraySize];
        for(int j=0,h=0;j<flag.length;j++){
            if(flag[j]==true)newArray[h++]=j;
        }
        for(int i=0;i<newArray.length;i++)
        {
            System.out.println(newArray[i]);
        }
    }
}