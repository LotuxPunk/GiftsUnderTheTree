package com.vandendaelen.giftsunderthetree.common.blocks;

import com.vandendaelen.giftsunderthetree.utils.Reference;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;

public enum PresentType implements IStringSerializable {
    RED("present_1.png"),
    PINK("present_2.png"),
    BLUE("present_3.png"),
    GREEN("present_4.png")
    ;

    public static final PresentType VALUES[] = values();
    public final String name;
    public final ResourceLocation modelTexture;

    PresentType(String modelTexture){
        this.name = this.name().toLowerCase();
        this.modelTexture = new ResourceLocation(Reference.MODID, "textures/blocks/"+modelTexture);
    }
    @Override
    public String getName() {
        return this.name;
    }
}
