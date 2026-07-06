package xyz.jambon.pvgtcore.mixin;

import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttribute;
import com.gregtechceu.gtceu.api.fluids.attribute.IAttributedFluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

import java.util.Collection;

@Mixin(ForgeFlowingFluid.class)
public abstract class MixinForgeFlowingFluid implements IAttributedFluid {

    @Unique
    private final Collection<FluidAttribute> pvcore_gt_attributes = new ObjectLinkedOpenHashSet<>();

    @Override
    public void addAttribute(@NotNull FluidAttribute attribute) {
        pvcore_gt_attributes.add(attribute);
    }

    @Override
    public Collection<FluidAttribute> getAttributes() {
        return pvcore_gt_attributes;
    }
}
