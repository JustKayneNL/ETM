package kaynenl.extratools.tools;
import kaynenl.extratools.common.ExtraTools;
import kaynenl.extratools.materials.ExtraToolsMaterials;
import net.minecraft.item.ItemSpade;

public class ToolFlorianShovel extends ItemSpade {
	public ToolFlorianShovel() {
		super(ExtraToolsMaterials.florianShovel);
		setUnlocalizedName(ExtraTools.MODID + ".florianShovel");
		setCreativeTab(ExtraTools.ExtraToolsTab);
		setTextureName(ExtraTools.MODID + ":toolFlorianShovel");
	}
	

}
