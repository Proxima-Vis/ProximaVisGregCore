package xyz.jambon.pvgtcore.main.GT.matelem;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;

public class PVMaterials {

    public static Material ANULIUM;
    public static Material GURGLIUM;
    public static Material PRIMORDIUM;
    public static Material ENERGIUM;
    public static Material ENGERIOPHAGE;

    public static Material MANA;
    public static Material ALFMANA;
    public static Material SPIRIT;

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
    public static Material INFECTED_DELETED_ENERGIUM;
    public static Material DEPLETED_ENERGIUM;

    public static Material MANASTEEL;
    public static Material MANA_DIAMOND;
    public static Material MANA_PEARL;
    public static Material MANA_QUARTZ;
    public static Material TERRASTEEL;
    public static Material ELEMENTIUM;
    public static Material DRAGONSTONE;
    public static Material PIXIE_DUST;
    public static Material ELEMENTIUM_QUARTZ;
    public static Material LIFE_ESSENCE;
    public static Material GAIASTEEL;
    public static Material AERIALITE;
    public static Material PHOTONIUM;
    public static Material SHADOWIUM;
    public static Material ORICHALCOS;;

    public static void init() {
        PVElementalMaterials.register();
        PVMainMaterials.register();
        PVBotaniaMaterials.register();
        PVSupercons.register();
    }
}
