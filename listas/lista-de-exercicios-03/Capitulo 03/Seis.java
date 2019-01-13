class Seis{

	public static void main(String[] args) {

		int result=0,n=0,n1=1;

		while(result<=100) {
			
			System.out.println(result);
			result=n+n1;
			n=n1;
			n1=result;
		}
	}
}