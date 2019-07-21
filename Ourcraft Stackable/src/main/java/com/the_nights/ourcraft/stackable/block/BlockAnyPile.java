/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.the_nights.ourcraft.stackable.block;

import com.the_nights.ourcraft.stackable.OurcraftStackable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockReader;

/**
 *
 * @author Stephanie
 */
public class BlockAnyPile extends BlockPile {
    
    public BlockAnyPile(Block.Properties prprts) {
        super(prprts.sound(SoundType.GROUND));
        this.setRegistryName(new ResourceLocation(OurcraftStackable.MODID, "any_pile"));        
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new TileAnyPile();
    }    
}
