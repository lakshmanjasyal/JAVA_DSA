import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FreqLav {
      // Method to calculate and print frequency of each unique element
    public void frequencyOfEachElement(List<Integer> values) {
        List<Integer> uniqueElements = new ArrayList<>();
        List<Integer> frequencies = new ArrayList<>();

        for (int value : values) {
            int index = uniqueElements.indexOf(value);
            if (index != -1) {
                // If the value is already in the uniqueElements list, increment its frequency
                frequencies.set(index, frequencies.get(index) + 1);
            } else {
                // If it's a new value, add it to uniqueElements and set its frequency to 1
                uniqueElements.add(value);
                frequencies.add(1);
            }
        }

        // Print frequencies
        for (int i = 0; i < uniqueElements.size(); i++) {
            System.out.println("Element " + uniqueElements.get(i) + " occurs " + frequencies.get(i) + " times.");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            FreqLav list = new FreqLav();    
            List<Integer> values = new ArrayList<>();
            System.out.print("Enter the number of values: ");
            int k = sc.nextInt();
            System.out.print("Enter the values: ");
            for (int i = 0; i < k; i++) {
                values.add(sc.nextInt());
            }

            // Call the frequency calculation method
            list.frequencyOfEachElement(values);

            // Example: Calculating frequency of a specific element
            System.out.print("Enter the element you want to calculate frequency: ");
            int l = sc.nextInt();
            int count = Collections.frequency(values, l); // Using Collections utility to get frequency
            System.out.println("Frequency of " + l + " is: " + count);
        }
    }
}
