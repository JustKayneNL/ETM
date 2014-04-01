package kaynenl.extratools.tools;
import kaynenl.extratools.common.ExtraTools;
import kaynenl.extratools.materials.ExtraToolsMaterials;
import net.minecraft.item.ItemPickaxe;

public class ToolBoriumPickaxe extends ItemPickaxe {
	public ToolBoriumPickaxe() {
	super(ExtraToolsMaterials.boriumPick);
	setFull3D();
	setUnlocalizedName( ExtraTools.MODID +  ".boriumPickaxe");
	setCreativeTab(ExtraTools.ExtraToolsTab);
	setTextureName( ExtraTools.MODID + ":toolBoriumPickaxe");
	
	}
}
