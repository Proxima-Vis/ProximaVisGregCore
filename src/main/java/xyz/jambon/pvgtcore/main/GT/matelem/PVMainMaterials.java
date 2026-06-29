package xyz.jambon.pvgtcore.main.GT.matelem;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.FluidState;

import xyz.jambon.pvgtcore.helpers.PVFlagHelper;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static xyz.jambon.pvgtcore.helpers.PVMaterialHelper.regmat;
import static xyz.jambon.pvgtcore.main.GT.matelem.PVMaterials.*;

public class PVMainMaterials {

    public static void register() {
        // NOOM
        NOOM_GOO = regmat("noom_goo", "lignite", 0xdcdcdf, 0xceced2).gem()
                .components(ANULIUM, 1)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes(TagPrefix.dust, TagPrefix.dustSmall, TagPrefix.dustTiny,
                        TagPrefix.gemExquisite, TagPrefix.gemFlawless, TagPrefix.gemFlawed, TagPrefix.gemChipped)
                .buildAndRegister();
        LIGHT_NOOM = regmat("light_noom", "sand", 0xdcdcdf, 0xceced2).dust()
                .components(Helium3, 3, Silicon, 2, ANULIUM, 1)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .buildAndRegister();
        DARK_NOOM = regmat("dark_noom", "sand", 0x9b9b9f, 0x69696c).dust()
                .components(Chromium, 2, Iron, 1, Aluminium, 1, Uranium235, 1)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .buildAndRegister();
        NOOM = regmat("noom", "sand", 0xc4c5cb, 0xb0b0b5).dust()
                .components(DARK_NOOM, 2, LIGHT_NOOM, 1)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .buildAndRegister();

        // GLUGG
        GLUGG_GOO = regmat("glugg_goo", "lignite", 0x5cff7d, 0x5cffff).gem()
                .components(GURGLIUM, 1)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes(TagPrefix.dust, TagPrefix.dustSmall, TagPrefix.dustTiny,
                        TagPrefix.gemExquisite, TagPrefix.gemFlawless, TagPrefix.gemFlawed, TagPrefix.gemChipped)
                .buildAndRegister();
        HEAVY_GLUGG_GOO = regmat("heavy_glugg_goo", "lignite", 0x5cff7d, 0x855cff).gem()
                .components(GLUGG_GOO, 1, Titanium, 2)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes(TagPrefix.dust, TagPrefix.dustSmall, TagPrefix.dustTiny,
                        TagPrefix.gemExquisite, TagPrefix.gemFlawless, TagPrefix.gemFlawed, TagPrefix.gemChipped)
                .buildAndRegister();
        GLUGG_BRINE = regmat("glugg_brine", "shiny", 0x1dbc5f, 0x5cffff)
                .liquid(new FluidBuilder().block().temperature(294))
                .components(GURGLIUM, 1, Water, 2)
                .buildAndRegister();
        CONCENTRATED_GLUGG_BRINE = regmat("concentrated_glugg_brine", "shiny", 0x1dbc5f, 0x5cffff)
                .liquid(new FluidBuilder().temperature(372))
                .components(GURGLIUM, 2, Water, 1)
                .buildAndRegister();

        // CINDEL
        CINDEL_GOO = regmat("cindel_goo", "lignite", 0x943b00, 0x000000).gem()
                .components(GURGLIUM, 1)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes(TagPrefix.dust, TagPrefix.dustSmall, TagPrefix.dustTiny,
                        TagPrefix.gemExquisite, TagPrefix.gemFlawless, TagPrefix.gemFlawed, TagPrefix.gemChipped)
                .buildAndRegister();
        PRIMORDIAL_AIR = regmat("primordial_air", "shiny", 0x943b00, 0xcd641e)
                .gas(new FluidBuilder().temperature(372).state(FluidState.GAS))
                .components(PRIMORDIUM, 2, Water, 1)
                .buildAndRegister();
        PRIMORDIAL_ASHES = regmat("primordial_ashes", "sand", 0x943b00, 0x000000).dust()
                .components(PRIMORDIUM, 1)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .buildAndRegister();

        // ENGER
        ENERGIUM_MAT = regmat("energium_mat", "certus", 0xb24cd8, 0x7f3fb2).gem()
                .components(ENERGIUM, 6)
                .liquid(new FluidBuilder().temperature(300).state(FluidState.LIQUID))
                .gas(new FluidBuilder().temperature(762).state(FluidState.GAS))
                .plasma(new FluidBuilder().temperature(8621).state(FluidState.PLASMA))
                .flags(PVFlagHelper.getAll("ext2Metal", "frame", "long_rod", "crystallizable", "lens"))
                .buildAndRegister();
        INFECTED_ENERGIUM = regmat("infected_energium", "CERTUS", 0xb24cd8, 0x71d84c).gem()
                .components(ENERGIUM, 5, ENGERIOPHAGE, 1)
                .flags(PVFlagHelper.getAll("ext2Metal", "frame", "long_rod", "crystallizable", "lens"))
                .buildAndRegister();
        INFECTED_DELETED_ENERGIUM = regmat("infected_depleted_energium", "CERTUS", 0x4c1560, 0x71d84c).gem()
                .components(ENERGIUM, 4, ENGERIOPHAGE, 1)
                .flags(PVFlagHelper.getAll("ext2Metal", "frame", "long_rod", "crystallizable", "lens"))
                .buildAndRegister();
        DEPLETED_ENERGIUM = regmat("depleted_energium", "CERTUS", 0x4c1560, 0x7f3fb2).gem()
                .components(ENERGIUM, 5)
                .flags(PVFlagHelper.getAll("ext2Metal", "frame", "long_rod", "crystallizable", "lens"))
                .buildAndRegister();

    }
}
