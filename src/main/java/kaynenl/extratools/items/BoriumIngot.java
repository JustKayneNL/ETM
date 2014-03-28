package kaynenl.extratools.items;
import kaynenl.extratools.common.ExtraTools;
import kaynenl.extratools.creativetab.ExtraToolsTab;
import net.minecraft.item.Item;

public class BoriumIngot extends Item {
	public BoriumIngot() {
		setCreativeTab(ExtraTools.ExtraToolsTab);
		setUnlocalizedName(ExtraTools.MODID + ".ingotBorium");
		setTextureName(ExtraTools.MODID + ":ingotBorium");
	}

}
