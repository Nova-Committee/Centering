package committee.nova.centering.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockBehaviour.BlockStateBase.class)
public abstract class MixinAbstractBlock {
    @Inject(method = "getOffset", at = @At("HEAD"), cancellable = true)
    private void inject$getOffset(BlockGetter blockGetter, BlockPos blockPos, CallbackInfoReturnable<Vec3> cir) {
        cir.setReturnValue(Vec3.ZERO);
    }
}
