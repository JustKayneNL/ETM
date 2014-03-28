package kaynenl.extratools.common;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import aroma1997.core.util.AromaRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = "ExtraTools", name = "Extra Tools", version = "-1") 
public class ExtraTools {
	public static final String MODID = "ExtraTools";
	@SidedProxy(clientSide = "kaynenl.extratools.common.ClientProxy", serverSide = "kaynenl.extratools.common.CommonProxy")
	public static CommonProxy proxy;
	public static WorldGen worldgen1 = new WorldGen();
	
	// Creative Tabs//
public static CreativeTabs ExtraToolsTab = new kaynenl.extratools.creativetab.ExtraToolsTab("ExtraTools");
	
//Registry	
@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		AromaRegistry.register(Registry.class);
		AromaRegistry.register(Crafting.class);
		GameRegistry.registerWorldGenerator(worldgen1, 1);
	}
	}

