package kaynenl.extratools.items.axe;

import kaynenl.extratools.libs.EToolMReference;
import net.minecraft.item.ItemAxe;
import kaynenl.extratools.ExtraTools;
import kaynenl.extratools.materials.ExtraToolsMaterials;

public class ToolBoriumAxe extends ItemAxe {
	public ToolBoriumAxe() {
		super(ExtraToolsMaterials.boriumAxe);
        setTextureName(EToolMReference.MODID + ":"
                + getUnlocalizedName().substring(5));
        setCreativeTab(ExtraTools.ExtraToolsTab);
    }

}
