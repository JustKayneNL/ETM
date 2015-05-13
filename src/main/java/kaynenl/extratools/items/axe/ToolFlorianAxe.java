package kaynenl.extratools.items.axe;
import kaynenl.extratools.ExtraTools;
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
