package kaynenl.extratools.common;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGen implements IWorldGenerator {

	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	public void generateSurface(World world, Random random, int x, int z) {
		
		this.generateOre(world, Registry.oreFlorian, 4, 4, random, x, z, 20);
		this.generateOre(world, Registry.oreBorium, 3, 2, random, x, z, 10);
	}

	public void generateNether(World world, Random random, int i, int j) {
	}

	public static void generateEnd(World world, Random random, int i, int j) { 
	}

	public void generateOre(World world, Block block, int cycle,
			int amount, Random random, int x, int z, int yran) {
		for (int i = 0; i < cycle; i++) {
			int Xcords = x + random.nextInt(16);
			int Ycords = random.nextInt(yran);
			int Zcords = z + random.nextInt(16);
			new WorldGenMinable(block, amount).generate(world, random, Xcords,
					Ycords, Zcords);
		}
	}
}

