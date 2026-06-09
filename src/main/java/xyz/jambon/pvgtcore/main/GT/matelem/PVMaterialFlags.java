package xyz.jambon.pvgtcore.main.GT.matelem;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;

public class PVMaterialFlags {

    public static final MaterialFlag noRecipes = DISABLE_MATERIAL_RECIPES;
    public static final MaterialFlag electrolyze = DECOMPOSITION_BY_ELECTROLYZING;
    public static final MaterialFlag centrifuge = DECOMPOSITION_BY_CENTRIFUGING;
    public static final MaterialFlag noDecomp = DISABLE_DECOMPOSITION;
    public static final MaterialFlag explosive = EXPLOSIVE;
    public static final MaterialFlag flammable = FLAMMABLE;
    public static final MaterialFlag sticky = STICKY;
    public static final MaterialFlag phosphorescent = PHOSPHORESCENT;

    public static final MaterialFlag plates = GENERATE_PLATE;
    public static final MaterialFlag densePlate = GENERATE_DENSE;
    public static final MaterialFlag rod = GENERATE_ROD;
    public static final MaterialFlag boltAndScrew = GENERATE_BOLT_SCREW;
    public static final MaterialFlag frame = GENERATE_FRAME;
    public static final MaterialFlag gear = GENERATE_GEAR;
    public static final MaterialFlag longRod = GENERATE_LONG_ROD;
    public static final MaterialFlag block = FORCE_GENERATE_BLOCK;
    public static final MaterialFlag noCraftBlock = EXCLUDE_BLOCK_CRAFTING_RECIPES;
    public static final MaterialFlag noCraftPlateCompressor = EXCLUDE_PLATE_COMPRESSOR_RECIPE;
    public static final MaterialFlag noCraftHand = EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES;
    public static final MaterialFlag mortarGrind = MORTAR_GRINDABLE;
    public static final MaterialFlag noWorking = NO_WORKING;
    public static final MaterialFlag noSmashing = NO_SMASHING;
    public static final MaterialFlag noSmelt = NO_SMELTING;
    public static final MaterialFlag blastDouble = BLAST_FURNACE_CALCITE_DOUBLE;
    public static final MaterialFlag blastTriple = BLAST_FURNACE_CALCITE_TRIPLE;
    public static final MaterialFlag noAbsRecipe = DISABLE_ALLOY_BLAST;
    public static final MaterialFlag notAlloy = DISABLE_ALLOY_PROPERTY;
    public static final MaterialFlag noTab = NO_ORE_PROCESSING_TAB;

    public static final MaterialFlag foil = GENERATE_FOIL;
    public static final MaterialFlag ring = GENERATE_RING;
    public static final MaterialFlag spring = GENERATE_SPRING;
    public static final MaterialFlag smallSpring = GENERATE_SPRING_SMALL;
    public static final MaterialFlag smallGear = GENERATE_SMALL_GEAR;
    public static final MaterialFlag fineWire = GENERATE_FINE_WIRE;
    public static final MaterialFlag rotor = GENERATE_ROTOR;
    public static final MaterialFlag round = GENERATE_ROUND;
    public static final MaterialFlag magnetic = IS_MAGNETIC;

    public static final MaterialFlag crystallizable = CRYSTALLIZABLE;
    public static final MaterialFlag lens = GENERATE_LENS;

    public static final MaterialFlag solderMat = SOLDER_MATERIAL;
    public static final MaterialFlag solderMatBad = SOLDER_MATERIAL_BAD;
    public static final MaterialFlag solderMatGood = SOLDER_MATERIAL_GOOD;

    public static final MaterialFlag highSifter = HIGH_SIFTER_OUTPUT;
}
