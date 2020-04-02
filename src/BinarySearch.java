import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
//    private static int[] array;
    private static int array[] = new int[]{ 2,4,7,10,11 };
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Enter the search value:");
        int numbertofind = input.nextInt();
        int hsl=0;

        hsl = binarySearch(numbertofind);
        System.out.println(hsl);
    }

    public static int binarySearch(int item) {
        int counter, num,  first, last, middle,res;
        res=0;
        first = 0;
        num = (array.length)-1;
        last = num - 1;
        middle = (first + last) / 2;
//        System.out.println(Arrays.toString(array));
        while (first <= last) {

            if (array[middle] < item)
                first = middle + 1;
            else if (array[middle] == item) {
                System.out.println(item + " found at location " + (middle + 1) + ".");
//                res=array[middle];
                  res=middle+1;
                break;
//                return array[middle+1];
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last)
            System.out.println(item + " is not found.\n");
            return res;
    }

}
