package vanityblocks.Registrations;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import vanityblocks.ForestryBlock;
import vanityblocks.StorageBlock;
import vanityblocks.StorageBlockMod;
import vanityblocks.Storageprops;
import vanityblocks.Items.bigbluerupee;
import vanityblocks.Items.biggreenrupee;
import vanityblocks.Items.bigredrupee;
import vanityblocks.Items.bluerupee;
import vanityblocks.Items.coalstorageitem;
import vanityblocks.Items.flintitem;
import vanityblocks.Items.greenrupee;
import vanityblocks.Items.redrupee;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class GeneralItemRegistration {
	public static Item flintitem;
	public static Item coalstorageitem;

	
	public static void generalitemregistration() {
		if (Storageprops.enableflintitem) {
			flintitem = new flintitem(Storageprops.flintitem - 256).setUnlocalizedName("FlintStorageItem");
			LanguageRegistry.addName(flintitem, "Flint Storage Item");
		}
		if (Storageprops.enablecoalstorageitem) {
			coalstorageitem = new coalstorageitem(Storageprops.coalstorageitem -256).setUnlocalizedName("CoalStorageItem");
			LanguageRegistry.addName(coalstorageitem, "Coal Storage Item( 8pieces )");			
		}
}
	public static void additemrecipes() {
	
	if (Storageprops.enableflintitem) {		
	// ############# to make the Blue Rupees
	GameRegistry.addRecipe(new ItemStack(flintitem,1), "xxx", "xxx", "xxx", 'x', new ItemStack(Item.flint,1));
	GameRegistry.addShapelessRecipe(new ItemStack(Item.flint,9), new ItemStack(flintitem));
//	GameRegistry.addShapelessRecipe(new ItemStack(bluerupee5), new ItemStack(greenrupee1), new ItemStack(greenrupee1), new ItemStack(greenrupee1), new ItemStack(greenrupee1), new ItemStack(greenrupee1));
	}
	if (Storageprops.enablecoalstorageitem) {
		GameRegistry.addRecipe(new ItemStack(coalstorageitem,1), "xxx", "x x", "xxx", 'x', new ItemStack(Item.coal,1));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.coal,8), new ItemStack(coalstorageitem));
	
	}
}
}