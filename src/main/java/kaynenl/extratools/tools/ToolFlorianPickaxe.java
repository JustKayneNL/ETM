package kaynenl.extratools.tools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import net.minecraft.item.ItemPickaxe;
import kaynenl.extratools.common.ExtraTools;
import kaynenl.extratools.common.Registry;
import kaynenl.extratools.creativetab.ExtraToolsTab;
import kaynenl.extratools.materials.ExtraToolsMaterials;
public class ToolFlorianPickaxe extends ItemPickaxe{

		public ToolFlorianPickaxe() {
			super(ExtraToolsMaterials.florianPick);
			setFull3D();
			setUnlocalizedName( ExtraTools.MODID +  ".florianPickaxe");
			setCreativeTab(ExtraTools.ExtraToolsTab);
			setTextureName( ExtraTools.MODID + ":toolFlorianPickaxe");
		}
		
	
}
