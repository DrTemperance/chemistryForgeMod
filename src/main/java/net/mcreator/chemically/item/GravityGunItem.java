
package net.mcreator.chemically.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.chemically.procedures.GravityGunRightclickedProcedure;
import net.mcreator.chemically.procedures.GravityGunRightclickedOnBlockProcedure;
import net.mcreator.chemically.procedures.GravityGunItemInInventoryTickProcedure;
import net.mcreator.chemically.procedures.GravityGunItemInHandTickProcedure;

import java.util.List;

public class GravityGunItem extends Item {
	public GravityGunItem() {
		super(new Item.Properties().durability(2000).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.CROSSBOW;
	}

	@Override
	public int getEnchantmentValue() {
		return 15;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		GravityGunRightclickedProcedure.execute(world, ar.getObject());
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		GravityGunRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			GravityGunItemInHandTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
		GravityGunItemInInventoryTickProcedure.execute(entity, itemstack);
	}
}
