
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemically.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.chemically.entity.GammaRayEntity;
import net.mcreator.chemically.entity.CryoShotEntity;
import net.mcreator.chemically.entity.CockroachEntity;
import net.mcreator.chemically.ChemicallyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChemicallyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ChemicallyMod.MODID);
	public static final RegistryObject<EntityType<CockroachEntity>> COCKROACH = register("cockroach",
			EntityType.Builder.<CockroachEntity>of(CockroachEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CockroachEntity::new)

					.sized(0.6f, 0.25f));
	public static final RegistryObject<EntityType<GammaRayEntity>> GAMMA_RAY = register("projectile_gamma_ray",
			EntityType.Builder.<GammaRayEntity>of(GammaRayEntity::new, MobCategory.MISC).setCustomClientFactory(GammaRayEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CryoShotEntity>> CRYO_SHOT = register("projectile_cryo_shot",
			EntityType.Builder.<CryoShotEntity>of(CryoShotEntity::new, MobCategory.MISC).setCustomClientFactory(CryoShotEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CockroachEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(COCKROACH.get(), CockroachEntity.createAttributes().build());
	}
}
