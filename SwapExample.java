public class SwapExample {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        
        // Swap using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
