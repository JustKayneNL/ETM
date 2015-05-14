package kaynenl.extratools.items.shovel;
import kaynenl.extratools.ExtraTools;
import kaynenl.extratools.libs.EToolMReference;
import kaynenl.extratools.materials.ExtraToolsMaterials;
import net.minecraft.item.ItemSpade;

public class ToolFlorianShovel extends ItemSpade {
	public ToolFlorianShovel() {
		super(ExtraToolsMaterials.florianShovel);
        setUnlocalizedName("toolflorianshovel");
        setTextureName(EToolMReference.MODID + ":"
                + getUnlocalizedName().substring(5));
        setCreativeTab(ExtraTools.ExtraToolsTab);
	}
	

}
