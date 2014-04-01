package kaynenl.extratools.tools;

import kaynenl.extratools.common.ExtraTools;
import kaynenl.extratools.materials.ExtraToolsMaterials;
import net.minecraft.item.ItemHoe;

public class ToolBoriumHoe extends ItemHoe {
	public ToolBoriumHoe() {
		super(ExtraToolsMaterials.boriumShovel);
		setCreativeTab(ExtraTools.ExtraToolsTab);
		setTextureName(ExtraTools.MODID + ":toolBoriumHoe" );
		setUnlocalizedName(ExtraTools.MODID + ".boriumHoe");
	}

}
