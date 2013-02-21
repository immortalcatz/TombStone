package TombStone.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

import TombStone.CommonProxy;
import TombStone.TombStoneRenderer;
import TombStone.TombStoneTileEntity;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                MinecraftForgeClient.preloadTexture(BLOCK_PNG);
        }
        
        public static void setCustomRenderers()
        {
        	ClientRegistry.bindTileEntitySpecialRenderer(TombStoneTileEntity.class, new TombStoneRenderer());
        }
}