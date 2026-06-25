package xyz.jambon.pvgtcore.main.GT.matelem;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;

import xyz.jambon.pvgtcore.PVGTCore;

import static xyz.jambon.pvgtcore.main.GT.matelem.PVMaterials.*;

public class PVElementalMaterials {

    public static void register() {
        ANULIUM = elemmat("anulium", 0xc4c5cb);
        GURGLIUM = elemmat("gurglium", 0x1dbc5f);
        PRIMORDIUM = elemmat("primordium", 0xf03f13);
        ENERGIUM = elemmat("energium", 0xb24cd8);
        ENGERIOPHAGE = elemmat("engeriophage", 0x71d84c);

        MANA = elemmat("mana", 0xb3dbf5);
        ALFMANA = elemmat("alfmana", 0x02f400);
        SPIRIT = elemmat("spirit", 0xffe8e8);
    }

    public static Material elemmat(String element, int color) {
        return new Material.Builder(PVGTCore.id(element))
                .color(color).element(PVElements.get(element)).dust().buildAndRegister();
    }
}
