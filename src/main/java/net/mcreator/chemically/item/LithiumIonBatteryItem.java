
package net.mcreator.chemically.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.chemically.procedures.LithiumIonBatterySpecialInformationProcedure;
import net.mcreator.chemically.procedures.LithiumIonBatteryRightclickedOnBlockProcedure;
import net.mcreator.chemically.procedures.LithiumIonBatteryItemInInventoryTickProcedure;

import java.util.List;

public class LithiumIonBatteryItem extends Item {
	public LithiumIonBatteryItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0.8f;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		Entity entity = itemstack.getEntityRepresentation();
		double x = entity != null ? entity.getX() : 0.0;
		double y = entity != null ? entity.getY() : 0.0;
		double z = entity != null ? entity.getZ() : 0.0;
		list.add(Component.literal(LithiumIonBatterySpecialInformationProcedure.execute(itemstack)));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		LithiumIonBatteryRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		LithiumIonBatteryItemInInventoryTickProcedure.execute(itemstack);
	}
}
