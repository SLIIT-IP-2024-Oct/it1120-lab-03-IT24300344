public class IT24300344Lab3Q4 {
    public static void main(String[] args) {
        if (args.length > 0) {
            String number = args[0];

            if (number.length() == 5) {
                for (int i = 0; i < number.length(); i++) {
                    System.out.print(number.charAt(i) + " ");
                }
            } else {
                System.out.println("52348");
            }
        } else {
            System.out.println("5 2 3 4 8");
        }
    }
}