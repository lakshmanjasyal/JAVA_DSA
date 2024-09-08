public class DecimalToBinary {

    public static void main(String[] args) {
        int number = 29;

        String binaryString = Integer.toBinaryString(number);

        // Print the binary representation
        System.out.println("Decimal number: " + number);
        System.out.println("Binary representation: " + binaryString);
    }
}
