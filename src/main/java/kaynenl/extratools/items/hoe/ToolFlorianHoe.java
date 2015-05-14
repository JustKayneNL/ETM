package kaynenl.extratools.items.hoe;
import kaynenl.extratools.ExtraTools;
import kaynenl.extratools.libs.EToolMReference;
import kaynenl.extratools.materials.ExtraToolsMaterials;
import net.minecraft.item.ItemHoe;

public class ToolFlorianHoe extends ItemHoe {
	public ToolFlorianHoe() {
	super(ExtraToolsMaterials.florianShovel);
        setUnlocalizedName("toolflorianhoe");
        setTextureName(EToolMReference.MODID + ":"
                + getUnlocalizedName().substring(5));
        setCreativeTab(ExtraTools.ExtraToolsTab);
	}
}
