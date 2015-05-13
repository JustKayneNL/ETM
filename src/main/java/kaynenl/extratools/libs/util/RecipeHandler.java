package kaynenl.extratools.libs.util;

import cpw.mods.fml.common.registry.GameRegistry;
import manmaed.cutepuppymod.items.CPMItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipeHandler {

	/**
	* Adds the recipes.
	* Called in the preInit
	*/

	public static void addRecipes()
    {
    /**
	* A basic recipe. This requires 2 values: Output, an itemstack output, and an Object Array, of what the
	* recipe is.
	* Pretend the array as an crafting grid, where spaces are empty places.
	* All other chars can be any item assigned.
	*/
		//Spawn Egg :D
		GameRegistry.addRecipe(new ItemStack(CPMItems.redsword),
                " R ",
                " R ",
                " S ",
                'R', CPMItems.redcore, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(CPMItems.greensword),
                " R ",
                " R ",
                " S ",
                'R', CPMItems.greencore, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(CPMItems.bluesword),
                " R ",
                " R ",
                " S ",
                'R', CPMItems.bluecore, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(CPMItems.yellowsword),
                " R ",
                " R ",
                " S ",
                'R', CPMItems.yellowcore, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(CPMItems.purplesword),
                " R ",
                " R ",
                " S ",
                'R', CPMItems.purplecore, 'S', Items.stick);
        GameRegistry.addRecipe(new ItemStack(Items.ender_pearl),
                "EEE",
                "EEE",
                "EEE",
                'E', CPMItems.endercore);
		
		
		
		
		//GameRegistry.addSmelting(PLCItems.spawnstevepuppy, new ItemStack(PLCItems.spawnherobrinepuppy), 1);*/
	}
}
