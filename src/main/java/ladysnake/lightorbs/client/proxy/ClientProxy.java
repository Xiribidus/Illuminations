package ladysnake.lightorbs.client.proxy;

import ladysnake.lightorbs.common.init.CommonProxy;
import ladysnake.lightorbs.common.init.ModEntities;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    private int particleCount = 0;

    @Override
    public void preInit() {
        super.preInit();
        ModEntities.registerRenders();
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }

    @Override
    public Side getSide() {
        return Side.CLIENT;
    }

}
