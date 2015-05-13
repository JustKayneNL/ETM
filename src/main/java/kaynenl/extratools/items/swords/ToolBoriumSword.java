package kaynenl.extratools.items.swords;

import kaynenl.extratools.ExtraTools;
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
