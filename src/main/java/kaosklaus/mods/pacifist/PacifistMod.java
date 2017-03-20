package kaosklaus.mods.pacifist;

import kaosklaus.mods.pacifist.recipes.VanillaRecipes;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = PacifistMod.MODID, version = PacifistMod.VERSION)
public class PacifistMod
{
    public static final String MODID = "pacifist";
    public static final String VERSION = "0.1";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Pacifist load");
        VanillaRecipes.init();
    }
}
