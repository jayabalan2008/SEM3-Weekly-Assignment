class PasswordChecker {
    private final String password;
    PasswordChecker(String password) { this.password = password == null ? "" : password; }
    public String getStrength() {
        int n = password.length();
        if (n < 6) return "Weak";
        if (n < 10) return "Medium";
        return "Strong";
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(new PasswordChecker("abcd").getStrength());
        System.out.println(new PasswordChecker("abcdefgh").getStrength());
        System.out.println(new PasswordChecker("abcdefghijkl").getStrength());
    }
}
