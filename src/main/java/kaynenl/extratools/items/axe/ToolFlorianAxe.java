package kaynenl.extratools.items.axe;
import kaynenl.extratools.ExtraTools;
import kaynenl.extratools.libs.EToolMReference;
import kaynenl.extratools.materials.ExtraToolsMaterials;
import net.minecraft.item.ItemAxe;

public class ToolFlorianAxe extends ItemAxe {
public ToolFlorianAxe() {
	super(ExtraToolsMaterials.florianAxe);
    setUnlocalizedName("toolflorianaxe");
    setTextureName(EToolMReference.MODID + ":"
            + getUnlocalizedName().substring(5));
    setCreativeTab(ExtraTools.ExtraToolsTab);
}
}
