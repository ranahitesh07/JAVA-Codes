public class MultipleCatch {
    public static void main(String[] args) {
        int arr[]= new int [2];
		try {          
            arr[4] = 5;
        }
		catch (ArithmeticException ob){
			System.out.print("Cannot divided by zero");
		}
		catch (NullPointerException ob){
			System.out.print("Null Value");
		}
		catch (ArrayIndexOutOfBoundsException ob){
			System.out.print("Index is out of bounds");
		}
	}
}
