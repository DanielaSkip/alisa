public class BodyService extends Service {
    private String intensity;
    private String type;

    public BodyService(String name, int duration, double rate, String intensity, String type) {
        super(name, duration, rate);
        this.intensity = intensity;
        this.type = type;

    }


    public String toString() {
        return super.toString() +
                "\nIntensity: " + intensity +
                "\nType: " + type;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;

    }

    public String getType() {

        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
