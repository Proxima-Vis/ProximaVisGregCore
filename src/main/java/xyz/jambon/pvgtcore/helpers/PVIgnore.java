package xyz.jambon.pvgtcore.helpers;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;

import net.minecraft.world.level.ItemLike;

import java.util.Map;
import java.util.function.Supplier;

public final class PVIgnore {

    private PVIgnore() {}

    public static void setIgnored(String prefix, Material material, Supplier<ItemLike>... suppliers) {
        TagPrefix p = PVTagPrefixes.get(prefix);
        p.setIgnored(material, suppliers);
    }

    public static void ignoreForms(Material material, Map<String, Supplier<ItemLike>> mapping) {
        for (var e : mapping.entrySet()) {
            setIgnored(e.getKey(), material, e.getValue());
        }
    }
}
