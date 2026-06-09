package xyz.jambon.pvgtcore.helpers;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;

import net.minecraft.world.level.ItemLike;

public final class PVIgnore {

    public static void ignore(String prefix, Material material, String itemId) {
        TagPrefix p = PVTagPrefixes.get(prefix);
        ItemLike item = PVItemHelper.item(itemId);

        p.setIgnored(material, item);
    }
}
