package kaynenl.extratools.items.swords;
import net.minecraft.item.ItemSword;
import kaynenl.extratools.ExtraTools;
import kaynenl.extratools.materials.ExtraToolsMaterials;

public class ToolFlorianSword extends ItemSword {
	public ToolFlorianSword() {
	super(ExtraToolsMaterials.florianSword); {
		setUnlocalizedName( ExtraTools.MODID +  ".florianSword");
		setCreativeTab(ExtraTools.ExtraToolsTab);
		setFull3D();
		setTextureName(ExtraTools.MODID + ":toolFlorianSword");
	}
	}
}
