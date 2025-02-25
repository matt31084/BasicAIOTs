package me.luligabi.basicaiots.mixin;

import net.minecraft.block.Block;
import net.minecraft.item.MiningToolItem;
import net.minecraft.tag.Tag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(MiningToolItem.class)
public interface MiningToolAccessor {

    @Accessor
    Tag<Block> getEffectiveBlocks();

    @Accessor
    float getMiningSpeed();
}