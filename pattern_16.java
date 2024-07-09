import java.util.Scanner;  
   
public class pattern_16 {  
    /* Driver Code */  
    public static void main(String ar[]){  
        try(Scanner sc = new Scanner(System.in)){
   
            System.out.println("Enter number of rows for the Pyramid:");  
    
            int rows = sc.nextInt();  

            int rowCount = 1;  
    
            System.out.println("Pyramid Pattern: ");  

            for (int i = rows; i > 0; i--)  {
                for (int j = 1; j <= i; j++)  
                {  
                    System.out.print(" ");  
                }  
                for (int j = 1; j <= rowCount; j++)  
                {  
                    System.out.print(rowCount+" ");  
                }  
                System.out.println();  
    
                rowCount++;  
            }  
        }
    }  
} 