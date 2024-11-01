public class IT24300344Lab3Q3 {
    public static void main(String[] args) {
        int amount = 2754; 
        System.out.print("Amount: " + amount + "\n");

        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                count[i] = amount / denominations[i];
                amount = amount % denominations[i];
            }
        }

        System.out.println("5000 Notes - " + count[0]);
        System.out.println("1000 Notes - " + count[1]);
        System.out.println("500 Notes - " + count[2]);
        System.out.println("200 Notes - " + count[3]);
        System.out.println("100 Notes - " + count[4]);
        System.out.println("50 Notes - " + count[5]);
        System.out.println("20 Notes - " + count[6]);
        System.out.println("10 Notes - " + count[7]);
        System.out.println("5 Notes - " + count[8]);
        System.out.println("2 Notes - " + count[9]);
        System.out.println("1 Notes - " + count[10]);
    }
}
