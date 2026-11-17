package xyz.jambon.pvintegration.main.GT.matelem;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;

import xyz.jambon.pvintegration.PVIntegration;

import static xyz.jambon.pvintegration.main.GT.matelem.PVMaterials.*;

public class PVElementalMaterials {

    public static void register() {
        ANULIUM = elemmat("anulium", 0xc4c5cb);
        GURGLIUM = elemmat("gurglium", 0x1dbc5f);
        PRIMORDIUM = elemmat("primordium", 0xf03f13);
        ENERGIUM = elemmat("energium", 0xb24cd8);
        ENGERIOPHAGE = elemmat("engeriophage", 0x71d84c);
    }

    public static Material elemmat(String element, int color) {
        return new Material.Builder(PVIntegration.id(element))
                .color(color).element(PVElements.get(element)).buildAndRegister();
    }
}
