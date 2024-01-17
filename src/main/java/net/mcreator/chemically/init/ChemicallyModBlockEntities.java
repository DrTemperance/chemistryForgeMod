
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemically.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.chemically.block.entity.SinusoidalWaveBlockEntity;
import net.mcreator.chemically.block.entity.ServerBlockEntity;
import net.mcreator.chemically.block.entity.PowerCellBlockEntity;
import net.mcreator.chemically.block.entity.LpmdsBlockEntity;
import net.mcreator.chemically.block.entity.LaunchPadBlockEntity;
import net.mcreator.chemically.block.entity.HydraulicPressBlockEntity;
import net.mcreator.chemically.block.entity.ConveyerBlockEntity;
import net.mcreator.chemically.block.entity.AcceleratorBlockEntity;
import net.mcreator.chemically.ChemicallyMod;

public class ChemicallyModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ChemicallyMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SERVER = register("server", ChemicallyModBlocks.SERVER, ServerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CONVEYER = register("conveyer", ChemicallyModBlocks.CONVEYER, ConveyerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SINUSOIDAL_WAVE = register("sinusoidal_wave", ChemicallyModBlocks.SINUSOIDAL_WAVE, SinusoidalWaveBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HYDRAULIC_PRESS = register("hydraulic_press", ChemicallyModBlocks.HYDRAULIC_PRESS, HydraulicPressBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POWER_CELL = register("power_cell", ChemicallyModBlocks.POWER_CELL, PowerCellBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ACCELERATOR = register("accelerator", ChemicallyModBlocks.ACCELERATOR, AcceleratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LAUNCH_PAD = register("launch_pad", ChemicallyModBlocks.LAUNCH_PAD, LaunchPadBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LPMDS = register("lpmds", ChemicallyModBlocks.LPMDS, LpmdsBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
