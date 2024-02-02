package drugstore;

import java.util.Comparator;

public class WeightCompare implements Comparator<Component> {
    @Override
    public int compare(Component o1, Component o2) {
        return (int) (o1.getWeight() - o2.getWeight());
    }
}
