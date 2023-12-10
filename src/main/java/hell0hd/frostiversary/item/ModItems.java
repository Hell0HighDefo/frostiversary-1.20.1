package hell0hd.frostiversary.item;

import hell0hd.frostiversary.Frostiversary;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LIGHT_AMULET = registerItem("light_amulet", new Item(new FabricItemSettings()));
    public static final Item DARK_AMULET = registerItem("dark_amulet", new Item(new FabricItemSettings()));

    private static void addItemstoToolsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(LIGHT_AMULET);
        entries.add(DARK_AMULET);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Frostiversary.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Frostiversary.LOGGER.info("Register Mod Items for " + Frostiversary.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemstoToolsTabItemGroup);
    }


}
