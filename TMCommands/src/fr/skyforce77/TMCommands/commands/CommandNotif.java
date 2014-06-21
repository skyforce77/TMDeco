package fr.skyforce77.TMCommands.commands;
import fr.skyforce77.towerminer.api.Utils;
import fr.skyforce77.towerminer.api.commands.Argument;
import fr.skyforce77.towerminer.api.commands.Command;
import fr.skyforce77.towerminer.api.commands.Argument.ArgumentType;
import fr.skyforce77.towerminer.protocol.packets.Packet12Popup;

public class CommandNotif extends Command {

	@Override
	public void onTyped(String[] args) {
		String s = "";
		for(String arg : args) {
			if(!s.equals("")) {
				s = s+" "+arg;
			} else {
				s = s+arg;
			}
		}
		
		Utils.sendAllTCP(new Packet12Popup(s));
	}
	
	@Override
	public boolean isCorrect(String[] args) {
		if(args.length >= 1 && !args[0].equals("")) {
			return true;
		}
		return false;
	}
	
	@Override
	public void onInitialized(String label) {
		setArguments(new Argument("text", ArgumentType.String));
	}

}
