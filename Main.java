package CS102_HW1_TEAMWORK;
import java.util.Random;
import java.util.Scanner;

public class Main {

    // Initial variables
    public static int[] randNumbers; 
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);
    private static int capacity;

    // Main function managing the project
    public static void main(String[] args) {

        System.out.print("Please enter the capacity of the list: ");
        capacity = input.nextInt();
        createList();
        printList(randNumbers); // Use only if you want to take a look at the list
        // Also you can use this method to display every lists program have
        
        // TODO: Here must be for loop that shows menu options 
        // (maybe creating new method and call it in here)

        // Do not forget to close input at the end
        input.close();
    }

    // Creates a list for the user
    public static void createList(){
        randNumbers = new int[capacity]; 
        for(int i=0; i<capacity; i++){
            randNumbers[i] = random.nextInt(100); 
        }
    }

    // Prints the list formatted as you wish
    public static void printList(int[] list){ 
        
        for (int i=0; i<list.length; i++){ 
            System.out.printf("%-3d|", i+1);
        }
        System.out.printf("%n");
        for (int i=0; i<list.length; i++){
            System.out.printf("%-3d|", list[i]); 
        }
        System.out.printf("%n");
    }

    // TODO: diplayMenu method (b)
    //returns min value of the array
    public static int minList(int[] list)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.length;i++)
        {
            if(list[i]<min)
            {
                min=list[i];
            }
        }
        return min;
    }
    //returns max value of the array
     public static int maxList(int[] list)
     {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.length;i++)
        {
            if(list[i]>max)
            {
                max=list[i];
            }
        }
        return max;
     }
    

    public static void averageList (int[] list){ 
        //variables
        double average = 0;
        int sum = 0;

        //calculate the sum of the elemnts in array list
        for(int i = 0; i < list.length; i++){ 
            sum += list[i]; 
        }
        //calculate the average
        average = (double) sum / list.length; 

        //print the difference
        for(int i = 0; i < list.length; i++){
            System.out.printf("%.2f ", (list[i] - average)); 
        }

    }

    //  sumList (e)
    public static void sumList (int [] list){
        int sumOfEven=0;
        int sumOfOdd=0;
        int currentNumber=0;
        for(int i=0; i< list.length; i++){
            currentNumber=list[i];
            if(i%2==0){
            sumOfEven+=currentNumber;
            }
            else{
                sumOfOdd+=currentNumber;
            }
        }
        System.out.println("sum of elements with odd-numbered indexes: "+ sumOfOdd+ "even-numbered indexes: "+sumOfEven);
    }

    
}