package com.immortal_continent.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ModOthersStairBlocks extends StairBlock
{
    public ModOthersStairBlocks(BlockState baseState, Properties pProperties)
    {
        super(baseState, pProperties);
    }

    // 使木板可燃
    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
    {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
    {
        return 16;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
    {
        return 2;
    }
}