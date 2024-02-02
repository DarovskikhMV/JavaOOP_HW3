package drugstore;

import java.util.Comparator;

public class VolumeCompare implements Comparator<Component> {
    @Override
    public int compare(Component o1, Component o2) {
        return (int) (o1.getVolume() - o2.getVolume());
    }

}
