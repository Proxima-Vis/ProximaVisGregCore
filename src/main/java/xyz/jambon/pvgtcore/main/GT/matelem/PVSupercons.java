package xyz.jambon.pvgtcore.main.GT.matelem;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;

import xyz.jambon.pvgtcore.helpers.PVFlagHelper;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static xyz.jambon.pvgtcore.helpers.PVMaterialHelper.regmat;
import static xyz.jambon.pvgtcore.main.GT.matelem.PVMaterials.*;

public class PVSupercons {

    public static void register() {
        Material MANASTEEL_STEEL = regmat("manasteel_steel", "shiny", 0x943b00, 0x000000).ingot()
                .components(Steel, 2, MANASTEEL, 1)
                .langValue("Mana-Doped Steel")
                .cableProperties(GTValues.V[GTValues.LV], 1, 0, true)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes()
                .buildAndRegister();
        Material TERRASTEEL_ALUMINIUM = regmat("terrasteel_aluminium", "shiny", 0x943b00, 0x000000).ingot()
                .components(Aluminium, 1, TERRASTEEL, 2)
                .langValue("Aluminized Terrasteel")
                .cableProperties(GTValues.V[GTValues.MV], 1, 0, true)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes()
                .buildAndRegister();
        Material ELEMENTIUM_STAINLESS_STEEL = regmat("elementium_stainless_steel", "shiny", 0x943b00, 0x000000).ingot()
                .components(StainlessSteel, 2, ELEMENTIUM, 1)
                .langValue("Stainless Alf-Doped Steel")
                .cableProperties(GTValues.V[GTValues.HV], 1, 0, true)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes()
                .buildAndRegister();
        Material GAIASTEEL_TITANIUM = regmat("gaiasteel_titanium", "shiny", 0x943b00, 0x000000).ingot()
                .components(Titanium, 2, GAIASTEEL, 1)
                .langValue("Gaia-infused Titanium")
                .cableProperties(GTValues.V[GTValues.EV], 1, 0, true)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes()
                .buildAndRegister();
        Material AERIALITE_TUNGSTENSTEEL = regmat("aerialite_tungstensteel", "shiny", 0x943b00, 0x000000).ingot()
                .components(TungstenSteel, 1, AERIALITE, 2)
                .langValue("Tungstensteel Coated Aerialite")
                .cableProperties(GTValues.V[GTValues.IV], 1, 0, true)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes()
                .buildAndRegister();
        Material SHADOWIUM_PHOTONIUM_RHODIUM_PALLADIUM = regmat("shadowium_photonium_rhodium_palladium", "shiny", 0x943b00, 0x000000).ingot()
                .components(RhodiumPlatedPalladium, 2, SHADOWIUM, 1, PHOTONIUM, 1)
                .langValue("Illuminated Rhodium Plated Palladium")
                .cableProperties(GTValues.V[GTValues.LuV], 1, 0, true)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes()
                .buildAndRegister();
        Material ORICHALCOS_NAQUADAH_ALLOY = regmat("orichalcos_naquadah_alloy", "shiny", 0x943b00, 0x000000).ingot()
                .components(NaquadahAlloy, 2, ORICHALCOS, 1)
                .langValue("Orichalcos Naquadide Alloy")
                .cableProperties(GTValues.V[GTValues.ZPM], 1, 0, true)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes()
                .buildAndRegister();
        Material GOO_DARMSTADTIUM = regmat("goo_darmstadtium", "shiny", 0x943b00, 0x000000).ingot()
                .components(Darmstadtium, 2)
                .langValue("Mysteriously Enhanced Darmstadtium")
                .cableProperties(GTValues.V[GTValues.UV], 1, 0, true)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes()
                .buildAndRegister();

    }
}
