package kaynenl.extratools.tools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import net.minecraft.item.ItemSword;
import kaynenl.extratools.common.ExtraTools;
import kaynenl.extratools.common.Registry;
import kaynenl.extratools.creativetab.ExtraToolsTab;
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
