package fr.skyforce77.TMCommands.commands;
import fr.skyforce77.towerminer.api.Utils;
import fr.skyforce77.towerminer.api.commands.Argument;
import fr.skyforce77.towerminer.api.commands.Command;
import fr.skyforce77.towerminer.api.commands.Argument.ArgumentType;
import fr.skyforce77.towerminer.protocol.packets.Packet16Sound;

public class CommandMusic extends Command {

	@Override
	public void onTyped(String[] args) {
		args[0] = args[0].replaceAll("https", "http");
		Utils.sendAllTCP(new Packet16Sound(0, true, args[0]));
		Utils.write("Sent music");
	}
	
	@Override
	public boolean isCorrect(String[] args) {
		if(args.length >= 0 && !args[0].equals("")) {
			return true;
		}
		return false;
	}
	
	@Override
	public void onInitialized(String label) {
		setArguments(new Argument("url", ArgumentType.Url));
	}

}
