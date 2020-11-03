package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InventoryEntrySetExpectedDeliveryActionBuilder {

    @Nullable
    private java.time.ZonedDateTime expectedDelivery;

    public InventoryEntrySetExpectedDeliveryActionBuilder expectedDelivery(@Nullable final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getExpectedDelivery(){
        return this.expectedDelivery;
    }

    public InventoryEntrySetExpectedDeliveryAction build() {
        return new InventoryEntrySetExpectedDeliveryActionImpl(expectedDelivery);
    }

    public static InventoryEntrySetExpectedDeliveryActionBuilder of() {
        return new InventoryEntrySetExpectedDeliveryActionBuilder();
    }

    public static InventoryEntrySetExpectedDeliveryActionBuilder of(final InventoryEntrySetExpectedDeliveryAction template) {
        InventoryEntrySetExpectedDeliveryActionBuilder builder = new InventoryEntrySetExpectedDeliveryActionBuilder();
        builder.expectedDelivery = template.getExpectedDelivery();
        return builder;
    }

}
