package drugstore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component>, Comparator<Component>  {
    private final List<Component> components = new ArrayList<>();
    private  int index;

    public void addComponents(Component ... components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }
    @Override
    public boolean hasNext() {
        return index < components.size();

    }
    @Override
    public Component next() {
        return components.get(index++);
    }

    @Override
    public int compare(Component o1, Component o2) {
        return  o1.getPower() - o2.getPower();
    }
}
