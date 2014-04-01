package kaynenl.extratools.tools;
import kaynenl.extratools.common.ExtraTools;
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
