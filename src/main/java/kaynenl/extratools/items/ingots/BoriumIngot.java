package kaynenl.extratools.items.ingots;
import kaynenl.extratools.ExtraTools;
import kaynenl.extratools.libs.EToolMReference;
import net.minecraft.item.Item;

public class BoriumIngot extends Item {
	public BoriumIngot() {
        super();
		setUnlocalizedName("ingotBorium");
        setTextureName(EToolMReference.MODID + ":"
                + getUnlocalizedName().substring(5));
        setCreativeTab(ExtraTools.ExtraToolsTab);
	}

}
