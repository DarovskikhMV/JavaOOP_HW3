package drugstore;

import drugstore.components.*;

import java.util.*;

public class DrugMain {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicilin = new Penicilin("Penicilin", 1.6D, 6);

        Pharmacy2 p1 = new Pharmacy2();
        p1.addComponents(water, azitronite);
        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(penicilin, water);
        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(azitronite, penicilin);


//        for (Component c : p2) {
//            System.out.println(c);
//        }

        List<Component> components = new ArrayList<>();
        components.add(azitronite);
        components.add(water);
        components.add(penicilin);
        System.out.println(components);

        // соритровка
        Collections.sort(components);
        System.out.println(components);


        //обратный порядок
        Collections.sort(components, Comparator.reverseOrder());
        System.out.println(components);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~HW3~~~~~~~~~~~~~~~~~~~~~~~~~");

        Component aspirine = new Aspirine("Aspirine", 6D, 4);
        Component otrivin = new Otrivin("Otrivin", 4.2D, 7);
        Component nurofen = new Nurofen("Nurofen", 8.0D, 8);

        List<Component> components2  = new ArrayList<>();

        components2.add(aspirine);
        components2.add(otrivin);
        components2.add(nurofen);

        Pharmacy p4 = new Pharmacy();
        p4.addComponents(aspirine, nurofen);
        Pharmacy p5 = new Pharmacy();
        p5.addComponents(otrivin, aspirine);
        Pharmacy p6 = new Pharmacy();
        p6.addComponents(water,aspirine,azitronite,nurofen);

        Comparator<Component> power = new Pharmacy();
        components2.sort(power);
        System.out.println(components2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Comparator<Component> weight = new WeightCompare();
        components2.sort(weight);
        System.out.println(components2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Comparator<Component> volume = new VolumeCompare();
        components2.sort(volume);
        System.out.println(components2);
    }

}
