package kaynenl.extratools.common;

import cpw.mods.fml.common.registry.GameRegistry;
import kaynenl.extratools.blocks.ETMBlocks;
import kaynenl.extratools.items.ETMItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ETMCrafting {
    public static void addRecipes() {
        //GR.addRecipe(new ItemStack(ExtraTorchesItems.torchIngotBlock, 1),
        // "XXX",
        // "XXX",
        // "XXX",
        // 'X', ExtraTorchesItems.itemTorchIngot });
        //Craft
        GameRegistry.addRecipe(new ItemStack(ETMItems.pickaxeFlorian, 1),
                "XXX",
                " D ",
                " S ",
                'X', ETMItems.ingotFlorian, 'D', Items.diamond_pickaxe, 'S', Items.stick);

        GameRegistry.addShapedRecipe(new ItemStack(ETMItems.swordFlorian, 1),
                " X ", " X ", " D ", 'X', ETMItems.ingotFlorian, 'D', Items.diamond_sword);

        GameRegistry.addShapedRecipe(new ItemStack(ETMItems.axeFlorian, 1),
                "XX ",
                "XD ",
                " S ",
                'X', ETMItems.ingotFlorian, 'D', Items.diamond_axe, 'S', Items.stick);

        GameRegistry.addShapedRecipe(new ItemStack(ETMItems.shovelFlorian, 1),
                " X ",
                " D ",
                " S ",
                'X', ETMItems.ingotFlorian, 'D', Items.diamond_shovel, 'S', Items.stick);

        GameRegistry.addRecipe(new ItemStack(ETMItems.hoeFlorian, 1),
                "XX ",
                " D ",
                " S ",
                'X', ETMItems.ingotFlorian, 'D', Items.diamond_hoe, 'S', Items.stick);

        GameRegistry.addRecipe(new ItemStack(ETMItems.pickaxeBorium, 1),
                "XXX",
                " F ",
                " S ",
                'X', ETMItems.ingotBorium, 'F', ETMItems.pickaxeFlorian, 'S', Items.stick);

        GameRegistry.addRecipe(new ItemStack(ETMItems.swordBorium, 1),
                " X ",
                " X ",
                " F ",
                'X', ETMItems.ingotBorium, 'F', ETMItems.swordBorium);

        GameRegistry.addRecipe(new ItemStack(ETMItems.axeBorium, 1),
                "XX ",
                "XF ",
                " S ",
                'X', ETMItems.ingotBorium, 'F', ETMItems.axeFlorian, 'S', Items.stick);

        GameRegistry.addRecipe(new ItemStack(ETMItems.shovelBorium, 1),
                " X ",
                " F ",
                " S ",
                'X', ETMItems.ingotBorium, 'F', ETMItems.shovelFlorian, 'S', Items.stick);

        GameRegistry.addRecipe(new ItemStack(ETMItems.hoeBorium, 1),
                "XX ",
                " F ",
                " S ",
                'X', ETMItems.ingotBorium, 'F', ETMItems.axeFlorian, 'S', Items.stick);

        //Smelt
        GameRegistry.addSmelting(ETMBlocks.oreFlorian, new ItemStack(ETMItems.ingotFlorian), 20F);
        GameRegistry.addSmelting(ETMBlocks.oreBorium, new ItemStack(ETMItems.ingotBorium), 40F);
    }
}