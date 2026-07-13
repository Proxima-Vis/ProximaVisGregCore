package xyz.jambon.pvintegration.helpers;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;

import xyz.jambon.pvintegration.PVIntegration;

public class PVMaterialHelper {

    public static Material.Builder regmat(String id, String icon, int color1, int color2) {
        Material.Builder builder = new Material.Builder(PVIntegration.id(id));
        builder.color(color1);
        builder.secondaryColor(color2);
        builder.iconSet(MaterialIconSet.getByName(icon));
        return builder;
    }
}
