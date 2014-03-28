package kaynenl.extratools.blocks;
import cpw.mods.fml.common.Mod;
import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;
import kaynenl.extratools.common.WorldGen;
import java.util.Random;

import kaynenl.extratools.common.ExtraTools;

public class FlorianOre extends BlockOre {

	

	public FlorianOre() {
		setCreativeTab(ExtraTools.ExtraToolsTab);
		setHarvestLevel("pickaxe", 3);
		setHardness(2.0F);
		setLightLevel(0.1F);
		setBlockName("oreFlorian");
		setBlockTextureName(ExtraTools.MODID + ":oreFlorian");
		this.setResistance(5F);
	}

}
