package kaynenl.extratools.items.hoe;

import kaynenl.extratools.ExtraTools;
import kaynenl.extratools.libs.EToolMReference;
import kaynenl.extratools.materials.ExtraToolsMaterials;
import net.minecraft.item.ItemHoe;

public class ToolBoriumHoe extends ItemHoe {
	public ToolBoriumHoe() {
		super(ExtraToolsMaterials.boriumShovel);
        setUnlocalizedName("toolboriumhoe");
        setTextureName(EToolMReference.MODID + ":"
                + getUnlocalizedName().substring(5));
        setCreativeTab(ExtraTools.ExtraToolsTab);
	}

}
