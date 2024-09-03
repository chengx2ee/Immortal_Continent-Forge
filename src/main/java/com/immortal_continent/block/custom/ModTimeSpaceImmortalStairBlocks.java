package com.immortal_continent.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ModTimeSpaceImmortalStairBlocks extends StairBlock
{
    public ModTimeSpaceImmortalStairBlocks(BlockState baseState, Properties pProperties)
    {
        super(baseState, pProperties);
    }

    // 使木板不可燃
    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
    {
        return false;
    }
}