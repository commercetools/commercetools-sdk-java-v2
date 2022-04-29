
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class InventoryEntrySetKeyActionBuilder implements Builder<InventoryEntrySetKeyAction> {

    @Nullable
    private String key;

    public InventoryEntrySetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public InventoryEntrySetKeyAction build() {
        return new InventoryEntrySetKeyActionImpl(key);
    }

    /**
     * builds InventoryEntrySetKeyAction without checking for non null required values
     */
    public InventoryEntrySetKeyAction buildUnchecked() {
        return new InventoryEntrySetKeyActionImpl(key);
    }

    public static InventoryEntrySetKeyActionBuilder of() {
        return new InventoryEntrySetKeyActionBuilder();
    }

    public static InventoryEntrySetKeyActionBuilder of(final InventoryEntrySetKeyAction template) {
        InventoryEntrySetKeyActionBuilder builder = new InventoryEntrySetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
