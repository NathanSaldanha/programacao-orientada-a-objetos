import java.util.Scanner;

class Oito{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num =scan.nextInt();   
  
        for (int i = 1; i <= num; i++){   
            for (int x = 1; x <= i; x++){   
                System.out.print((i*x) + " ");   
            }  
   
            System.out.println("");   
        }   
    }
	
}