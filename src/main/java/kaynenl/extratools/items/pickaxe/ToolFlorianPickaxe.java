package kaynenl.extratools.items.pickaxe;
import net.minecraft.item.ItemPickaxe;
import kaynenl.extratools.ExtraTools;
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
