package kaynenl.extratools.blocks;
import net.minecraft.block.BlockOre;

import kaynenl.extratools.ExtraTools;

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
