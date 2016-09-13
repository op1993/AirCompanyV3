package builder;

/**
 * Created by Oleh on 14.09.2016.
 */
public class Plane implements PlaneInterface{
        float capacity;
        float distance;
        float seats;

        public float getCapacity() {
                return capacity;
        }

        public void setCapacity(float capacity) {
                this.capacity = capacity;
        }

        public Plane(float capacity, float distance, float seats) {
                this.capacity = capacity;
                this.distance = distance;
                this.seats = seats;
        }

        public float getDistance() {
                return distance;
        }

        public void setDistance(float distance) {
                this.distance = distance;
        }

        public float getSeats() {
                return seats;
        }

        public void setSeats(float seats) {
                this.seats = seats;
        }
}
