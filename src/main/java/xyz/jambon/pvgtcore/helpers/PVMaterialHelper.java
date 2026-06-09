package xyz.jambon.pvgtcore.helpers;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;

import xyz.jambon.pvgtcore.PVGTCore;

public class PVMaterialHelper {

    public static Material.Builder regmat(String id, String icon, int color1, int color2) {
        Material.Builder builder = new Material.Builder(PVGTCore.id(id));
        builder.color(color1);
        builder.secondaryColor(color2);
        builder.iconSet(MaterialIconSet.getByName(icon));
        return builder;
    }
}
