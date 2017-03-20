package kaosklaus.mods.pacifist.handler;

import kaosklaus.mods.pacifist.PacifistMod;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.LootingEnchantBonus;
import net.minecraft.world.storage.loot.functions.SetCount;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ForgeEventHandler {

    @SubscribeEvent
    public static void lootTableLoad(LootTableLoadEvent event) {
        ResourceLocation resource = event.getName();

        if (resource.equals(LootTableList.ENTITIES_COW)) {
            System.out.println("**********************************COW LOOT");
            event.getTable().addPool(createLootPool(Items.BONE));
        } else if (resource.equals(LootTableList.ENTITIES_PIG)) {
            System.out.println("**********************************PIG LOOT");

        } else if (resource.equals(LootTableList.ENTITIES_SHEEP)) {

        } else if (resource.equals(LootTableList.ENTITIES_CHICKEN)) {

        } else if (resource.equals(LootTableList.ENTITIES_HORSE)) {

        } else if (resource.equals(LootTableList.ENTITIES_RABBIT)) {

        } else if (resource.equals(LootTableList.ENTITIES_POLAR_BEAR)) {

        } else if (resource.equals(LootTableList.ENTITIES_WOLF)) {

        } else if (resource.equals(LootTableList.ENTITIES_OCELOT)) {

        }

    }

    private static LootPool createLootPool(Item itemToBeDropped) {
        // Determines how often this entry will be chosen out of all the entries in the pool.
        // Entries with higher weights will be used more often
        // (chance is this entry's weight⁄total of all considered entries' weights).
        int weightIn;
        // Modifies the entry's weight based on the killing/opening/fishing player's luck attribute.
        // Formula is floor( weight + (quality * generic.luck)).
        int qualityIn;

        LootPool newLootPool = new LootPool(new LootEntry[0], new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0), "pacifistDrops");
        LootEntryItem newLootEntryItem = new LootEntryItem(itemToBeDropped, 1,
                0,
                new LootFunction[]{
                    new SetCount(new LootCondition[0], new RandomValueRange(1, 3)), new LootingEnchantBonus(new LootCondition[0], new RandomValueRange(0, 1), 1)
                },
                new LootCondition[0],
                PacifistMod.MODID + ":bone");
        newLootPool.addEntry(newLootEntryItem);
        return newLootPool;
    }
}
