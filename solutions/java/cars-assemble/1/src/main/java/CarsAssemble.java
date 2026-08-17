public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double porcentaje;

        if (speed <= 4) {
            porcentaje = 1.0;
        } else if (speed <= 8) {
            porcentaje = 0.9;
        } else if (speed == 9) {
            porcentaje = 0.8;
        } else {
            porcentaje = 0.77;
        }

        return speed * 221 * porcentaje;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
