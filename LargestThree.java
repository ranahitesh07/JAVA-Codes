import java.util.*;
class LargestTwo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Three Number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
        if(a>=b && a>=c){
			System.out.print(a+ " is Largest");
		}else if(b>=c && b>=a){
			System.out.print(b+ " is Largest");
		}else{
			System.out.print(c+ " is Largest");
		}
	}
}
			