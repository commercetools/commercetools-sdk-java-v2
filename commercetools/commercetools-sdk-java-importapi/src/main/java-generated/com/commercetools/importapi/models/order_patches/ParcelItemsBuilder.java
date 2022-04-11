
package com.commercetools.importapi.models.order_patches;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ParcelItemsBuilder implements Builder<ParcelItems> {

    private String parcelId;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    public ParcelItemsBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public ParcelItemsBuilder items(@Nullable final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public ParcelItemsBuilder items(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public ParcelItemsBuilder plusItems(
            @Nullable final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    public ParcelItemsBuilder plusItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }

    public ParcelItemsBuilder withItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    public ParcelItems build() {
        Objects.requireNonNull(parcelId, ParcelItems.class + ": parcelId is missing");
        return new ParcelItemsImpl(parcelId, items);
    }

    /**
     * builds ParcelItems without checking for non null required values
     */
    public ParcelItems buildUnchecked() {
        return new ParcelItemsImpl(parcelId, items);
    }

    public static ParcelItemsBuilder of() {
        return new ParcelItemsBuilder();
    }

    public static ParcelItemsBuilder of(final ParcelItems template) {
        ParcelItemsBuilder builder = new ParcelItemsBuilder();
        builder.parcelId = template.getParcelId();
        builder.items = template.getItems();
        return builder;
    }

}
