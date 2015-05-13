package kaynenl.extratools.items.shovel;
import kaynenl.extratools.ExtraTools;
import kaynenl.extratools.materials.ExtraToolsMaterials;
import net.minecraft.item.ItemSpade;

public class ToolBoriumShovel extends ItemSpade {
	public ToolBoriumShovel() {
		super(ExtraToolsMaterials.boriumShovel);
		setFull3D();
		setUnlocalizedName( ExtraTools.MODID +  ".boriumShovel");
		setCreativeTab(ExtraTools.ExtraToolsTab);
		setTextureName( ExtraTools.MODID + ":toolBoriumShovel");
	}

}
