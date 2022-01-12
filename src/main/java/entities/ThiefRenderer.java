package entities;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;
import test_mod.Test_mod;

import javax.annotation.Nonnull;

public class ThiefRenderer extends HumanoidMobRenderer {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Test_mod.MODID, "textures/entity/thief.png");

    public ThiefRenderer(EntityRendererProvider.Context context){
        super(context, new ThiefModel(context.bakeLayer(ThiefModel.THIEF_LAYER)), 1f );
    }

    @Nonnull

    public ResourceLocation getTextureLocation(ThiefEntity entity) {
        return TEXTURE;
    }
}
