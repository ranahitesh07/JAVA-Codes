import java.util.*;
class Binary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=sc.nextInt();
		String binary= "";
		while(n>0){
			binary= (n%2)+binary;
            n=n/2;
        }
        System.out.print("Binary: "+binary);
	}
}	