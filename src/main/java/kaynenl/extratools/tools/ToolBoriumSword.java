package kaynenl.extratools.tools;

import kaynenl.extratools.common.ExtraTools;
import kaynenl.extratools.materials.ExtraToolsMaterials;
import net.minecraft.item.ItemSword;

public class ToolBoriumSword extends ItemSword {
	public ToolBoriumSword() {
		super(ExtraToolsMaterials.boriumSword);
		setUnlocalizedName( ExtraTools.MODID +  ".boriumSword");
		setCreativeTab(ExtraTools.ExtraToolsTab);
		setFull3D();
		setTextureName(ExtraTools.MODID + ":toolBoriumSword");
	}

}
