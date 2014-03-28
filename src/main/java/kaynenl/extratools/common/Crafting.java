package kaynenl.extratools.common;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import kaynenl.extratools.common.Registry;
public class Crafting {
	public static void init() {
		//GR.addRecipe(new ItemStack(ExtraTorchesItems.torchIngotBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ExtraTorchesItems.itemTorchIngot });
		//Craft
		GameRegistry.addRecipe(new ItemStack(Registry.pickFlorian, 1), new Object[] { "XXX", " D ", " S ", 'X', Registry.ingotFlorian, 'D', Items.diamond_pickaxe, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(Registry.swordFlorian, 1), new Object[] { " X ", " X ", " D ", 'X', Registry.ingotFlorian, 'D', Items.diamond_sword });
		GameRegistry.addShapedRecipe(new ItemStack(Registry.axeFlorian, 1), new Object[] { "XX ", "XD ", " S ", 'X', Registry.ingotFlorian, 'D', Items.diamond_axe, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(Registry.shovelFlorian, 1), new Object[] { " X ", " D ", " S ", 'X', Registry.ingotFlorian, 'D', Items.diamond_shovel, 'S', Items.stick});
		//GameRegistry.a
		
		//Smelt
		GameRegistry.addSmelting(Registry.oreFlorian, new ItemStack(Registry.ingotFlorian), 20F);
}
}