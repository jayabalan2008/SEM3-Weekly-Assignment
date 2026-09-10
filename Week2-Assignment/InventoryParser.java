public class InventoryParser {

    public static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");
    
        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println("Product: " + fields[0] + " | SKU: " + fields[1] + " | Qty: " + fields[2]);
        }
    }

    public static void main(String[] args) {

        System.out.println("--- Test Case 1 ---");
        parseInventoryRecord("Wireless Mouse,WM-2201,150");

        System.out.println("\n--- Test Case 2 ---");
        parseInventoryRecord("Wireless Mouse,150");
    }
}
