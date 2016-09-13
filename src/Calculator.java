import builder.PlaneInterface;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Oleh on 14.09.2016.
 */
public class Calculator {
    ArrayList<PlaneInterface> planes = new ArrayList<>();

    public Calculator(ArrayList<PlaneInterface> planes) {
        this.planes = planes;
    }

    public float capacitySum () {
        float sum = 0;
        Iterator<PlaneInterface> planesIterator = planes.iterator();
        while (planesIterator.hasNext()) {
            sum += planesIterator.next().getCapacity();
        }
        return sum;
    }
}
