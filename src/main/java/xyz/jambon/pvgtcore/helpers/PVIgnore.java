package xyz.jambon.pvgtcore.helpers;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;

import java.util.Map;

public final class PVIgnore {
    public static void ignore(String prefix, Material material, ItemLike item) {
        TagPrefix p = PVTagPrefixes.get(prefix);
        p.setIgnored(material, item);
    }

    public static void ignoreForms(Material material, Map<String, ItemLike> mapping) {
        for (var entry : mapping.entrySet()) {
            String prefix = entry.getKey();
            ItemLike item = entry.getValue();
            TagPrefix p = PVTagPrefixes.get(prefix);
            PVIgnore.ignore(prefix, material, item);
        }
    }
}
