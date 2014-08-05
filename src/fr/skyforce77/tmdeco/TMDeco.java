package fr.skyforce77.tmdeco;
import javax.swing.ImageIcon;

import fr.skyforce77.towerminer.api.BlockType;
import fr.skyforce77.towerminer.api.Plugin;
import fr.skyforce77.towerminer.blocks.CustomBlock;


public class TMDeco extends Plugin{
	
	@Override
	public boolean isPluginNeededByClient() {
		return false;
	}
	
	@Override
	public void onEnable() {
		new CustomBlock(this, "tuiles", BlockType.STONE, getTexture("tuiles"), getTexture("tuile"));
		new CustomBlock(this, "parket", BlockType.PLANKS, getTexture("parket"));
		new CustomBlock(this, "ardoise", BlockType.STONE, getTexture("ardoise"));
		new CustomBlock(this, "bambooblock", BlockType.PLANKS, getTexture("bamboob"));
		new CustomBlock(this, "candy", BlockType.STONE, getTexture("candy"), getTexture("candy2"), getTexture("candy3"), getTexture("candy4"), getTexture("candy5"), getTexture("candy6"));
		new CustomBlock(this, "copper", BlockType.IRON_BLOCK, getTexture("copper"));
		new CustomBlock(this, "egypt", BlockType.PLANKS, getTexture("egypt1"), getTexture("egypt2"), getTexture("egypt3"), getTexture("egypt4"), getTexture("egypt5"), getTexture("egypt6")
				, getTexture("egypt7"));
		new CustomBlock(this, "alphabricks", BlockType.BRICKS, getTexture("alphabrick"));
		new CustomBlock(this, "alphadiamond", BlockType.DIAMOND_BLOCK, getTexture("alphadiamond"));
		new CustomBlock(this, "alphagold", BlockType.GOLD_BLOCK, getTexture("alphagold"));
		new CustomBlock(this, "alphairon", BlockType.IRON_BLOCK, getTexture("alphairon"));
		new CustomBlock(this, "betairon", BlockType.IRON_BLOCK, getTexture("betairon"));
	}
	
	public static ImageIcon getTexture(String texture) {
        ImageIcon image = new ImageIcon(TMDeco.class.getResource("/ressources/textures/" + texture + ".png"));
        return image;
    }

}
