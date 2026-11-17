package xyz.jambon.pvintegration;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.Element;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.api.sound.SoundEntry;
import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.tterrag.registrate.util.entry.RegistryEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.jambon.pvintegration.main.GT.matelem.*;

@Mod(PVIntegration.MOD_ID)
@SuppressWarnings("removal")
public class PVIntegration {

    public static final String MOD_ID = "pvintegration";
    public static final Logger LOGGER = LogManager.getLogger();
    public static GTRegistrate PVINTEGRATION_REGISTRATE = GTRegistrate.create(PVIntegration.MOD_ID);

    public static RegistryEntry<CreativeModeTab> PVI_TAB = PVINTEGRATION_REGISTRATE
            .defaultCreativeTab(PVIntegration.MOD_ID, builder -> builder
                    .title(PVINTEGRATION_REGISTRATE.addLang(
                            "itemGroup", PVIntegration.id("creative_tab"),
                            "Proxima Vis: Integration"))
                    .icon(() -> ChemicalHelper.get(TagPrefix.gem, PVMaterials.ENERGIUM_MAT))
                    .displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator(
                            PVIntegration.MOD_ID, PVINTEGRATION_REGISTRATE))
                    .build())
            .register();

    public PVIntegration() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(this::addCreative);

        modEventBus.addListener(this::addMaterials);
        modEventBus.addListener(this::modifyMaterials);

        modEventBus.addGenericListener(Element.class, this::registerElements);
        modEventBus.addGenericListener(GTRecipeType.class, this::registerRecipeTypes);
        modEventBus.addGenericListener(MachineDefinition.class, this::registerMachines);
        modEventBus.addGenericListener(SoundEntry.class, this::registerSounds);

        // Most other events are fired on Forge's bus.
        // If we want to use annotations to register event listeners,
        // we need to register our object like this!
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            LOGGER.info("PV:I found a {}!", ChemicalHelper.get(TagPrefix.gem, PVMaterials.ENERGIUM_MAT));
        });
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("Hey, we're on Minecraft version {}!", Minecraft.getInstance().getLaunchedVersion());
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {}

    private void addMaterials(MaterialEvent event) {
        PVMaterials.init();
    }

    private void modifyMaterials(PostMaterialEvent event) {}

    private void registerElements(GTCEuAPI.RegisterEvent<ResourceLocation, Element> event) {
        PVElements.init();
    }

    private void registerRecipeTypes(GTCEuAPI.RegisterEvent<ResourceLocation, GTRecipeType> event) {
        // CustomRecipeTypes.init();
    }

    private void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {
        // CustomMachines.init();
    }

    public void registerSounds(GTCEuAPI.RegisterEvent<ResourceLocation, SoundEntry> event) {
        // CustomSounds.init();
    }
}
