public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number = 2; // First even number
        
        while (count < 100) {
            sum += number;
            number += 2; // Next even number
            count++;
        }
        
        System.out.println("Sum of first 100 even numbers: " + sum);
    }
}