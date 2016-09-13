package builder;

/**
 * Created by Oleh on 14.09.2016.
 */
public class CargoPlaneBuilder implements PlaneBuilderInterface {

    @Override
    public PlaneInterface buildPlane() {
        return new Plane(400,10, 3000);
    }
}
