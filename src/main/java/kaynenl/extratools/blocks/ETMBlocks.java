package kaynenl.extratools.blocks;

import kaynenl.extratools.libs.util.RegistryHelper;
import net.minecraft.block.Block;

public class ETMBlocks {

    public static Block oreFlorian;
    public static Block oreBorium;

    public static void load() {

        //Init'ing
        oreFlorian = new FlorianOre();
        oreBorium = new BoriumOre();

        //Registering
        RegistryHelper.registerBlock(oreFlorian);
        RegistryHelper.registerBlock(oreBorium);


    }
}
