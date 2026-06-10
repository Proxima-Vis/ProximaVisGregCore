package xyz.jambon.pvgtcore.main.GT.matelem;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;

import io.github.lounode.extrabotany.common.block.ExtraBotanyBlocks;
import io.github.lounode.extrabotany.common.item.ExtraBotanyItems;
import vazkii.botania.common.block.BotaniaBlocks;
import vazkii.botania.common.item.BotaniaItems;
import xyz.jambon.pvgtcore.helpers.PVIgnore;

import java.util.Map;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static xyz.jambon.pvgtcore.helpers.PVMaterialHelper.regmat;
import static xyz.jambon.pvgtcore.main.GT.matelem.PVElementalMaterials.*;

public class PVBotaniaMaterials {

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
    public static Material ORICHALCOS;

    public static void register() {
        Material MANASTEEL = regmat("manasteel", "shiny", 0x4c82a9, 0x171781).ingot()
                .components(Iron, 1, MANA, 1)
                .buildAndRegister();
        PVIgnore.ignoreForms(MANASTEEL, Map.of(
                "ingot", () -> BotaniaItems.manaSteel,
                "nugget", () -> BotaniaItems.manasteelNugget,
                "block", () -> BotaniaBlocks.manasteelBlock));

        Material MANA_DIAMOND = regmat("mana_diamond", "shiny", 0xcdfef8, 0x80b9c4).gem()
                .components(Diamond, 1, MANA, 10)
                .buildAndRegister();
        PVIgnore.ignoreForms(MANA_DIAMOND, Map.of(
                "gem", () -> BotaniaItems.manaDiamond,
                "block", () -> BotaniaBlocks.manaDiamondBlock));

        Material MANA_PEARL = regmat("mana_pearl", "shiny", 0x80d9e1, 0x80b9c4).gem()
                .components(EnderPearl, 1, MANA, 10)
                .ignoredTagPrefixes(TagPrefix.gemExquisite, TagPrefix.gemFlawless)
                .buildAndRegister();
        PVIgnore.ignoreForms(MANA_PEARL, Map.of(
                "gem", () -> BotaniaItems.manaPearl));

        Material MANA_QUARTZ = regmat("mana_quartz", "quartz", 0xcde5ee, 0x9bc4d5).gem()
                .components(NetherQuartz, 4, MANA, 1)
                .ignoredTagPrefixes(TagPrefix.gemExquisite, TagPrefix.gemFlawless)
                .buildAndRegister();
        PVIgnore.ignoreForms(MANA_QUARTZ, Map.of(
                "gem", () -> BotaniaItems.manaQuartz,
                "block", () -> BotaniaBlocks.manaQuartz));

        Material TERRASTEEL = regmat("terrasteel", "shiny", 0x51ac49, 0x032d15).ingot()
                .components(MANASTEEL, 1, MANA_PEARL, 1, MANA_DIAMOND, 1, MANA, 500)
                .buildAndRegister();
        PVIgnore.ignoreForms(TERRASTEEL, Map.of(
                "ingot", () -> BotaniaItems.terrasteel,
                "nugget", () -> BotaniaItems.terrasteelNugget,
                "block", () -> BotaniaBlocks.terrasteelBlock));

        Material ELEMENTIUM = regmat("elementium", "shiny", 0xae647d, 0x31054e).ingot()
                .components(Iron, 1, ALFMANA, 1)
                .buildAndRegister();
        PVIgnore.ignoreForms(ELEMENTIUM, Map.of(
                "ingot", () -> BotaniaItems.elementium,
                "nugget", () -> BotaniaItems.elementiumNugget,
                "block", () -> BotaniaBlocks.elementiumBlock));

        Material DRAGONSTONE = regmat("dragonstone", "shiny", 0xe782b2, 0x5b2474).gem()
                .components(Carbon, 1, ALFMANA, 10)
                .buildAndRegister();
        PVIgnore.ignoreForms(DRAGONSTONE, Map.of(
                "gem", () -> BotaniaItems.dragonstone,
                "block", () -> BotaniaBlocks.dragonstoneBlock));

        Material PIXIE_DUST = regmat("pixie_dust", "shiny", 0xf09faa, 0x5b2474).dust()
                .components(EnderPearl, 1, ALFMANA, 10)
                .buildAndRegister();
        PVIgnore.ignoreForms(PIXIE_DUST, Map.of(
                "dust", () -> BotaniaItems.pixieDust));

        Material ELEMENTIUM_QUARTZ = regmat("elementium_quartz", "quartz", 0xda4fd7, 0xb407a8).gem()
                .components(NetherQuartz, 4, ALFMANA, 1)
                .buildAndRegister();
        PVIgnore.ignoreForms(ELEMENTIUM_QUARTZ, Map.of(
                "gem", () -> ExtraBotanyItems.elementiumQuartz,
                "block", () -> ExtraBotanyBlocks.elementiumQuartzBlock));

        Material LIFE_ESSENCE = regmat("life_essence", "shiny", 0xedfbed, 0xa7eea8).gem()
                .components(SPIRIT, 1)
                .ignoredTagPrefixes(TagPrefix.gemChipped, TagPrefix.gemFlawed, TagPrefix.gemExquisite,
                        TagPrefix.gemFlawless)
                .buildAndRegister();
        PVIgnore.ignoreForms(LIFE_ESSENCE, Map.of(
                "gem", () -> BotaniaItems.lifeEssence));

        Material GAIASTEEL = regmat("gaiasteel", "shiny", 0xedfbed, 0xa7eea8).ingot()
                .components(LIFE_ESSENCE, 4, TERRASTEEL, 1)
                .buildAndRegister();
        PVIgnore.ignoreForms(GAIASTEEL, Map.of(
                "ingot", () -> BotaniaItems.gaiaIngot));

        Material AERIALITE = regmat("aerialite", "shiny", 0x077ea1, 0x012749).ingot()
                .components(DRAGONSTONE, 1, EnderAir, 5000)
                .buildAndRegister();
        PVIgnore.ignoreForms(AERIALITE, Map.of(
                "ingot", () -> ExtraBotanyItems.aerialite,
                "nugget", () -> ExtraBotanyItems.aerialiteNugget,
                "block", () -> ExtraBotanyBlocks.aerialiteBlock));
    };
}
