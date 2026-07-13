package xyz.jambon.pvintegration.mixin;

import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttribute;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Collection;

@Mixin(FluidBuilder.class)
public interface AccessorFluidBuilder {

    @Accessor("attributes")
    Collection<FluidAttribute> getAttributes();
}
