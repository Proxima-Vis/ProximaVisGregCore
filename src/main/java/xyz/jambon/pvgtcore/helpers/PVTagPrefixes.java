package xyz.jambon.pvgtcore.helpers;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class PVTagPrefixes {

    private static final Map<String, TagPrefix> PREFIXES = new HashMap<>();

    static {
        for (Field f : TagPrefix.class.getFields()) {
            if (f.getType() == TagPrefix.class) {
                try {
                    PREFIXES.put(f.getName().toLowerCase(), (TagPrefix) f.get(null));
                } catch (Exception ignored) {}
            }
        }
    }

    public static TagPrefix get(String name) {
        TagPrefix p = PREFIXES.get(Objects.requireNonNull(name).toLowerCase());
        if (p == null) throw new IllegalArgumentException("Unknown TagPrefix: " + name);
        return p;
    }

    public static TagPrefix[] get(String[] names) {
        Objects.requireNonNull(names);
        TagPrefix[] result = new TagPrefix[names.length];
        for (int i = 0; i < names.length; i++) result[i] = get(names[i]);
        return result;
    }

    public static TagPrefix[] getAll(String... names) {
        return get(names);
    }
}
