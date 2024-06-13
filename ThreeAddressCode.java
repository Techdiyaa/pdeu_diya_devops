public class ThreeAddressCode {
    public static void main(String[] args) {
        // Initialize variables
        float a = 1.0f;
        float b = 2.0f;
        float c = 3.0f;
        float d = 4.0f;
        float e = 5.0f;

        // Perform computations
        float temp1 = a + b;
        float temp2 = temp1 + c;
        float temp3 = temp2 + d;
        float Result = temp3 - e;

        // Print the result
        System.out.println("Result: " + Result);
    }
}
