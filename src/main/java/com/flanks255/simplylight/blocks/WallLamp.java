package com.flanks255.simplylight.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraftforge.common.ToolType;

public class WallLamp extends RotatableLamp{
    public WallLamp(String name) {
        super(name, Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().lightValue(15).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.0f));

        UP = VoxelShapes.create(0.375,0.0, 0.375,0.625, 0.125,0.625);
        DOWN = VoxelShapes.create(0.375, 1.0, 0.375, 0.625, 1.0 - 0.125, 0.625);
        EAST = VoxelShapes.create(0.0, 0.375, 0.25, 0.1875, 0.625, 0.75);
        WEST = VoxelShapes.create(1.0, 0.375, 0.25, 1.0 - 0.1875, 0.625, 0.75);
        NORTH = VoxelShapes.create(0.25, 0.375, 1.0, 0.75, 0.625, 1.0 - 0.1875);
        SOUTH = VoxelShapes.create(0.25, 0.375, 0.0, 0.75, 0.625, 0.1875);
    }
}
