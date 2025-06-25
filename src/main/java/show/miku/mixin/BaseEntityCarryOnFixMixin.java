package show.miku.mixin;

import com.yuntang.entity.BaseEntity;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.Inventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BaseEntity.class)
public abstract class BaseEntityCarryOnFixMixin {
    @Inject(method = "method_5453", at = @At("HEAD"), cancellable = true)
    private void yuntang$preventServerLogicOnClient(Inventory sender, CallbackInfo ci) {
        Entity self = (Entity) (Object) this;
        if (self.getWorld() == null || self.getWorld().isClient()) {
            ci.cancel();
        }
    }
}