package com.vandendaelen.giftsunderthetree.common.blocks;

import com.vandendaelen.giftsunderthetree.client.tabs.GUTTabs;
import com.vandendaelen.giftsunderthetree.utils.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Present extends Block {

    public static final PropertyEnum<PresentType> COLOR = PropertyEnum.create("color", PresentType.class);

    public Present() {
        super(Material.CARPET);
        this.setRegistryName(new ResourceLocation(BlockNames.PRESENT));
        this.setUnlocalizedName("Present");
        this.setDefaultState(this.blockState.getBaseState().withProperty(COLOR,PresentType.RED));
        this.setCreativeTab(GUTTabs.GUTTab);
        this.setResistance(3.0F);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(COLOR, PresentType.VALUES[meta]);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list)
    {
        for (PresentType type : PresentType.VALUES)
        {
            list.add(new ItemStack(this, 1, type.ordinal()));
        }
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(COLOR).ordinal();
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, COLOR);
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return state.getValue(COLOR).ordinal();
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
}
