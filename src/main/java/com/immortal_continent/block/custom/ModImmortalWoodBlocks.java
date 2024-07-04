package com.immortal_continent.block.custom;

import com.immortal_continent.block.ModFireResistantBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class ModImmortalWoodBlocks extends RotatedPillarBlock
{
    public ModImmortalWoodBlocks(Properties pProperties)
    {
        super(pProperties);
    }

    // 使木头不可燃
    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction)
    {
        return false;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate)
    {
        if(context.getItemInHand().getItem() instanceof AxeItem)
        {
            if(state.is(ModFireResistantBlocks.IMMORTAL_LOG.get()))
            {
                return ModFireResistantBlocks.STRIPPED_IMMORTAL_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModFireResistantBlocks.IMMORTAL_WOOD.get()))
            {
                return ModFireResistantBlocks.STRIPPED_IMMORTAL_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}