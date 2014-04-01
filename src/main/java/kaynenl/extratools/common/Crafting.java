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
		GameRegistry.addRecipe(new ItemStack(Registry.pickaxeFlorian, 1), new Object[] { "XXX", " D ", " S ", 'X', Registry.ingotFlorian, 'D', Items.diamond_pickaxe, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(Registry.swordFlorian, 1), new Object[] { " X ", " X ", " D ", 'X', Registry.ingotFlorian, 'D', Items.diamond_sword });
		GameRegistry.addShapedRecipe(new ItemStack(Registry.axeFlorian, 1), new Object[] { "XX ", "XD ", " S ", 'X', Registry.ingotFlorian, 'D', Items.diamond_axe, 'S', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(Registry.shovelFlorian, 1), new Object[] { " X ", " D ", " S ", 'X', Registry.ingotFlorian, 'D', Items.diamond_shovel, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(Registry.hoeFlorian, 1), new Object[] { "XX ", " D ", " S ", 'X', Registry.ingotFlorian, 'D', Items.diamond_hoe, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(Registry.pickaxeBorium, 1), new Object[] { "XXX", " F ", " S ", 'X', Registry.ingotBorium, 'F', Registry.pickaxeFlorian, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(Registry.swordBorium, 1), new Object[] { " X ", " X ", " F ", 'X', Registry.ingotBorium, 'F', Registry.swordBorium });
		GameRegistry.addRecipe(new ItemStack(Registry.axeBorium, 1), new Object[] { "XX ", "XF ", " S ", 'X', Registry.ingotBorium, 'F', Registry.axeFlorian, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(Registry.shovelBorium, 1), new Object[] { " X ", " F ", " S ", 'X', Registry.ingotBorium, 'F', Registry.shovelFlorian, 'S', Items.stick  });
		GameRegistry.addRecipe(new ItemStack(Registry.hoeBorium, 1), new Object[] { "XX ", "F", " S ", 'X', Registry.ingotBorium, 'F', Registry.axeFlorian, 'S', Items.stick });
		
		//Smelt
		GameRegistry.addSmelting(Registry.oreFlorian, new ItemStack(Registry.ingotFlorian), 20F);
		GameRegistry.addSmelting(Registry.oreBorium, new ItemStack(Registry.ingotBorium), 40F);
}
}