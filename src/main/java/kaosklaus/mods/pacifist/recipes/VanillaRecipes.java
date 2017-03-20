package kaosklaus.mods.pacifist.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VanillaRecipes {

    public static void init() {
        ItemStack enderPearl = new ItemStack(Items.ENDER_PEARL);
        GameRegistry.addRecipe(enderPearl,
                "DIR",
                "IGI",
                "RId",
                'R', Items.REDSTONE,
                'I', Items.IRON_INGOT,
                'G', Items.GOLD_NUGGET,
                'D', new ItemStack(Items.DYE, 1, 6),
                'd', new ItemStack(Items.DYE, 1, 2)
        );

        ItemStack skelliSkull = new ItemStack(Items.SKULL, 1, 0);
        GameRegistry.addRecipe(skelliSkull,
                "AA",
                "AA",
                'A', Items.BONE
        );

        ItemStack zombieSkull = new ItemStack(Items.SKULL, 1, 2);
        GameRegistry.addRecipe(zombieSkull,
                "AA",
                "AA",
                'A', Items.ROTTEN_FLESH
        );

        ItemStack blazeRod = new ItemStack(Items.BLAZE_ROD);
        GameRegistry.addRecipe(blazeRod,
                "B A",
                " A ",
                "A B",
                'A', Items.GOLD_INGOT,
                'B', Items.GLOWSTONE_DUST
        );

        ItemStack rottenFlesh = new ItemStack(Items.ROTTEN_FLESH);
        GameRegistry.addShapelessRecipe(rottenFlesh, Items.BEEF);
        GameRegistry.addShapelessRecipe(rottenFlesh, Items.MUTTON);
        GameRegistry.addShapelessRecipe(rottenFlesh, Items.CHICKEN);
        GameRegistry.addShapelessRecipe(rottenFlesh, Items.PORKCHOP);

    }
}
