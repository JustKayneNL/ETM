package kaynenl.extratools.libs.util;

import cpw.mods.fml.common.registry.GameRegistry;
import kaynenl.extratools.libs.EToolMReference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryHelper {
	public static void registerItem(Item item) {
		GameRegistry.registerItem(item, EToolMReference.MODID + "_"
				+ item.getUnlocalizedName().substring(5));
	}

	public static void registerBlock(Block block) {
		GameRegistry.registerBlock(block, EToolMReference.MODID + "_"
				+ block.getUnlocalizedName().substring(5));
	}
}
