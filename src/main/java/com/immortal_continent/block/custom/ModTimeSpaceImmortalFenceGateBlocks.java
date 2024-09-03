package com.immortal_continent.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ModTimeSpaceImmortalFenceGateBlocks extends FenceGateBlock
{
    public ModTimeSpaceImmortalFenceGateBlocks(Properties pProperties)
    {
        super(pProperties, SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE);
    }

    // 使木板可燃
    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
    {
        return false;
    }
}