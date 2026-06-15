package xyz.jambon.pvgtcore.helpers;

import xyz.jambon.pvgtcore.main.GT.matelem.PVMaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;

import java.lang.reflect.Field;
import java.util.*;

public final class PVFlagHelper {
    private static final Map<String, MaterialFlag> MAP = new HashMap<>();

    static {
        for (Field f : PVMaterialFlags.class.getFields()) {
            if (f.getType() == MaterialFlag.class) {
                try { MAP.put(norm(f.getName()), (MaterialFlag) f.get(null)); } catch (Exception ignored) {}
            }
        }
        for (Field f : MaterialFlags.class.getFields()) {
            if (f.getType() == MaterialFlag.class) {
                try { MAP.put(norm(f.getName()), (MaterialFlag) f.get(null)); } catch (Exception ignored) {}
            }
        }
    }

    private PVFlagHelper() {}

    public static MaterialFlag get(String name) {
        Objects.requireNonNull(name);
        MaterialFlag f = MAP.get(norm(name));
        if (f == null) throw new IllegalArgumentException("Unknown MaterialFlag: " + name);
        return f;
    }

    public static MaterialFlag[] getAll(String... names) {
        Objects.requireNonNull(names);
        MaterialFlag[] out = new MaterialFlag[names.length];
        for (int i = 0; i < names.length; i++) out[i] = get(names[i]);
        return out;
    }

    private static String norm(String s) {
        return s == null ? "" : s.trim().toLowerCase().replaceAll("[^a-z0-9]", "");
    }
}
