package xyz.jambon.pvgtcore.main.GT.matelem;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;

import com.gregtechceu.gtceu.api.fluids.FluidConstants;
import com.gregtechceu.gtceu.api.fluids.FluidState;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKey;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.WaterFluid;
import xyz.jambon.pvgtcore.helpers.PVFlagHelper;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static xyz.jambon.pvgtcore.helpers.PVMaterialHelper.regmat;
import static xyz.jambon.pvgtcore.main.GT.matelem.PVElementalMaterials.*;

public class PVMaterials {

    public static Material NOOM_GOO;
    public static Material LIGHT_NOOM;
    public static Material DARK_NOOM;
    public static Material NOOM;

    public static Material GLUGG_GOO;
    public static Material GLUGG_BRINE;
    public static Material CONCENTRATED_GLUGG_BRINE;
    public static Material HEAVY_GLUGG_GOO;

    public static Material CINDEL_GOO;
    public static Material VOLAUR_AIR;
    public static Material PRIMORDIAL_ASHES;
    public static Material PRIMORDIAL_LAVA;

    public static Material ENERGIUM_MAT;
    public static Material INFECTED_ENERGIUM;
    public static Material INFECTED_DELETED_ENERGIUM;
    public static Material DEPLETED_ENERGIUM;

    public static void register() {
        //NOOM
        Material NOOM_GOO = regmat("noom_goo", "lignite", 0xdcdcdf, 0xceced2).gem()
                .components(ANULIUM, 1)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes(TagPrefix.dust, TagPrefix.dustSmall, TagPrefix.dustTiny,
                        TagPrefix.gemExquisite, TagPrefix.gemFlawless, TagPrefix.gemFlawed, TagPrefix.gemChipped)
                .buildAndRegister();
        Material LIGHT_NOOM = regmat("light_noom", "sand", 0xdcdcdf, 0xceced2).dust()
                .components(Helium3, 3, Silicon, 2, ANULIUM, 1)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .buildAndRegister();
        Material DARK_NOOM = regmat("dark_noom", "sand", 0x9b9b9f, 0x69696c).dust()
                .components(Chromium, 2, Iron, 1, Aluminium, 1, Uranium235, 1)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .buildAndRegister();
        Material NOOM = regmat("noom", "sand", 0xc4c5cb, 0xb0b0b5).dust()
                .components(DARK_NOOM, 2, LIGHT_NOOM, 1)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .buildAndRegister();

        //GLUGG
        Material GLUGG_GOO = regmat("glugg_goo", "lignite", 0x5cff7d, 0x5cffff).gem()
                .components(GURGLIUM, 1)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes(TagPrefix.dust, TagPrefix.dustSmall, TagPrefix.dustTiny,
                        TagPrefix.gemExquisite, TagPrefix.gemFlawless, TagPrefix.gemFlawed, TagPrefix.gemChipped)
                .buildAndRegister();
        Material HEAVY_GLUGG_GOO = regmat("heavy_glugg_goo", "lignite", 0x5cff7d, 0x855cff).gem()
                .components(GLUGG_GOO, 1, Titanium, 2)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes(TagPrefix.dust, TagPrefix.dustSmall, TagPrefix.dustTiny,
                        TagPrefix.gemExquisite, TagPrefix.gemFlawless, TagPrefix.gemFlawed, TagPrefix.gemChipped)
                .buildAndRegister();
        Material GLUGG_BRINE = regmat("glugg_brine", "shiny", 0x1dbc5f, 0x5cffff)
                .liquid(new FluidBuilder().block().temperature(294))
                .components(GURGLIUM, 1, Water, 2)
                .buildAndRegister();
        Material CONCENTRATED_GLUGG_BRINE = regmat("concentrated_glugg_brine", "shiny", 0x1dbc5f, 0x5cffff)
                .liquid(new FluidBuilder().temperature(372))
                .components(GURGLIUM, 2, Water, 1)
                .buildAndRegister();

        //CINDEL
        Material CINDEL_GOO = regmat("cindel_goo", "lignite", 0x943b00, 0x000000).gem()
                .components(GURGLIUM, 1)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .ignoredTagPrefixes(TagPrefix.dust, TagPrefix.dustSmall, TagPrefix.dustTiny,
                        TagPrefix.gemExquisite, TagPrefix.gemFlawless, TagPrefix.gemFlawed, TagPrefix.gemChipped)
                .buildAndRegister();
        Material PRIMORDIAL_AIR = regmat("primordial_air", "shiny", 0x943b00, 0xcd641e)
                .gas(new FluidBuilder().temperature(372).state(FluidState.GAS))
                .components(PRIMORDIUM, 2, Water, 1)
                .buildAndRegister();
        Material PRIMORDIAL_ASHES = regmat("primordial_ashes", "sand", 0x943b00, 0x000000).dust()
                .components(PRIMORDIUM, 1)
                .flags(PVFlagHelper.getAll("block", "nodecomp"))
                .buildAndRegister();

        //ENGER
        Material ENERGIUM_MAT = regmat("energium_mat", "certus", 0xb24cd8, 0x7f3fb2).gem()
                .components(ENERGIUM, 6)
                .liquid(new FluidBuilder().temperature(300).state(FluidState.LIQUID))
                .gas(new FluidBuilder().temperature(762).state(FluidState.GAS))
                .plasma(new FluidBuilder().temperature(8621).state(FluidState.PLASMA))
                .flags(PVFlagHelper.getAll("frame", "plates", "dense_plate", "long_rod", "crystallizable", "lens"))
                .buildAndRegister();
        Material INFECTED_ENERGIUM = regmat("infected_energium", "CERTUS", 0xb24cd8, 0x71d84c).ingot()
                .components(ENERGIUM, 5, ENGERIOPHAGE, 1)
                .flags(PVFlagHelper.getAll("frame", "plates", "dense_plate", "long_rod", "crystallizable", "lens"))
                .buildAndRegister();
        Material INFECTED_DELETED_ENERGIUM = regmat("infected_depleted_energium", "CERTUS", 0x4c1560, 0x71d84c).ingot()
                .components(ENERGIUM, 4, ENGERIOPHAGE, 1)
                .flags(PVFlagHelper.getAll("frame", "plates", "dense_plate", "long_rod", "crystallizable", "lens"))
                .buildAndRegister();
        Material DEPLETED_ENERGIUM = regmat("depleted_energium", "CERTUS", 0x4c1560, 0x7f3fb2).ingot()
                .components(ENERGIUM, 5)
                .flags(PVFlagHelper.getAll("frame", "plates", "dense_plate", "long_rod", "crystallizable", "lens"))
                .buildAndRegister();
    }
}
