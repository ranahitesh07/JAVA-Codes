import java.util.*;
class Search{
	public static void main(String args[]){
		int arr[]=new int[30];
		int size, index;
		int key, c=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size of the array: ");
		size =sc.nextInt();
		System.out.print("Enter the Values: ");
		for(index=0;index<size;index++){
			arr[index]=sc.nextInt();
		}
		System.out.print("Enter the element to search: ");
		key=sc.nextInt();
		for(index=0;index<size;index++){
			if(arr[index]==key){
				c++;
			}
		}
        if(c==0){
            System.out.print("Element is not present\n");
        }else{
            System.out.print("Element is present\n");	
		}
    }
}	