class Armstrong {
    public static void main(String args[]) {
        System.out.println("Armstrong numbers from 1 to 10000:");
        for (int num = 1; num <= 10000; num++) {
            int temp = num;
            int digits = 0;
            int sum = 0;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                int pow = 1;
                for (int i = 0; i < digits; i++) {
                    pow *= digit;
                }
                sum += pow;
                temp /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
