package com.vandendaelen.giftsunderthetree.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;

public class Gift extends Block {

    public static final PropertyInteger TYPE = PropertyInteger.create("type", 1, 4);
    public ItemBlock item = new ItemBlock(this);

    public Gift() {
        super(Material.CARPET);
        this.setResistance(99999F);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(TYPE, meta);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(TYPE);
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, TYPE);
    }
}
