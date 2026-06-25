package xyz.jambon.pvgtcore.helpers;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;

import xyz.jambon.pvgtcore.main.GT.matelem.PVMaterialFlags;

import java.lang.reflect.Field;
import java.util.*;

public final class PVFlagHelper {

    private static final Map<String, Object> MAP = new HashMap<>();

    static {
        load(PVMaterialFlags.class);
        load(MaterialFlags.class);
    }

    private static void load(Class<?> cls) {
        for (Field f : cls.getFields()) {
            try {
                Object value = f.get(null);
                String key = norm(f.getName());

                if (value instanceof MaterialFlag) {
                    MAP.put(key, value);
                }
                if (value instanceof List<?> list && !list.isEmpty() && list.get(0) instanceof MaterialFlag) {
                    MAP.put(key, list);
                }
            } catch (Exception ignored) {}
        }
    }

    private PVFlagHelper() {}

    public static MaterialFlag get(String name) {
        Object v = MAP.get(norm(name));
        if (v instanceof MaterialFlag f) return f;
        throw new IllegalArgumentException("Unknown MaterialFlag: " + name);
    }

    public static MaterialFlag[] getAll(String... names) {
        List<MaterialFlag> out = new ArrayList<>();

        for (String n : names) {
            Object v = MAP.get(norm(n));
            if (v == null) {
                throw new IllegalArgumentException("Unknown flag or flag group: " + n);
            }
            if (v instanceof MaterialFlag f) {
                out.add(f);
            } else if (v instanceof List<?> list) {
                for (Object o : list) out.add((MaterialFlag) o);
            }
        }

        return out.toArray(new MaterialFlag[0]);
    }

    private static String norm(String s) {
        return s == null ? "" : s.trim().toLowerCase().replaceAll("[^a-z0-9]", "");
    }
}
