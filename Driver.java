abstract class Bank {
	abstract int getROI();
}

class SBI extends Bank {
	int getROI() {
		return 4;
	}
}

class PNB extends Bank {
	int getROI() {
		return 6;
	}
}

class BOI extends Bank {
	int getROI() {
		return 8;
	}
}

public class Driver {
	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		System.out.println("SBI Rate of Interest : " + b.getROI());
		
		b = new PNB();
		System.out.println("PNB Rate of Interest : " + b.getROI());
		
		b = new BOI();
		System.out.println("BOI Rate of Interest : " + b.getROI());
	}
}
