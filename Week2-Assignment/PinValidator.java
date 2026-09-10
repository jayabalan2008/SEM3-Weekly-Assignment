public class PinValidator {
    public static void main(String[] args) {
        System.out.println("--- Test 1 ---");
        checkPinLength("482");

        System.out.println("\n--- Test 2 ---");
        checkPinLength("4820");
    }
    public static void checkPinLength(String pin) {
        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }
}