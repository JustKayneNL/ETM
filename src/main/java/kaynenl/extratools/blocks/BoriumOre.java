package kaynenl.extratools.blocks;
import kaynenl.extratools.ExtraTools;
import kaynenl.extratools.libs.EToolMReference;
import net.minecraft.block.BlockOre;

public class BoriumOre extends BlockOre {
	public BoriumOre() {
		setCreativeTab(ExtraTools.ExtraToolsTab);
        setBlockName("oreBorium");
		setHarvestLevel("pickaxe", 4);
		setHardness(2.0F);
		setLightLevel(0.1F);
        setBlockTextureName(EToolMReference.MODID + ":"
                + getUnlocalizedName().substring(5));
		this.setResistance(5F);
	}

}
