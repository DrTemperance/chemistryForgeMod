
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemically.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.chemically.world.inventory.HydraulicPressGUIMenu;
import net.mcreator.chemically.ChemicallyMod;

public class ChemicallyModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ChemicallyMod.MODID);
	public static final RegistryObject<MenuType<HydraulicPressGUIMenu>> HYDRAULIC_PRESS_GUI = REGISTRY.register("hydraulic_press_gui", () -> IForgeMenuType.create(HydraulicPressGUIMenu::new));
}
