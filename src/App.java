import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner Console_Scanner = new Scanner(System.in);
        System.out.println("enter arrays size : ");
        int array_size = Console_Scanner.nextInt();
        
        System.out.println("enter first array elements: ");
        int[] first_array = Create_Array(array_size);
        
        System.out.println("enter second array elements: ");
        int[] second_array = Create_Array(array_size);

        
        int[] sum = Sum(first_array, second_array, array_size);

        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
    public static int[] Create_Array(int array_size){
        Scanner Console_Scanner = new Scanner(System.in);
        int[] temp = new int[array_size];
        for (int i =0; i < array_size;i++){
            System.out.print("enter next element: ");
            temp[i] = Console_Scanner.nextInt();
        }
        return temp;
    }
    
    public static int[] Sum(int[] first_array,int[] second_array,int array_size){
        int[] sum = new int[array_size];
        for (int i=0; i<array_size; i++){
            sum[i] = first_array[i] + second_array[i];
        }
        return sum;
    }
}
