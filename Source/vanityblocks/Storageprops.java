package vanityblocks;

import java.io.File;
import java.util.Set;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;


public class Storageprops {
	public static void initProps()
	{
        Configuration config = new Configuration(new File(DefaultProps.FILE_CONFIG));

		config.load();
		String blocks = "Block id's";		
		storageblockconfig = config.getBlock(blocks,"Vannila Storage Blocks",3050).getInt(3050);
		storageblockmodconfig = config.getBlock(blocks,"Modded Storage Blocks",3051).getInt(3051);
		forestryblockconfig = config.getBlock(blocks,"Forestry Storage Blocks",3053).getInt(3053);
		vanitydesignconfig = config.getBlock(blocks,"Vanity design blocks",3055).getInt(3055);
		vanitydesignworldconfig = config.getBlock(blocks,"Vanity Blocks World Generation blocks",3058).getInt(3058);
		vanityentityconfig = config.getBlock(blocks, "Vanity Blocks Tile Entity(such as melting core)",3060).getInt(3058);
		vanitydesignworldslabconfig = config.getBlock(blocks, "Vanity Blocks World Gen slabs", 3061).getInt(3061);
		
		String items = "Item id's";
		//config.getItem("Patterns and Misc", "Tinker's Manual", 14018).getInt(14018); use a second "" to add it to a sub category
		enablerupees = config.get(items, "Enabled the Rupees?", true).getBoolean(true);
        greenrupee1 = config.getItem(items, "Green Rupee - 1 Rupees", 19000).getInt(19000);
        bluerupee5 = config.getItem(items, "Blue Rupee - 5 Rupees", 19001).getInt(19001);
        redrupee20 = config.getItem(items, "Red Rupee - 20 Rupees", 19002).getInt(19002);
        biggreenrupee50 = config.getItem(items, "Big Green Rupee - 50 Rupees", 19003).getInt(19003);
        bigbluerupee100 = config.getItem(items, "Big Blue Rupee - 100 Rupees", 19004).getInt(19004);
        bigredrupee200 = config.getItem(items, "Big Red Rupee - 200 Rupees", 19005).getInt(19005);

		String category1 = "Blocks Enable or disable";
//		storageblocking = config.get(category1,"Storage blocks enabled?", true).getBoolean(true);
//		enablecoal = config.get(category1,"Enable Coal Block crafting?", true).getBoolean(true);
		enablecharcoal = config.get(category1,"Enable CharCoal Block crafting?", true).getBoolean(true);
    	enableenderpearl = config.get(category1,"Enable Ender Parl Block crafting?", true).getBoolean(true);
    	enableslime = config.get(category1,"Enable Slime Block crafting?", true).getBoolean(true);
 //   	enablewheatbale = config.get(category1, "Enable Wheat Bale crafting?", true).getBoolean(true);
    	enablesugar = config.get(category1, "Enable Sugar Block crafting?", true).getBoolean(true);
    	enablesugarcane = config.get(category1, "Enable Sugar Cane Block crafting?", true).getBoolean(true);
    	enablecocoa = config.get(category1, "Enable Cocoa Block crafting?", true).getBoolean(true);
    	enableblaze = config.get(category1, "Enable Blaze Block crafting?", true).getBoolean(true);
    	enableleather = config.get(category1, "Enable Leather Block crafting?", true).getBoolean(true);
    	enablebone = config.get(category1, "Enable Bone Block crafting?", true).getBoolean(true);
		enabletin = config.get(category1,"Enable Tin Block crafting?", true).getBoolean(true);
		enablecopper = config.get(category1,"Enable Copper Block crafting?", true).getBoolean(true);
		enablesilver = config.get(category1,"Enable Silver Block crafting?", true).getBoolean(true);
		enablelead = config.get(category1,"Enable Lead Block crafting?", true).getBoolean(true);
		enablenickel = config.get(category1,"Enable Nickel Block crafting?", true).getBoolean(true);
		enableelectrum = config.get(category1,"Enable Electrum Block crafting?", true).getBoolean(true);
		enableplatinum = config.get(category1,"Enable Platinum/shiny Block crafting?", true).getBoolean(true);
		enablerubber = config.get(category1,"Enable Rubber Block crafting?",true).getBoolean(true);
		enableclaybrick = config.get(category1, "Enable clay brick crafting", true).getBoolean(true);
		enablemeltingcore = config.get(category1, "Enable Melting Core crafting?", true).getBoolean(true);
		enablelavalamp = config.get(category1,"Enable Lavalamp crafting?", true).getBoolean(true);

		String category2 = "Specific Blocks mod compatibility";
//		enablecoalcoke = config.get(category2,"Enable CoalCoke Block from Railcraft?", true).getBoolean(true);
//		enableosmium = config.get(category2,"Enable Osmium Block from Universal Electricity?",true).getBoolean(true);
		enablebrass = config.get(category2,"Enable Brass Block from various mods?", true).getBoolean(true);
		enableapatite = config.get(category2,"Enable Apatite block from Forestry?", true).getBoolean(true);
		enablehoneydrop = config.get(category2,"Enable Honeydrop Block from Forestry?", true).getBoolean(true);
		enablehoneydew = config.get(category2,"Enable Honeydew Block from Forestry?", true).getBoolean(true);
		enablepeat = config.get(category2,"Enable Peat Block from Forestry?", true).getBoolean(true);
		enableinvar = config.get(category2,"Enable Invar Block from Thermal Expansion?", true).getBoolean(true);
		enablenikolite = config.get(category2,"Enable Nikolite Block from Redpower?", true).getBoolean(true);
		Property gregtechcomp = config.get(category2,"If you have gregtech and recipes arent deblocking(after changing gregtechs config)?",true);
		gregtechcomp.comment = "Please note, this will only work if you set gregtechs config to this... http://pastebin.com/92FmiGHm  Type true if no gregtech, false if gregtech is added(THIS IS only relevant in gregtechs case). Do this below)";
		gregtechcompat = config.get(category2, "Set the true/false here as well for the gregtech option ^", true).getBoolean(true);
		
		String category3 = "Recipe enable or disable";
		dragoneggrecipe = config.get(category3,"Crafting Dragon Egg(Requires Ender Pearl Block enabled)", true).getBoolean(true);
		arrowtofeather = config.get(category3,"Arrow to feather", true).getBoolean(true);
		fleshtoleather = config.get(category3,"Zombie flesh cooks into leather", true).getBoolean(true);
		quartzblocktoquartz = config.get(category3, "Quartz block decraft to nether quartz", true).getBoolean(true);
		greendye = config.get(category3, "Make green dye from blue and yellow dye?", true).getBoolean(true);
		wooltostring = config.get(category3, "Allow wool to decraft to string?", true).getBoolean(true);
		magmacreamtoslime = config.get(category3, "Allow Magma cream to slimeball recipe?", true).getBoolean(true);
		
		String category4 = "Random things";
		dungeonlootenablevannila= config.get(category4,"Allow vannila storage blocks to spawn in dungeon loot?", true).getBoolean(true);
		dungeonlootenablemod= config.get(category4,"Allow modded storage blocks to spawn in dungeon loot?", true).getBoolean(true);
		furnacemelts = config.get(category4,"Allow furnace melting of stuff like iron doors?",true).getBoolean(true);
		
		String category5 = "World Generation - Marble";
		generatemarble = config.get(category5,"Allow marble to generate in the world?", true).getBoolean(true);
		marbleheight = config.get(category5,"Height-How low should the marble generate?",32).getInt();
		marblerange = config.get(category5,"Range-What is the range from ^, such as, if height was 10, and range was 20, it would generate from 10-30.",60).getInt();
		marblevein = config.get(category5,"VeinThickness- How big of a vien of marble should spawn,say you want 50 in a vein, do 25",24).getInt();
		marblerarity = config.get(category5,"Rarity- How often should marble generate in a chunk, good value is below 5",1).getInt();
		
		
		String category6 = "World Generation - Black Marble";
		generateblackmarble = config.get(category6,"Allow Ashford Black Marble to generate in the world?", true).getBoolean(true);
		blackmarbleheight = config.get(category6,"Height-How low should the black marble generate?",10).getInt();
		blackmarblerange = config.get(category6,"Range-What is the range from ^, such as, if height was 10, and range was 20, it would generate from 10-30.",22).getInt();
		blackmarblevein = config.get(category6,"VeinThickness- How big of a vien of black marble should spawn,say you want 50 in a vein, do 25",24).getInt();
		blackmarblerarity = config.get(category6,"Rarity- How often should black marble generate in a chunk, good value is below 5",1).getInt();
		
		String category7 = "World Generation - Underwater Ruins";
		generateruin = config.get(category7,"Allow Underwater Ruins to generate?", true).getBoolean(true);
		ruinchance = config.get(category7, "One in how many chance of the ruins to generate. Such as 20 will make it a 1 in 20, play in ssp to find a good value(i suggest 150+)",150).getInt();
		
		String category8 = "World Generation - Slabs/stairs";
		marbleslabs = config.get(category8,"Allowed to make Marble slabs?", true).getBoolean(true);
		
		//		String category7 = "Texture swapping";
//		Property blackmarbletextures = config.get(category6,"Do you want to use my textures for black marble or alt textures? type true for mine, false for alt",true);
//		blackmarbletextures.comment = "Type true for main textures, false for alt textures";

		// Since this flag is a boolean, we can read it into the variable directly from the config.
//		Configflags = config.get(Configuration.CATEGORY_GENERAL, "SomeConfigFlag", false).getBoolean(false);

		config.save();
	}
//#### Block id ints and booleans###
	public static int storageblockconfig;
	public static int storageblockmodconfig;
	public static int forestryblockconfig;
	public static int vanityentityconfig;
	public static int vanitydesignconfig;
	public static int vanitydesignworldconfig;
	public static int vanitydesignworldslabconfig;
	public static boolean enablesugarcane;
	public static boolean enablecharcoal;
	public static boolean enableenderpearl;
	public static boolean enableslime;
	public static boolean enablesugar;
	public static boolean enablecocoa;
	public static boolean enableblaze;
	public static boolean enableleather;
	public static boolean enablebone;
	public static boolean enabletin;
	public static boolean enablecopper;
	public static boolean enablesilver;
	public static boolean enablelead;
	public static boolean enablenikolite;
	public static boolean enablenickel;
	public static boolean enableelectrum;
	public static boolean enableplatinum;
	public static boolean enableinvar;
	public static boolean enablebrass;
	public static boolean enablerubber;
	public static boolean enableapatite;
	public static boolean enablehoneydrop;
	public static boolean enablehoneydew;
	public static boolean enablepeat;
	public static boolean enableclaybrick;
	public static boolean gregtechcompat;
	public static boolean enablemeltingcore;
	public static boolean enablelavalamp;
// #### Recipe booleans
	public static boolean magmacreamtoslime;
	public static boolean dragoneggrecipe;
	public static boolean arrowtofeather;
	public static boolean fleshtoleather;
	public static boolean quartzblocktoquartz;
	public static boolean greendye;
	public static boolean wooltostring;
	public static boolean enablecoalcoke;
	public static boolean storageblocking;
	public static boolean dungeonlootenablevannila;
	public static boolean dungeonlootenablemod;
	public static boolean furnacemelts;
	
// #####  Rupee id ints and booleans ###
	public static boolean enablerupees;
	public static int greenrupee1;
	public static int bluerupee5;
	public static int redrupee20;
	public static int biggreenrupee50;
	public static int bigbluerupee100;
	public static int bigredrupee200;	

//#### World gen ints and booleans	
	public static boolean generatemarble;
	public static int marbleheight;
	public static int marblerange;
	public static int marblevein;
	public static int marblerarity;
	public static boolean generateblackmarble;
	public static int blackmarbleheight;
	public static int blackmarblerange;
	public static int blackmarblevein;
	public static int blackmarblerarity;
	public static boolean generateruin;
	public static int ruinchance;
	public static boolean marbleslabs;
}