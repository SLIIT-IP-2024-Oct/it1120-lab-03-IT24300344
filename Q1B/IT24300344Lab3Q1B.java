public class IT24300344Lab3Q1B {
public static void main(String[] args) {

double pricePerKg = 225;
double quantity = 5;


double totalAmount = pricePerKg * quantity;
double discount = totalAmount * 0.10;
double finalAmount = totalAmount - discount;

System.out.println("Total amount before discount: " + totalAmount);
System.out.println("Discount (10%): "+ discount);
System.out.println("Final amount to pay: "+ finalAmount);

}
}
