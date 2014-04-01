package kaynenl.extratools.common;

import kaynenl.extratools.creativetab.ExtraToolsTab;
import net.minecraft.creativetab.CreativeTabs;
import aroma1997.core.util.AromaRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ExtraTools.MODID, name = ExtraTools.NAME, version = ExtraTools.VERSION)
public class ExtraTools {
	@SidedProxy(clientSide = "kaynenl.extratools.common.ClientProxy", serverSide = "kaynenl.extratools.common.CommonProxy")
	public static CommonProxy proxy;

	public static final String MODID = "ExtraTools";
	public static final String NAME = "Extra Tools";
	public static final String VERSION = "0.1";
	
	public static CreativeTabs ExtraToolsTab = new ExtraToolsTab();
	public static WorldGen worldgen1 = new WorldGen();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		AromaRegistry.register(Registry.class);
		AromaRegistry.register(Crafting.class);
		GameRegistry.registerWorldGenerator(worldgen1, 1);
	}
}
