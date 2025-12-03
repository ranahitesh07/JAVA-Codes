class StudentDetails{
    public static void main(String[] args){
        if (args.length < 9){
            System.out.println("Please provide SIC, name, branch, and six marks");
            return;
        }
        String sic = args[0];
        String name = args[1];
        String branch = args[2];
        int sum = 0;
        for (int i = 3; i < 9; i++){
            String mark = args[i];
            sum += Integer.parseInt(mark);
        }
        double average = sum / 6.0;
        System.out.println("SIC: " + sic);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.printf("Average Marks: %.2f%n", average);
    }
}



