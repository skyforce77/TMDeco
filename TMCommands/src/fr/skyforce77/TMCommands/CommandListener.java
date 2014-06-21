package fr.skyforce77.TMCommands;

import fr.skyforce77.towerminer.api.EventHandler;
import fr.skyforce77.towerminer.api.TMListener;
import fr.skyforce77.towerminer.api.events.menu.MenuUsedEvent;
import fr.skyforce77.towerminer.menus.SinglePlayer;

public class CommandListener extends TMListener{
	
	@EventHandler
	public void onMenuUsed(MenuUsedEvent e) {
		if(e.getMenu().getClass().equals(SinglePlayer.class)) {
			SinglePlayer sp = ((SinglePlayer)e.getMenu());
			sp.chatfield.setVisible(true);
	        sp.enablechat.setVisible(true);
		}
	}

}
