class BodyService extends Service {
    private String intensity;
    private String type;

    public BodyService(String name, int duration, double rate, String intensity, String type) {
        super(name, duration, rate);
        this.intensity = intensity;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nIntensity: " + intensity +
                "\nType: " + type;
    }
}
