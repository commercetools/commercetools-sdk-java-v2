
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntrySetRestockableInDaysActionBuilder
        implements Builder<InventoryEntrySetRestockableInDaysAction> {

    @Nullable
    private Long restockableInDays;

    public InventoryEntrySetRestockableInDaysActionBuilder restockableInDays(@Nullable final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    @Nullable
    public Long getRestockableInDays() {
        return this.restockableInDays;
    }

    public InventoryEntrySetRestockableInDaysAction build() {
        return new InventoryEntrySetRestockableInDaysActionImpl(restockableInDays);
    }

    /**
     * builds InventoryEntrySetRestockableInDaysAction without checking for non null required values
     */
    public InventoryEntrySetRestockableInDaysAction buildUnchecked() {
        return new InventoryEntrySetRestockableInDaysActionImpl(restockableInDays);
    }

    public static InventoryEntrySetRestockableInDaysActionBuilder of() {
        return new InventoryEntrySetRestockableInDaysActionBuilder();
    }

    public static InventoryEntrySetRestockableInDaysActionBuilder of(
            final InventoryEntrySetRestockableInDaysAction template) {
        InventoryEntrySetRestockableInDaysActionBuilder builder = new InventoryEntrySetRestockableInDaysActionBuilder();
        builder.restockableInDays = template.getRestockableInDays();
        return builder;
    }

}
