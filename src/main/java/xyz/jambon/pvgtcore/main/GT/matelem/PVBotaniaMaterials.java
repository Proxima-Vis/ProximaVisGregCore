package xyz.jambon.pvgtcore.main.GT.matelem;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import net.minecraft.sounds.SoundEvent;
import vazkii.botania.common.block.BotaniaBlock;
import vazkii.botania.common.block.BotaniaBlocks;
import vazkii.botania.common.handler.BotaniaSounds;
import vazkii.botania.common.item.BotaniaItems;
import xyz.jambon.pvgtcore.PVGTCore;
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
    public static Material ALFQUARTZ;
    public static Material LIFE_ESSENCE;
    public static Material GAIA_SPIRIT;
    public static Material AERIALITE;
    public static Material PHOTONIUM;
    public static Material SHADOWIUM;
    public static Material ORICHALCOS;

    public static void register() {
        Material MANASTEEL = regmat("manasteel", "shiny", 0x4c82a9, 0x171781).ingot()
                .components(Iron, 1, MANA, 1)
                .buildAndRegister();

        /*PVIgnore.ignoreForms(MANASTEEL, Map.of(
               "ingot", BotaniaItems.manaSteel
        ));*/
    }
}
