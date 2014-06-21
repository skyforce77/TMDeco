package fr.skyforce77.TMCommands.commands;

import fr.skyforce77.towerminer.api.Utils;
import fr.skyforce77.towerminer.api.commands.Command;

public class CommandStop extends Command {

	@Override
	public void onTyped(String[] args) {
		Utils.broadcast("Stopping server...");
		System.exit(1);
	}
	
	@Override
	public boolean isCorrect(String[] args) {
		if(args.length == 1 && args[0].equals("")) {
			return true;
		}
		return false;
	}

}
