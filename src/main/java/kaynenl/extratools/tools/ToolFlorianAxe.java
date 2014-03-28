package kaynenl.extratools.tools;
import kaynenl.extratools.common.ExtraTools;
import kaynenl.extratools.materials.ExtraToolsMaterials;
import net.minecraft.item.ItemAxe;

public class ToolFlorianAxe extends ItemAxe {
public ToolFlorianAxe() {
	super(ExtraToolsMaterials.florianAxe);
	setUnlocalizedName(ExtraTools.MODID + ".florianAxe");
	setCreativeTab(ExtraTools.ExtraToolsTab);
	setTextureName(ExtraTools.MODID + ":toolFlorianAxe");
}
}
