import builder.CargoPlaneBuilder;
import builder.PlaneInterface;

import java.util.ArrayList;

/**
 * Created by Oleh on 14.09.2016.
 */
public class Runner {

    public static void main(String[] args) {
        CargoPlaneBuilder cargoPlaneBuilder = new CargoPlaneBuilder();
        ArrayList<PlaneInterface> planes = new ArrayList<>();
        planes.add(cargoPlaneBuilder.buildPlane());
        Calculator calculator = new Calculator(planes);

        System.out.println(calculator.capacitySum());

    }
}
