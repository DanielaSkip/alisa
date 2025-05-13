import java.util.ArrayList;

abstract class Service {
    private String name;
    private int duration;
    private double rate;
    private ArrayList<String> zones;

    public Service(String name, int duration, double rate) {
        this.name = name;
        this.duration = duration;
        this.rate = rate;
        this.zones = new ArrayList<>();
    }

    public double calculateCost() {
        return duration * rate;
    }

    @Override
    public String toString() {
        return "Service: " + name +
                "\nDuration: " + duration + " min" +
                "\nRate: " + rate + " EUR/min" +
                "\nZones: " + zones;
    }

    public void addZone(String zone) {
        this.zones.add(zone);
    }
}
