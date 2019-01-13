import java.util.Scanner;

class Sete{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;	
		num=scan.nextInt();

		while(num!=1){

			if (num%2==0) {
				num/=2;
				System.out.println(num);
			}
			else{
				num=3*num+1;
				System.out.println(num);
			}
		}
	}
}