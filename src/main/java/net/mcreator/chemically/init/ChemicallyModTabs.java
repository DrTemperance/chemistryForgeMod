
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemically.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.chemically.ChemicallyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChemicallyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChemicallyMod.MODID);
	public static final RegistryObject<CreativeModeTab> GASSES = REGISTRY.register("gasses",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.chemically.gasses")).icon(() -> new ItemStack(Items.GLASS_BOTTLE)).displayItems((parameters, tabData) -> {
				tabData.accept(ChemicallyModItems.HYDROGEN.get());
				tabData.accept(ChemicallyModItems.NITROGEN.get());
				tabData.accept(ChemicallyModItems.AMMONIA.get());
				tabData.accept(ChemicallyModItems.HAT.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> SOLIDS = REGISTRY.register("solids",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.chemically.solids")).icon(() -> new ItemStack(Items.IRON_INGOT)).displayItems((parameters, tabData) -> {
				tabData.accept(ChemicallyModItems.WITHERITE_INGOT.get());
				tabData.accept(ChemicallyModBlocks.WITHERITE.get().asItem());
				tabData.accept(ChemicallyModItems.URANIUM_INGOT.get());
				tabData.accept(ChemicallyModBlocks.URANIUM_BLOCK.get().asItem());
				tabData.accept(ChemicallyModBlocks.RAW_URANIUM_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.RAW_URANIUM.get());
				tabData.accept(ChemicallyModBlocks.TIME_CRYSTAL_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.TIME_CRYSTAL.get());
				tabData.accept(ChemicallyModItems.LEAD_INGOT.get());
				tabData.accept(ChemicallyModBlocks.LEAD_BLOCK.get().asItem());
				tabData.accept(ChemicallyModBlocks.RAW_LEAD_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.RAW_LEAD_ITEM.get());
				tabData.accept(ChemicallyModItems.NICKEL_INGOT.get());
				tabData.accept(ChemicallyModBlocks.RAW_NICKEL_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.RAW_NICKEL_ITEM.get());
				tabData.accept(ChemicallyModItems.SILVER_INGOT.get());
				tabData.accept(ChemicallyModBlocks.SILVER_BLOCK.get().asItem());
				tabData.accept(ChemicallyModBlocks.RAW_SILVER_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.RAW_SILVER.get());
				tabData.accept(ChemicallyModItems.ALUMINUM_INGOT.get());
				tabData.accept(ChemicallyModBlocks.ALUMINUM_BLOCK.get().asItem());
				tabData.accept(ChemicallyModBlocks.RAW_ALUMINUM_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.RAW_ALUMINUM.get());
				tabData.accept(ChemicallyModBlocks.SULFUR_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.SULFUR.get());
				tabData.accept(ChemicallyModItems.PHOSPHOROUS.get());
				tabData.accept(ChemicallyModItems.IODINE.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> MOD_MISC = REGISTRY.register("mod_misc",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.chemically.mod_misc")).icon(() -> new ItemStack(ChemicallyModItems.TIME_CRYSTAL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChemicallyModItems.TEST_TUBE.get());
				tabData.accept(ChemicallyModItems.GAS_CYLINDER.get());
				tabData.accept(ChemicallyModItems.FLASK.get());
				tabData.accept(ChemicallyModItems.BEAKER.get());
				tabData.accept(ChemicallyModBlocks.SERVER.get().asItem());
				tabData.accept(ChemicallyModBlocks.CONVEYER.get().asItem());
				tabData.accept(ChemicallyModBlocks.SINUSOIDAL_WAVE.get().asItem());
				tabData.accept(ChemicallyModBlocks.POLARITY_DEVICE.get().asItem());
				tabData.accept(ChemicallyModBlocks.HYDRAULIC_PRESS.get().asItem());
				tabData.accept(ChemicallyModBlocks.POWER_CELL.get().asItem());
				tabData.accept(ChemicallyModBlocks.ELECTROMAGNETIC_FIELD_GENERATOR.get().asItem());
				tabData.accept(ChemicallyModBlocks.ACCELERATOR.get().asItem());
				tabData.accept(ChemicallyModBlocks.LAUNCH_PAD.get().asItem());
				tabData.accept(ChemicallyModItems.FUEL_CANISTER.get());
				tabData.accept(ChemicallyModItems.WRENCH.get());
				tabData.accept(ChemicallyModItems.SCANNER.get());
				tabData.accept(ChemicallyModItems.LITHIUM_ION_BATTERY.get());
				tabData.accept(ChemicallyModItems.THERMITE_GRENAD.get());
				tabData.accept(ChemicallyModItems.REINFORCED_STICK.get());
				tabData.accept(ChemicallyModItems.COPPER_ROD.get());
				tabData.accept(ChemicallyModItems.NICKEL_ROD.get());
				tabData.accept(ChemicallyModItems.IRON_ROD.get());
				tabData.accept(ChemicallyModItems.STEEL_ROD.get());
				tabData.accept(ChemicallyModItems.GOLD_ROD.get());
				tabData.accept(ChemicallyModItems.COPPER_WIRE.get());
				tabData.accept(ChemicallyModItems.REDSTONE_WIRE.get());
				tabData.accept(ChemicallyModItems.STEEL_WIRE_SPOOL.get());
				tabData.accept(ChemicallyModItems.FARADAY_ARMOR_HELMET.get());
				tabData.accept(ChemicallyModItems.FARADAY_ARMOR_CHESTPLATE.get());
				tabData.accept(ChemicallyModItems.FARADAY_ARMOR_LEGGINGS.get());
				tabData.accept(ChemicallyModItems.FARADAY_ARMOR_BOOTS.get());
				tabData.accept(ChemicallyModItems.STEEL_HELMET.get());
				tabData.accept(ChemicallyModItems.STEEL_CHESTPLATE.get());
				tabData.accept(ChemicallyModItems.STEEL_LEGGINGS.get());
				tabData.accept(ChemicallyModItems.STEEL_BOOTS.get());
				tabData.accept(ChemicallyModBlocks.LABORATORY_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.CIRCUIT_BOARD.get());
				tabData.accept(ChemicallyModItems.LOGIC_CIRCUIT.get());
				tabData.accept(ChemicallyModBlocks.CAUTION.get().asItem());
				tabData.accept(ChemicallyModBlocks.RED_CAUTION.get().asItem());
				tabData.accept(ChemicallyModBlocks.QUARTZ_LAMP.get().asItem());
				tabData.accept(ChemicallyModBlocks.POWDERED_REDSTONE.get().asItem());
				tabData.accept(ChemicallyModItems.GRAVITY_GUN.get());
				tabData.accept(ChemicallyModItems.COCKROACH_SPAWN_EGG.get());
				tabData.accept(ChemicallyModItems.COCKROACH_WING.get());
				tabData.accept(ChemicallyModBlocks.TEMPORAL_LAMP.get().asItem());
				tabData.accept(ChemicallyModBlocks.CHISELED_PURPUR.get().asItem());
				tabData.accept(ChemicallyModBlocks.OBSIDIAN_BRICKS.get().asItem());
				tabData.accept(ChemicallyModBlocks.OBSIDIAN_TILES.get().asItem());
				tabData.accept(ChemicallyModBlocks.OBSIDIAN_RUNES.get().asItem());
				tabData.accept(ChemicallyModBlocks.DEEPSLATE_SQUARES.get().asItem());
				tabData.accept(ChemicallyModBlocks.POLISHED_ENDSTONE.get().asItem());
				tabData.accept(ChemicallyModBlocks.ENDSTONE_PILLAR.get().asItem());
				tabData.accept(ChemicallyModBlocks.SANDSTONE_FIRE_TRAP.get().asItem());
				tabData.accept(ChemicallyModBlocks.CHISELED_STONE_BRICK_PILLAR.get().asItem());
				tabData.accept(ChemicallyModBlocks.STONE_TILES.get().asItem());
				tabData.accept(ChemicallyModBlocks.STONE_PILLAR.get().asItem());
				tabData.accept(ChemicallyModBlocks.CHISELED_ENDSTONE.get().asItem());
				tabData.accept(ChemicallyModBlocks.STEEL_FACTORY_FLOOR.get().asItem());
				tabData.accept(ChemicallyModBlocks.ALUMINUM_DOOR.get().asItem());
				tabData.accept(ChemicallyModItems.LIGHT_BULB.get());
				tabData.accept(ChemicallyModItems.ANTENNA.get());
				tabData.accept(ChemicallyModItems.CAPACITOR.get());
				tabData.accept(ChemicallyModItems.ENGINE_PISTON.get());
				tabData.accept(ChemicallyModItems.SERVO.get());
				tabData.accept(ChemicallyModItems.ADVANCED_LOGIC_CIRCUIT.get());
				tabData.accept(ChemicallyModItems.ADVANCED_COMPUTATION_CIRCUIT.get());
				tabData.accept(ChemicallyModItems.BIOMASS.get());
				tabData.accept(ChemicallyModBlocks.PURPLE_TULIP.get().asItem());
				tabData.accept(ChemicallyModItems.EPHEDRA.get());
				tabData.accept(ChemicallyModItems.EPHEDRA_SEEDS.get());
				tabData.accept(ChemicallyModBlocks.SULFUR_ORE.get().asItem());
				tabData.accept(ChemicallyModBlocks.LEAD_ORE.get().asItem());
				tabData.accept(ChemicallyModBlocks.URANIUM_DEEPSLATE_ORE.get().asItem());
				tabData.accept(ChemicallyModBlocks.URANIUM_ORE.get().asItem());
				tabData.accept(ChemicallyModBlocks.GREEN_LAMP.get().asItem());
				tabData.accept(ChemicallyModItems.ELECTRIC_LIGHTER.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> COMPOUNDS_AND_ALLOYS = REGISTRY.register("compounds_and_alloys",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.chemically.compounds_and_alloys")).icon(() -> new ItemStack(ChemicallyModItems.STEEL_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChemicallyModBlocks.SUPERCONDUCTIVE_MAGNET.get().asItem());
				tabData.accept(ChemicallyModBlocks.ASPHALT.get().asItem());
				tabData.accept(ChemicallyModBlocks.ASBESTOS.get().asItem());
				tabData.accept(ChemicallyModItems.REFINED_QUARTZ.get());
				tabData.accept(ChemicallyModItems.ADHESIVE.get());
				tabData.accept(ChemicallyModItems.ALUMINOSILICATE.get());
				tabData.accept(ChemicallyModItems.POLYVINYL_CHLORIDE.get());
				tabData.accept(ChemicallyModItems.POLYETHYLENE.get());
				tabData.accept(ChemicallyModItems.RUBBER.get());
				tabData.accept(ChemicallyModItems.SALTPETER.get());
				tabData.accept(ChemicallyModItems.PSEUDOEPHEDRINE.get());
				tabData.accept(ChemicallyModItems.CYANIDE.get());
				tabData.accept(ChemicallyModItems.NITRATE_DUST.get());
				tabData.accept(ChemicallyModItems.METH.get());
				tabData.accept(ChemicallyModItems.THERMITE.get());
				tabData.accept(ChemicallyModBlocks.STEEL_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.STEEL_INGOT.get());
				tabData.accept(ChemicallyModBlocks.AQUAMARINE_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.AQUAMARINE.get());
				tabData.accept(ChemicallyModBlocks.JADE_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.JADE.get());
				tabData.accept(ChemicallyModBlocks.ONYX_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.ONYX.get());
				tabData.accept(ChemicallyModBlocks.RUBY_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.RUBY.get());
				tabData.accept(ChemicallyModBlocks.BRONZE_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.BRONZE_INGOT.get());
				tabData.accept(ChemicallyModItems.CONSTANTAN_INGOT.get());
				tabData.accept(ChemicallyModItems.ELECTRUM_INGOT.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> BACKROOMS = REGISTRY.register("backrooms",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.chemically.backrooms")).icon(() -> new ItemStack(ChemicallyModBlocks.THRESHOLD_STRUCTURE_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChemicallyModBlocks.HIGH_VELOCITY_ROTOR.get().asItem());
				tabData.accept(ChemicallyModBlocks.LPMDS.get().asItem());
				tabData.accept(ChemicallyModBlocks.RF_CAVITY_RESONATOR.get().asItem());
				tabData.accept(ChemicallyModBlocks.THRESHOLD_STRUCTURE_BLOCK.get().asItem());
				tabData.accept(ChemicallyModItems.NANOPHOTONIC_ELECTRON_ACCELERATOR.get());
				tabData.accept(ChemicallyModItems.PORTABLE_LPMDS.get());
				tabData.accept(ChemicallyModItems.SYNCHROTRON.get());
				tabData.accept(ChemicallyModItems.EVERYTHING.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(ChemicallyModBlocks.FRAMED_BRICKS.get().asItem());
			tabData.accept(ChemicallyModBlocks.BORDERED_BRICKS.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ChemicallyModItems.URANIUM_ARMOR_HELMET.get());
			tabData.accept(ChemicallyModItems.URANIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(ChemicallyModItems.URANIUM_ARMOR_LEGGINGS.get());
			tabData.accept(ChemicallyModItems.URANIUM_ARMOR_BOOTS.get());
			tabData.accept(ChemicallyModItems.URANIUM_SWORD.get());
			tabData.accept(ChemicallyModItems.COPPER_ARMOR_HELMET.get());
			tabData.accept(ChemicallyModItems.COPPER_ARMOR_CHESTPLATE.get());
			tabData.accept(ChemicallyModItems.COPPER_ARMOR_LEGGINGS.get());
			tabData.accept(ChemicallyModItems.COPPER_ARMOR_BOOTS.get());
			tabData.accept(ChemicallyModItems.COPPER_SWORD.get());
			tabData.accept(ChemicallyModItems.LEAD_ARMOR_HELMET.get());
			tabData.accept(ChemicallyModItems.LEAD_ARMOR_CHESTPLATE.get());
			tabData.accept(ChemicallyModItems.LEAD_ARMOR_LEGGINGS.get());
			tabData.accept(ChemicallyModItems.LEAD_ARMOR_BOOTS.get());
			tabData.accept(ChemicallyModItems.LEAD_SWORD.get());
			tabData.accept(ChemicallyModItems.ALUMINUM_ARMOR_HELMET.get());
			tabData.accept(ChemicallyModItems.ALUMINUM_ARMOR_CHESTPLATE.get());
			tabData.accept(ChemicallyModItems.ALUMINUM_ARMOR_LEGGINGS.get());
			tabData.accept(ChemicallyModItems.ALUMINUM_ARMOR_BOOTS.get());
			tabData.accept(ChemicallyModItems.ALUMINUM_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ChemicallyModItems.URANIUM_AXE.get());
			tabData.accept(ChemicallyModItems.URANIUM_PICKAXE.get());
			tabData.accept(ChemicallyModItems.URANIUM_SHOVEL.get());
			tabData.accept(ChemicallyModItems.URANIUM_HOE.get());
			tabData.accept(ChemicallyModItems.COPPER_PICKAXE.get());
			tabData.accept(ChemicallyModItems.COPPER_AXE.get());
			tabData.accept(ChemicallyModItems.COPPER_SHOVEL.get());
			tabData.accept(ChemicallyModItems.COPPER_HOE.get());
			tabData.accept(ChemicallyModItems.LEAD_PICKAXE.get());
			tabData.accept(ChemicallyModItems.LEAD_AXE.get());
			tabData.accept(ChemicallyModItems.LEAD_SHOVEL.get());
			tabData.accept(ChemicallyModItems.LEAD_HOE.get());
			tabData.accept(ChemicallyModItems.ALUMINUM_PICKAXE.get());
			tabData.accept(ChemicallyModItems.ALUMINUM_AXE.get());
			tabData.accept(ChemicallyModItems.ALUMINUM_SHOVEL.get());
			tabData.accept(ChemicallyModItems.ALUMINUM_HOE.get());
		}
	}
}
