public class SkincareService extends Service {

    private double acidityLevel;
    private String type;

    public SkincareService(String name, int duration, double rate, double acidityLevel, String type) {

        super(name, duration, rate);
        this.acidityLevel = acidityLevel;
        this.type = type;
    }


    public String toString() {
        return super.toString() +
                "\nAcidity Level: " + acidityLevel + " pH" +
                "\nType: " + type;
    }

    public double getAcidityLevel() {
        return acidityLevel;
    }

    public void setAcidityLevel(double acidityLevel) {
        this.acidityLevel = acidityLevel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

    }
}