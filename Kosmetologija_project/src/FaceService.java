
    public class FaceService extends Service {

        private String skinType;

        public FaceService(String name, int duration, double rate, String skinType) {
            super(name, duration, rate);
            this.skinType = skinType;

        }


        public String toString() {
            return super.toString() + "\nSkin Type: " + skinType;

        }

        public String getSkinType() {
            return skinType;

        }

        public void setSkinType(String skinType) {
            this.skinType = skinType;

        }

    }
