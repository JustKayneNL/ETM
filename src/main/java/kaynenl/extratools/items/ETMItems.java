package kaynenl.extratools.items;

import kaynenl.extratools.items.axe.ToolBoriumAxe;
import kaynenl.extratools.items.axe.ToolFlorianAxe;
import kaynenl.extratools.items.hoe.ToolBoriumHoe;
import kaynenl.extratools.items.hoe.ToolFlorianHoe;
import kaynenl.extratools.items.ingots.BoriumIngot;
import kaynenl.extratools.items.ingots.FlorianIngot;
import kaynenl.extratools.items.pickaxe.ToolBoriumPickaxe;
import kaynenl.extratools.items.pickaxe.ToolFlorianPickaxe;
import kaynenl.extratools.items.shovel.ToolBoriumShovel;
import kaynenl.extratools.items.shovel.ToolFlorianShovel;
import kaynenl.extratools.items.swords.ToolBoriumSword;
import kaynenl.extratools.items.swords.ToolFlorianSword;
import kaynenl.extratools.libs.util.RegistryHelper;
import net.minecraft.item.Item;

public class ETMItems {

    public static Item pickaxeFlorian;
    public static Item pickaxeBorium;
    public static Item ingotFlorian;
    public static Item ingotBorium;
    public static Item shovelFlorian;
    public static Item shovelBorium;
    public static Item axeFlorian;
    public static Item axeBorium;
    public static Item hoeFlorian;
    public static Item hoeBorium;
    public static Item swordFlorian;
    public static Item swordBorium;


    public static void load() {

        //To Init'ing
        //Picks
        pickaxeFlorian = new ToolFlorianPickaxe();
        pickaxeBorium = new ToolBoriumPickaxe();

        //Ingots
        ingotFlorian = new FlorianIngot();
        ingotBorium = new BoriumIngot();

        //shovels
        shovelFlorian = new ToolFlorianShovel();
        shovelBorium = new ToolBoriumShovel();

        //axes
        axeFlorian = new ToolFlorianAxe();
        axeBorium = new ToolBoriumAxe();

        //hoes - Kaynenl has loads of these XD XD
        hoeFlorian = new ToolFlorianHoe();
        hoeBorium = new ToolBoriumHoe();

        //Swords
        swordFlorian = new ToolFlorianSword();
        swordBorium = new ToolBoriumSword();

        //Registring
        //Picks
        RegistryHelper.registerItem(pickaxeFlorian);
        RegistryHelper.registerItem(pickaxeBorium);

        //Ingots
        RegistryHelper.registerItem(ingotFlorian);
        RegistryHelper.registerItem(ingotBorium);

        //shovels
        RegistryHelper.registerItem(shovelFlorian);
        RegistryHelper.registerItem(shovelBorium);

        //axes
        RegistryHelper.registerItem(axeFlorian);
        RegistryHelper.registerItem(axeBorium);

        //hoes - Kaynenl has loads of these XD XD
        RegistryHelper.registerItem(hoeFlorian);
        RegistryHelper.registerItem(hoeBorium);

        //Swords
        RegistryHelper.registerItem(swordFlorian);
        RegistryHelper.registerItem(swordBorium);
    }
}