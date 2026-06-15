package xyz.jambon.pvgtcore.main.GT.matelem;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttribute;
import xyz.jambon.pvgtcore.helpers.PVFlagHelper;
import xyz.jambon.pvgtcore.helpers.PVIgnore;
import xyz.jambon.pvgtcore.helpers.PVMaterialHelper;

import java.util.Map;

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


    public static void register() {
        Material NOOM_GOO = regmat("noom_goo", "lignite", 0xdcdcdf, 0xceced2).gem()
                .components(ANULIUM, 1)
                .flags(PVFlagHelper.getAll("block","nodecomp"))
                .ignoredTagPrefixes(TagPrefix.dust, TagPrefix.dustSmall, TagPrefix.dustTiny,
                        TagPrefix.gemExquisite, TagPrefix.gemFlawless, TagPrefix.gemFlawed, TagPrefix.gemChipped)
                .buildAndRegister();
        Material LIGHT_NOOM = regmat("light_noom", "sand", 0xdcdcdf, 0xceced2).dust()
                .components(Helium3, 3, Silicon, 2, ANULIUM, 1)
                .flags(PVFlagHelper.getAll("block","nodecomp"))
                .buildAndRegister();
        Material DARK_NOOM = regmat("dark_noom", "sand", 0x9b9b9f, 0x69696c).dust()
                .components(Chromium, 2, Iron, 1, Aluminium, 1, Uranium235, 1)
                .flags(PVFlagHelper.getAll("block","nodecomp"))
                .buildAndRegister();
        Material NOOM = regmat("noom", "sand", 0xc4c5cb, 0xb0b0b5).dust()
                .components(DARK_NOOM, 2, LIGHT_NOOM, 1)
                .flags(PVFlagHelper.getAll("block","nodecomp"))
                .buildAndRegister();

        Material GLUGG_GOO = regmat("glugg_goo", "lignite", 0x5cff7d, 0x5cffff).gem()
                .components(Helium3, 3, Silicon, 2, ANULIUM, 1)
                .flags(PVFlagHelper.getAll("block","nodecomp"))
                .ignoredTagPrefixes(TagPrefix.dust, TagPrefix.dustSmall, TagPrefix.dustTiny,
                        TagPrefix.gemExquisite, TagPrefix.gemFlawless, TagPrefix.gemFlawed, TagPrefix.gemChipped)
                .buildAndRegister();
        Material GLUGG_BRINE = regmat("glugg_brine", "shiny", 0x1dbc5f, 0x5cffff)
                .liquid(new FluidBuilder().block().temperature(294))
                .components(GURGLIUM, 1)
                .buildAndRegister();
    }
}
