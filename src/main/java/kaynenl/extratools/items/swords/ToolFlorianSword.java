package kaynenl.extratools.items.swords;
import kaynenl.extratools.libs.EToolMReference;
import net.minecraft.item.ItemSword;
import kaynenl.extratools.ExtraTools;
import kaynenl.extratools.materials.ExtraToolsMaterials;

public class ToolFlorianSword extends ItemSword {
	public ToolFlorianSword() {
	super(ExtraToolsMaterials.florianSword); {
            setUnlocalizedName("toolfloriansword");
            setTextureName(EToolMReference.MODID + ":"
                    + getUnlocalizedName().substring(5));
            setCreativeTab(ExtraTools.ExtraToolsTab);

	}
	}
}
