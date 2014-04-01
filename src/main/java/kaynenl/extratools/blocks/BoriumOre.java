package kaynenl.extratools.blocks;
import kaynenl.extratools.common.ExtraTools;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;

public class BoriumOre extends BlockOre {
	public BoriumOre() {
		setCreativeTab(ExtraTools.ExtraToolsTab);
		setHarvestLevel("pickaxe", 4);
		setHardness(2.0F);
		setLightLevel(0.1F);
		setBlockName("oreBorium");
		setBlockTextureName(ExtraTools.MODID + ":oreBorium");
		this.setResistance(5F);
	}

}
