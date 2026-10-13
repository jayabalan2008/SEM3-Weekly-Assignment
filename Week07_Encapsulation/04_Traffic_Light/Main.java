class TrafficLight {
    private String color = "RED";
    private final String id;
    TrafficLight(String id) { this.id = id; }
    public String getColor() { return color; }
    public String getId() { return id; }
    public void next() {
        switch (color) { case "RED": color = "GREEN"; break; case "GREEN": color = "YELLOW"; break; default: color = "RED"; }
    }
}
public class Main {
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        for (int i = 0; i < 4; i++) { System.out.println(t.getColor()); t.next(); }
    }
}
