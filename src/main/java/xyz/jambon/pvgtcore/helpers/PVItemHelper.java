package xyz.jambon.pvgtcore.helpers;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

@SuppressWarnings("removal")
public class PVItemHelper {

    public static ItemLike item(String id) {
        Item item = BuiltInRegistries.ITEM.get(new ResourceLocation(id));
        if (item == Items.AIR) {
            throw new IllegalArgumentException("Unknown item: " + id);
        }
        return item;
    }
}
