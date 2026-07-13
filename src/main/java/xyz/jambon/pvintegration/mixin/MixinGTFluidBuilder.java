package xyz.jambon.pvintegration.mixin;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttribute;
import com.gregtechceu.gtceu.api.fluids.attribute.IAttributedFluid;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKey;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;

import net.minecraft.world.level.material.Fluid;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Collection;
import java.util.function.Supplier;

@Mixin(FluidBuilder.class)
public class MixinGTFluidBuilder {

    @Unique
    public Supplier<? extends Fluid> pvcore_external_fluid = null;

    @Unique
    public FluidBuilder pvcore_setExternalFluid(Supplier<? extends Fluid> fluid) {
        this.pvcore_external_fluid = fluid;
        return (FluidBuilder) (Object) this;
    }

    @SuppressWarnings({ "unchecked", "restriction" })
    @Inject(method = "build", at = @At("HEAD"), cancellable = true, remap = false)
    private void pvcore_redirectBuild(Material material, FluidStorageKey key, GTRegistrate registrate,
                                      CallbackInfoReturnable<Supplier<? extends Fluid>> cir) {
        if (pvcore_external_fluid != null) {
            Fluid fluid = pvcore_external_fluid.get();

            if (fluid instanceof IAttributedFluid attributed) {
                Collection<FluidAttribute> attrs = ((AccessorFluidBuilder) (Object) this).getAttributes();

                for (FluidAttribute attr : attrs) {
                    attributed.addAttribute(attr);
                }
            }

            cir.setReturnValue(pvcore_external_fluid);
        }
    }
}
