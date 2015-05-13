package kaynenl.extratools.libs.util;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import manmaed.cutepuppymod.achievements.Achievements;
import manmaed.cutepuppymod.items.CPMItems;

public class CraftingHandler {

	@SubscribeEvent
	public void Smelting(PlayerEvent.ItemSmeltedEvent event)
	{
	//Add
	}
	@SubscribeEvent
	public void Craftng(PlayerEvent.ItemCraftedEvent event)
	{
	//Add
	}
	
	@SubscribeEvent
	public void PickUpItem(PlayerEvent.ItemPickupEvent event)
	{
		if(event.pickedUp.getEntityItem().getItem()== CPMItems.redcore)
		event.player.addStat(Achievements.puppykiller, 1);
        if(event.pickedUp.getEntityItem().getItem()== CPMItems.banhammer)
            event.player.addStat(Achievements.killedbosspuppy, 1);
        if(event.pickedUp.getEntityItem().getItem()== CPMItems.endercore)
            event.player.addStat(Achievements.killEnderPuppy, 1);
    }
}
