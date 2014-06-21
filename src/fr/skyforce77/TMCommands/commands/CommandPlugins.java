package fr.skyforce77.TMCommands.commands;
import fr.skyforce77.towerminer.api.PluginManager;
import fr.skyforce77.towerminer.api.Utils;
import fr.skyforce77.towerminer.api.commands.Command;

public class CommandPlugins extends Command {

	@Override
	public void onTyped(String[] args) {
		String st = "";
		int i = 0;
		for(String s : PluginManager.getPlugins()) {
			if(i < 2) {
				i++;
				st = st+s+", ";
			} else {
				i = 0;
				st = st+s+", ";
				Utils.write(st);
			}
		}
		if(i != 0) {
			Utils.write(st);
		}
	}
	
	@Override
	public boolean isCorrect(String[] args) {
		if(args.length == 1) {
			return true;
		}
		return false;
	}
	
	@Override
	public void onInitialized(String label) {
		setAlias("pl");
	}

}
