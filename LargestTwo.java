import java.util.*;
class LargestTwo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two Number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b){
			System.out.print(a+ " is Largest");
		}else{
			System.out.print(b+ " is Largest");
		}
	}
}