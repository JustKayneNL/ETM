package kaynenl.extratools.items.shovel;
import kaynenl.extratools.ExtraTools;
import kaynenl.extratools.libs.EToolMReference;
import kaynenl.extratools.materials.ExtraToolsMaterials;
import net.minecraft.item.ItemSpade;

public class ToolBoriumShovel extends ItemSpade {
	public ToolBoriumShovel() {
		super(ExtraToolsMaterials.boriumShovel);
        setUnlocalizedName("toolboriumshovel");
        setTextureName(EToolMReference.MODID + ":"
                + getUnlocalizedName().substring(5));
        setCreativeTab(ExtraTools.ExtraToolsTab);
	}

}
