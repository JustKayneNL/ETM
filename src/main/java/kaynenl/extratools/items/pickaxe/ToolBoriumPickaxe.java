package kaynenl.extratools.items.pickaxe;
import kaynenl.extratools.ExtraTools;
import kaynenl.extratools.libs.EToolMReference;
import kaynenl.extratools.materials.ExtraToolsMaterials;
import net.minecraft.item.ItemPickaxe;

public class ToolBoriumPickaxe extends ItemPickaxe {
	public ToolBoriumPickaxe() {
	super(ExtraToolsMaterials.boriumPick);
        setUnlocalizedName("toolboriumpickaxe");
        setTextureName(EToolMReference.MODID + ":"
                + getUnlocalizedName().substring(5));
        setCreativeTab(ExtraTools.ExtraToolsTab);
	
	}
}
