package xyz.jambon.pvgtcore.main.GT.matelem;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;

import xyz.jambon.pvgtcore.helpers.PVFlagHelper;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static xyz.jambon.pvgtcore.helpers.PVMaterialHelper.regmat;
import static xyz.jambon.pvgtcore.main.GT.matelem.PVMaterials.*;

public class PVSupercons {

    public static void register() {
        Material MANASTEEL_STEEL = regmat("manasteel_steel", "shiny", 0x943b00, 0x000000).ingot()
                .components(Steel, 2, MANASTEEL, 1)
                .cableProperties(8, 1, 0, true)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes()
                .buildAndRegister();
    }
}
