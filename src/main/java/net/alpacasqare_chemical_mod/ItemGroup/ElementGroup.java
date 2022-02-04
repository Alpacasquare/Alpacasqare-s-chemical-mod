package net.alpacasqare_chemical_mod.ItemGroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ElementGroup {
    public static final ItemGroup ACM_Elements_GROUP = FabricItemGroupBuilder.build(
            new Identifier("acm", "elements"),
            () -> new ItemStack(Blocks.COBBLESTONE));
    public static final ItemGroup ACM_OTHER_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("acm", "others"))
            .icon(() -> new ItemStack(Items.BOWL))
            .build();
}