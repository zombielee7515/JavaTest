package FirstPack;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Appliance> devices = List.of(
            new Refrigerator(),
            new Microwave(),
            new SmartRefrigerator(),
            new Oven()
        );

        for (Appliance device : devices) {
            device.describe();

            if (device instanceof Cookable) {
                ((Cookable) device).cook("라면");
            }
        }
    }
}
