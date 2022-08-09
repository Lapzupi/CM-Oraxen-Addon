package com.lapzupi.dev.oraxen.oraxenaddon;

import com.lapzupi.dev.configurablemenus.addons.ItemAddon;
import io.th0rgal.oraxen.items.OraxenItems;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class OraxenAddon extends ItemAddon {
    @Override
    public ItemStack getItemStack(final String id) {
        if(OraxenItems.getItemById(id) != null) {
            return OraxenItems.getItemById(id).build();
        }
        throw new NullPointerException("No oraxen item with id %s".formatted(id));
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getPrefix() {
        return "oraxen";
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getPluginName() {
        return "Oraxen";
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getAuthor() {
        return "Lapzupi Development Team";
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getVersion() {
        return "1.0.0";
    }
}
