package kaynenl.extratools.blocks;
import kaynenl.extratools.libs.EToolMReference;
import net.minecraft.block.BlockOre;

import kaynenl.extratools.ExtraTools;

public class FlorianOre extends BlockOre {

	

	public FlorianOre() {
		setCreativeTab(ExtraTools.ExtraToolsTab);
        setHarvestLevel("pickaxe", 3);
        setBlockName("oreFlorian");
		setHardness(2.0F);
		setLightLevel(0.1F);
        setBlockTextureName(EToolMReference.MODID + ":"
                + getUnlocalizedName().substring(5));
		this.setResistance(5F);
	}

}
