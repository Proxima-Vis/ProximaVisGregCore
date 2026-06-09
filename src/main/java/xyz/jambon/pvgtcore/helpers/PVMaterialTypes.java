package xyz.jambon.pvgtcore.helpers;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class PVMaterialTypes {

    private static final Map<String, Method> TYPE_METHODS = new HashMap<>();
    private static final Map<String, Method> TYPE_METHODS_INT = new HashMap<>();

    static {
        for (Method m : Material.Builder.class.getMethods()) {
            if (m.getParameterCount() == 0) {
                TYPE_METHODS.put(m.getName(), m);
            } else if (m.getParameterCount() == 1 && m.getParameterTypes()[0] == int.class) {
                TYPE_METHODS_INT.put(m.getName(), m);
            }
        }
    }

    public static void apply(Material.Builder b, String type, Integer harvest) {
        try {
            if (harvest != null && TYPE_METHODS_INT.containsKey(type)) {
                TYPE_METHODS_INT.get(type).invoke(b, harvest);
                return;
            }

            if (TYPE_METHODS.containsKey(type)) {
                TYPE_METHODS.get(type).invoke(b);
                return;
            }

            throw new IllegalArgumentException("Unknown material type: " + type);

        } catch (Exception e) {
            throw new RuntimeException("Failed to apply material type: " + type, e);
        }
    }
}
