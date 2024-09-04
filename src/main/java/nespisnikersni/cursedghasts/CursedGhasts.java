package nespisnikersni.cursedghasts;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.SpawnSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CursedGhasts implements ModInitializer {
	public static final String MOD_ID = "cursed_ghasts";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BiomeModifications.addSpawn(
				BiomeSelectors.foundInOverworld(),
				SpawnGroup.MONSTER,
				EntityType.GHAST,
				1000, 2, 5
		);
		BiomeModifications.addSpawn(
				BiomeSelectors.foundInOverworld(),
				SpawnGroup.CREATURE,
				EntityType.GHAST,
				1000, 2, 5
		);
	}
}