package vanityblocks.Dimensions.Providers;

import vanityblocks.Storageprops;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;
import net.minecraft.world.gen.ChunkProviderGenerate;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class VmForestProvider extends WorldProvider
{
    public void registerWorldChunkManager ()
    {
        this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.forest, 0.7F, 0.8F);
        this.dimensionId = Storageprops.vmforestid;
    }

    public IChunkProvider createChunkGenerator ()
    {
        return new ChunkProviderGenerate(this.worldObj, this.worldObj.getSeed(), true);
    }

    /**
     * True if the player can respawn in this dimension (true = overworld, false = nether).
     */
    @Override
    public boolean canRespawnHere ()
    {
        if (Storageprops.vmrespawn)
        {
            return true;
        }
        return false;
    }

    @Override
    public String getWelcomeMessage ()
    {
        return "Entering the VanityBlocks Mining Forest Dimension";
    }

    @Override
    public String getDepartMessage ()
    {
        return "Leaving the VanityBlocks Mining Forest Dimension";
    }

    @Override
    public String getDimensionName ()
    {
        return "VanityBlocks Mining Forest Dimension";
    }
}