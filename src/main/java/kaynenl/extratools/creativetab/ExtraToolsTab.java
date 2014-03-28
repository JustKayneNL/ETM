package kaynenl.extratools.creativetab;
import kaynenl.extratools.common.ExtraTools;
import kaynenl.extratools.tools.ToolFlorianPickaxe;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ExtraToolsTab extends CreativeTabs {

	public ExtraToolsTab(String tabname) {
		super(tabname);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return kaynenl.extratools.common.Registry.pickFlorian;
				}
	
	

}


