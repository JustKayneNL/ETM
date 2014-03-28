package kaynenl.extratools.items;
import kaynenl.extratools.common.ExtraTools;
import kaynenl.extratools.creativetab.ExtraToolsTab;
import net.minecraft.item.Item;

public class FlorianIngot extends Item {
	public FlorianIngot() {
		setCreativeTab(ExtraTools.ExtraToolsTab);
		setUnlocalizedName(ExtraTools.MODID + ".ingotFlorian");
		setTextureName(ExtraTools.MODID + ":ingotFlorian");
	}
}
