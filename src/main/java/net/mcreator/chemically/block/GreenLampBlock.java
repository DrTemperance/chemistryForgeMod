
package net.mcreator.chemically.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class GreenLampBlock extends Block implements SimpleWaterloggedBlock, EntityBlock {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public GreenLampBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.CHAIN).strength(0.8f, 8f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(6, 0, 6, 10, 4, 10), box(6.5, 4, 6.5, 9.5, 5, 9.5), box(6.75, 5, 6.75, 9.25, 5.5, 9.25), box(6.5, 5.75, 7, 7, 8.75, 9), box(7, 5.75, 6.5, 9, 8.75, 7), box(9, 5.75, 7, 9.5, 8.75, 9), box(7, 5.75, 9, 9, 8.75, 9.5),
					box(7, 5.5, 7, 9, 9, 9), box(7.5, 4.75, 7.5, 8.5, 5.75, 8.5));
			case NORTH -> Shapes.or(box(6, 0, 6, 10, 4, 10), box(6.5, 4, 6.5, 9.5, 5, 9.5), box(6.75, 5, 6.75, 9.25, 5.5, 9.25), box(9, 5.75, 7, 9.5, 8.75, 9), box(7, 5.75, 9, 9, 8.75, 9.5), box(6.5, 5.75, 7, 7, 8.75, 9),
					box(7, 5.75, 6.5, 9, 8.75, 7), box(7, 5.5, 7, 9, 9, 9), box(7.5, 4.75, 7.5, 8.5, 5.75, 8.5));
			case EAST -> Shapes.or(box(6, 0, 6, 10, 4, 10), box(6.5, 4, 6.5, 9.5, 5, 9.5), box(6.75, 5, 6.75, 9.25, 5.5, 9.25), box(7, 5.75, 9, 9, 8.75, 9.5), box(6.5, 5.75, 7, 7, 8.75, 9), box(7, 5.75, 6.5, 9, 8.75, 7),
					box(9, 5.75, 7, 9.5, 8.75, 9), box(7, 5.5, 7, 9, 9, 9), box(7.5, 4.75, 7.5, 8.5, 5.75, 8.5));
			case WEST -> Shapes.or(box(6, 0, 6, 10, 4, 10), box(6.5, 4, 6.5, 9.5, 5, 9.5), box(6.75, 5, 6.75, 9.25, 5.5, 9.25), box(7, 5.75, 6.5, 9, 8.75, 7), box(9, 5.75, 7, 9.5, 8.75, 9), box(7, 5.75, 9, 9, 8.75, 9.5),
					box(6.5, 5.75, 7, 7, 8.75, 9), box(7, 5.5, 7, 9, 9, 9), box(7.5, 4.75, 7.5, 8.5, 5.75, 8.5));
			case UP -> Shapes.or(box(6, 6, 0, 10, 10, 4), box(6.5, 6.5, 4, 9.5, 9.5, 5), box(6.75, 6.75, 5, 9.25, 9.25, 5.5), box(9, 7, 5.75, 9.5, 9, 8.75), box(7, 6.5, 5.75, 9, 7, 8.75), box(6.5, 7, 5.75, 7, 9, 8.75), box(7, 9, 5.75, 9, 9.5, 8.75),
					box(7, 7, 5.5, 9, 9, 9), box(7.5, 7.5, 4.75, 8.5, 8.5, 5.75));
			case DOWN -> Shapes.or(box(6, 6, 12, 10, 10, 16), box(6.5, 6.5, 11, 9.5, 9.5, 12), box(6.75, 6.75, 10.5, 9.25, 9.25, 11), box(9, 7, 7.25, 9.5, 9, 10.25), box(7, 9, 7.25, 9, 9.5, 10.25), box(6.5, 7, 7.25, 7, 9, 10.25),
					box(7, 6.5, 7.25, 9, 7, 10.25), box(7, 7, 7, 9, 9, 10.5), box(7.5, 7.5, 10.25, 8.5, 8.5, 11.25));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return this.defaultBlockState().setValue(FACING, context.getClickedFace()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
		return true;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 0;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			GreenLampRedstoneOnProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		}
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new GreenLampBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof GreenLampBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof GreenLampBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}