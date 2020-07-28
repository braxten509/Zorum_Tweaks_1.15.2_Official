package com.elitethaumaturge.zorumtweaks.items.misc;

import com.elitethaumaturge.zorumtweaks.ZorumTweaks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class VoidBag extends Item {
    public VoidBag() {
        super(new Properties().group(ZorumTweaks.TAB));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        //tooltip.add(new StringTextComponent("So strange, yet wonderful...").applyTextStyle(TextFormatting.GRAY));
    }

}
