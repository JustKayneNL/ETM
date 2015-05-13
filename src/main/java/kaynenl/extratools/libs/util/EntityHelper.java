package kaynenl.extratools.libs.util;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;


public class EntityHelper {
/*	public static void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
        int id = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
        EntityList.entityEggs.put(Integer.valueOf(id), new EntityList.EntityEggInfo(id, bkEggColor, fgEggColor));

     }
*/
public static int registerEntity(Class<? extends Entity> entityClass, String entityName) {
    int id = EntityRegistry.findGlobalUniqueEntityId();
   
    EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
    
    return id;
    
 }
}
