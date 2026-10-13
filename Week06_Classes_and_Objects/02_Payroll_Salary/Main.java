class PayrollAccount {
    private double basicSalary;
    private double bonus;
    PayrollAccount(double openingBasicSalary) {
        if (openingBasicSalary < 0) { System.out.println("Warning: negative salary; starting at Rs 0.0"); this.basicSalary = 0; }
        else this.basicSalary = openingBasicSalary;
    }
    public void creditBonus(double amount) {
        if (amount <= 0) System.out.println("Bonus rejected: amount must be positive");
        else { bonus += amount; System.out.println("Bonus credited: Rs " + amount); }
    }
    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) System.out.println("Tax rejected: percent must be between 0 and 100");
        else { basicSalary *= (1 - percent / 100.0); System.out.println("Tax deducted: " + percent + "%"); }
    }
    public double getNetSalary() { return basicSalary + bonus; }
}
public class Main {
    public static void main(String[] args) {
        PayrollAccount account = new PayrollAccount(50000);
        account.creditBonus(5000); account.deductTax(10);
        System.out.printf("Net salary: Rs %.1f%n", account.getNetSalary());
    }
}
