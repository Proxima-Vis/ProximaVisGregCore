package xyz.jambon.pvintegration.main.GT.matelem;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;

import xyz.jambon.pvintegration.PVIntegration;

import static xyz.jambon.pvintegration.PVIntegration.PVINTEGRATION_REGISTRATE;

public class PVMaterials {

    static {
        PVINTEGRATION_REGISTRATE.creativeModeTab(() -> PVIntegration.PVI_TAB);
    }

    public static Material ANULIUM;
    public static Material GURGLIUM;
    public static Material PRIMORDIUM;
    public static Material ENERGIUM;
    public static Material ENGERIOPHAGE;

    public static Material NOOM_GOO;
    public static Material LIGHT_NOOM;
    public static Material DARK_NOOM;
    public static Material NOOM;

    public static Material GLUGG_GOO;
    public static Material GLUGG_BRINE;
    public static Material CONCENTRATED_GLUGG_BRINE;
    public static Material HEAVY_GLUGG_GOO;

    public static Material CINDEL_GOO;
    public static Material PRIMORDIAL_AIR;
    public static Material PRIMORDIAL_ASHES;
    public static Material PRIMORDIAL_LAVA;

    public static Material ENERGIUM_MAT;
    public static Material INFECTED_ENERGIUM;
    public static Material INFECTED_DEPLETED_ENERGIUM;
    public static Material DEPLETED_ENERGIUM;
    public static Material ENERGIUM_ICE;
    public static Material ENGER_AIR;

    public static Material POSTGAME_GOO;

    public static void init() {
        PVElementalMaterials.register();
        PVMainMaterials.register();
    }
}
