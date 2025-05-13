import java.util.ArrayList;



    public class Service {
        private String name;
        private int duration;
        private double rate;
        private ArrayList zones;


        public Service(String name, int duration, double rate) {
            this.name = name;
            this.duration = duration;
            this.rate = rate;
            this.zones = new ArrayList<>();

        }

        public double calculateCost() {
            return duration * rate;

        }

        public String toString() {
            return "Service: " + name +
                    "\nDuration: " + duration + " min" +
                    "\nRate: " + rate + " EUR/min" +
                    "\nZones: " + zones;
        }


        public ArrayList getZones() {

            return zones;

        }


        public void addZone(String zone) {

            this.zones.add(zone);

        }


        public String getName() {

            return name;

        }


        public int getDuration() {

            return duration;

        }


        public double getRate() {

            return rate;

        }


        public void setName(String name) {

            this.name = name;

        }

        public void setDuration(int duration) {

            this.duration = duration;

        }


        public void setRate(double rate) {

            this.rate = rate;

        }

    }
