class FaceService extends Service {
    private String skinType;

    public FaceService(String name, int duration, double rate, String skinType) {
        super(name, duration, rate);
        this.skinType = skinType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSkin Type: " + skinType;
    }
}
