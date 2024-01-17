package net.mcreator.chemically.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class GravityGunItemInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("active")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((x + entity.getLookAngle().x), (y + entity.getLookAngle().x), (z + entity.getLookAngle().z)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
								.withSuppressedOutput(),
						"execute as @p run tp @e[limit=1,sort=nearest,type=falling_block] ~ ~ ~");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((x + entity.getLookAngle().x), (y + entity.getLookAngle().y), (z + entity.getLookAngle().z)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
								.withSuppressedOutput(),
						"execute as @p run data merge entity @e[type=falling_block,limit=1,sort=nearest] {Time:100}");
		}
	}
}
