package kaynenl.extratools.items.shovel;
import kaynenl.extratools.ExtraTools;
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
