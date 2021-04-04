import java.util.Scanner;

public class LAB3_A {
    public static int Rain2(int [] dates, int n, int k, int low, int high, int [] array){
        int mid_element = (low+high)/2;
        if(low <= high){
            array[0] = 1;
            Check_k2(dates, k, mid_element,array);
            if(array[0] >= k){   //we have got the answer but look for optimal one
                mid_element = Rain2(dates,n,k,mid_element + 1,high, array);
            }else if(array[0] < k) {      // go left that is 1 to mid
                mid_element = Rain2(dates, n, k, low ,mid_element - 1, array);
            }
        }


        return mid_element;
    }
    public static void Check_k2(int [] dates, int k, int mid_element, int[] array){
        int a = dates[0];

        for(int i=1; i < dates.length; i++){
            if( (dates[i] - a) >= mid_element){
                array[0] += 1;
                a = dates[i];
            }

        }

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] dates = new int[length];  //dates given
        int k = sc.nextInt();  //number of days their will be rain
        for (int i = 0; i<length ; i++){
            dates[i] = sc.nextInt();
        }
        int[] array = new int[]{1};
        System.out.println(Rain2(dates, dates.length, k, 0, dates[dates.length-1],array));

    }
}
