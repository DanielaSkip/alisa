class SkincareService extends Service {
    private double acidityLevel;
    private String type;

    public SkincareService(String name, int duration, double rate, double acidityLevel, String type) {
        super(name, duration, rate);
        this.acidityLevel = acidityLevel;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAcidity Level: " + acidityLevel + " pH" +
                "\nType: " + type;
    }
}
