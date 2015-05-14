package kaynenl.extratools.items.pickaxe;
import kaynenl.extratools.libs.EToolMReference;
import net.minecraft.item.ItemPickaxe;
import kaynenl.extratools.ExtraTools;
import kaynenl.extratools.materials.ExtraToolsMaterials;
public class ToolFlorianPickaxe extends ItemPickaxe{

		public ToolFlorianPickaxe() {
			super(ExtraToolsMaterials.florianPick);
            setUnlocalizedName("toolflorianpickaxe");
            setTextureName(EToolMReference.MODID + ":"
                    + getUnlocalizedName().substring(5));
            setCreativeTab(ExtraTools.ExtraToolsTab);
		}
		
	
}
