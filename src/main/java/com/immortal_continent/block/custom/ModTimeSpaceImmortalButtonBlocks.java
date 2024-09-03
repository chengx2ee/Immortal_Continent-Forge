package com.immortal_continent.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ModTimeSpaceImmortalButtonBlocks extends ButtonBlock
{
    public ModTimeSpaceImmortalButtonBlocks(Properties pProperties)
    {
        super(pProperties, BlockSetType.OAK, 30, true);
    }

    // 按钮不可燃
    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
    {
        return false;
    }
}