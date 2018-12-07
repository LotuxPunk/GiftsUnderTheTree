package com.vandendaelen.giftsunderthetree.common.blocks;

import com.vandendaelen.giftsunderthetree.common.tileentities.TreeTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Tree extends Block implements ITileEntityProvider {

    public Tree() {
        super(Material.WOOD);
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return super.hasTileEntity(state);
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TreeTileEntity();
    }
}
