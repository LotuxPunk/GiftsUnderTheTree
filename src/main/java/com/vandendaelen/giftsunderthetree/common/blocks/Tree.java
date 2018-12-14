package com.vandendaelen.giftsunderthetree.common.blocks;

import com.vandendaelen.giftsunderthetree.client.tabs.GUTTabs;
import com.vandendaelen.giftsunderthetree.common.tileentities.TreeTileEntity;
import com.vandendaelen.giftsunderthetree.utils.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Tree extends Block implements ITileEntityProvider {

    public Tree() {
        super(Material.WOOD);
        this.setRegistryName(new ResourceLocation(BlockNames.TREE));
        this.setUnlocalizedName("Tree");
        this.setCreativeTab(GUTTabs.GUTTab);
        this.setResistance(3.0F);
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
