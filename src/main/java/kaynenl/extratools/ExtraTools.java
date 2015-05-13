package kaynenl.extratools;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import kaynenl.extratools.blocks.ETMBlocks;
import kaynenl.extratools.common.ETMCrafting;
import kaynenl.extratools.common.WorldGen;
import kaynenl.extratools.creativetab.ExtraToolsTab;
import kaynenl.extratools.items.ETMItems;
import kaynenl.extratools.libs.EToolMReference;
import kaynenl.extratools.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = EToolMReference.MODID, name = EToolMReference.NAME, version = EToolMReference.VERSION)

public class ExtraTools {
    @Mod.Instance(EToolMReference.MODID)
    @SidedProxy(clientSide = EToolMReference.CLIENT_PROXY, serverSide = EToolMReference.PROXY_COMMON)
	public static CommonProxy proxy;

	
	public static CreativeTabs ExtraToolsTab = new ExtraToolsTab(CreativeTabs.getNextID());
	public static WorldGen worldgen1 = new WorldGen();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

        ETMBlocks.load();
        ETMItems.load();
        ETMCrafting.addRecipes();
		GameRegistry.registerWorldGenerator(worldgen1, 1);
	}
}
