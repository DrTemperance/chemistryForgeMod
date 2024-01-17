package net.mcreator.chemically.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.chemically.init.ChemicallyModItems;

public class BeakerRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double iteration = 0;
		ItemStack candidate = ItemStack.EMPTY;
		ItemStack Item1 = ItemStack.EMPTY;
		ItemStack Item2 = ItemStack.EMPTY;
		ItemStack Item3 = ItemStack.EMPTY;
		ItemStack IteratorOutput = ItemStack.EMPTY;
		candidate = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		if (((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ChemicallyModItems.BEAKER.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ChemicallyModItems.FLASK.get())
				&& !(entity instanceof Player _plrCldCheck6 && _plrCldCheck6.getCooldowns().isOnCooldown(itemstack.getItem()))) {
			if (!(candidate.getItem() == ChemicallyModItems.BEAKER.get() || candidate.getItem() == ChemicallyModItems.FLASK.get())) {
				if (itemstack.getOrCreateTag().getDouble("content1") == 0) {
					itemstack.getOrCreateTag().putDouble("content1", (candidate.getItem() == ChemicallyModItems.BEAKER.get() ? 0 : 0));
					candidate.shrink(1);
				} else if (itemstack.getOrCreateTag().getDouble("content2") == 0) {
					itemstack.getOrCreateTag().putDouble("content2", (candidate.getItem() == ChemicallyModItems.BEAKER.get() ? 0 : 0));
					candidate.shrink(1);
				} else if (itemstack.getOrCreateTag().getDouble("content3") == 0) {
					itemstack.getOrCreateTag().putDouble("content3", (candidate.getItem() == ChemicallyModItems.BEAKER.get() ? 0 : 0));
					candidate.shrink(1);
				}
			} else if (candidate.getItem() == ItemStack.EMPTY.getItem()) {
				iteration = 0;
				for (int index0 = 0; index0 < 3; index0++) {
					iteration = iteration + 1;
					if (itemstack.getOrCreateTag().getDouble((("content").strip() + "" + iteration)) == 0) {
						IteratorOutput = ItemStack.EMPTY;
					} else if (itemstack.getOrCreateTag().getDouble((("content").strip() + "" + iteration)) == 1) {
						IteratorOutput = new ItemStack(ChemicallyModItems.HYDROGEN.get());
					} else {
						IteratorOutput = ItemStack.EMPTY;
					}
					if (iteration == 1) {
						Item1 = IteratorOutput;
					} else if (iteration == 2) {
						Item2 = IteratorOutput;
					} else if (iteration == 3) {
						Item3 = IteratorOutput;
					}
				}
				if (entity.isShiftKeyDown()) {
					itemstack.getOrCreateTag().putDouble("content1", 0);
					if (entity instanceof Player _player) {
						ItemStack _setstack = Item1;
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					itemstack.getOrCreateTag().putDouble("content2", 0);
					if (entity instanceof Player _player) {
						ItemStack _setstack = Item2;
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					itemstack.getOrCreateTag().putDouble("content3", 0);
					if (entity instanceof Player _player) {
						ItemStack _setstack = Item3;
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (!(itemstack.getOrCreateTag().getDouble("content3") == 0)) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = Item3;
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					itemstack.getOrCreateTag().putDouble("content3", 0);
				} else if (!(itemstack.getOrCreateTag().getDouble("content2") == 0)) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = Item2;
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					itemstack.getOrCreateTag().putDouble("content2", 0);
				} else if (!(itemstack.getOrCreateTag().getDouble("content1") == 0)) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = Item1;
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					itemstack.getOrCreateTag().putDouble("content1", 0);
				}
			} else {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
			}
		}
	}
}
