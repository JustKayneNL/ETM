package kaynenl.extratools.tools;

import net.minecraft.item.ItemAxe;
import kaynenl.extratools.common.ExtraTools;
import kaynenl.extratools.materials.ExtraToolsMaterials;

public class ToolBoriumAxe extends ItemAxe {
	public ToolBoriumAxe() {
		super(ExtraToolsMaterials.boriumAxe);
		setUnlocalizedName(ExtraTools.MODID + ".boriumAxe");
		setCreativeTab(ExtraTools.ExtraToolsTab);
		setTextureName(ExtraTools.MODID + ":toolBoriumAxe");
	}

}
