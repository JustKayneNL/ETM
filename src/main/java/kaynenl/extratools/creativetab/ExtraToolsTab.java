package kaynenl.extratools.creativetab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kaynenl.extratools.items.ETMItems;
import kaynenl.extratools.libs.EToolMReference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ExtraToolsTab extends CreativeTabs {

	public ExtraToolsTab(int id) {
		super(EToolMReference.MODID);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return ETMItems.pickaxeFlorian;
				}
	
	

}


