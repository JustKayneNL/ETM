package kaynenl.extratools.items.swords;

import kaynenl.extratools.ExtraTools;
import kaynenl.extratools.libs.EToolMReference;
import kaynenl.extratools.materials.ExtraToolsMaterials;
import net.minecraft.item.ItemSword;

public class ToolBoriumSword extends ItemSword {
	public ToolBoriumSword() {
        super(ExtraToolsMaterials.boriumSword);
        setUnlocalizedName("toolboriumsword");
        setTextureName(EToolMReference.MODID + ":"
                + getUnlocalizedName().substring(5));
        setCreativeTab(ExtraTools.ExtraToolsTab);
	}

}
