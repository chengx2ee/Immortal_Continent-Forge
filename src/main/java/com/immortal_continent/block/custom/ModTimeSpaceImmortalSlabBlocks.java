package com.immortal_continent.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ModTimeSpaceImmortalSlabBlocks extends SlabBlock
{
    public ModTimeSpaceImmortalSlabBlocks(Properties pProperties)
    {
        super(pProperties);
    }

    // 使木板可燃
    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
    {
        return false;
    }
}