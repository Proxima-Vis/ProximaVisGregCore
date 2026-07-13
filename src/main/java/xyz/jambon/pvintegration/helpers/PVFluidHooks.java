package xyz.jambon.pvintegration.helpers;

import com.gregtechceu.gtceu.api.fluids.FluidBuilder;

import net.minecraft.world.level.material.Fluid;

import java.util.function.Supplier;

public final class PVFluidHooks {

    private PVFluidHooks() {}

    public static FluidBuilder withExternalFluid(FluidBuilder builder,
                                                 Supplier<? extends Fluid> fluidSupplier) {
        try {
            var field = builder.getClass().getDeclaredField("pvcore_external_fluid");
            field.setAccessible(true);
            field.set(builder, fluidSupplier);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new IllegalStateException("Failed to set pvcore_external_fluid on FluidBuilder", e);
        }
        return builder;
    }
}
