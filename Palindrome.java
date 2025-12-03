import java.util.*;
class Palindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=sc.nextInt();
		int temp=n,rev=0;
		while(temp>0){
			rev = rev*10+temp%10;
			temp = temp/10;
		}
		if(n==rev){
			System.out.print(n+" is Palindrome");
		}else{
			System.out.print(n+" is not a Palindrome");
		}
	}
}
			
		