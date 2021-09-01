
package com.commercetools.importapi.models.order_patches;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryDraftBuilder implements Builder<DeliveryDraft> {

    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    @Nullable
    private com.commercetools.importapi.models.common.Address address;

    private java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> parcels;

    public DeliveryDraftBuilder items(final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public DeliveryDraftBuilder withItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }

    public DeliveryDraftBuilder plusItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }

    public DeliveryDraftBuilder items(
            final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public DeliveryDraftBuilder address(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()).build();
        return this;
    }

    public DeliveryDraftBuilder address(@Nullable final com.commercetools.importapi.models.common.Address address) {
        this.address = address;
        return this;
    }

    public DeliveryDraftBuilder parcels(
            final com.commercetools.importapi.models.order_patches.DeliveryParcelDraft... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    public DeliveryDraftBuilder withParcels(
            Function<com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder, com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder> builder) {
        this.parcels = new ArrayList<>();
        this.parcels.add(
            builder.apply(com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder.of()).build());
        return this;
    }

    public DeliveryDraftBuilder plusParcels(
            Function<com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder, com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder> builder) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.add(
            builder.apply(com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder.of()).build());
        return this;
    }

    public DeliveryDraftBuilder parcels(
            final java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> parcels) {
        this.parcels = parcels;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    @Nullable
    public com.commercetools.importapi.models.common.Address getAddress() {
        return this.address;
    }

    public java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> getParcels() {
        return this.parcels;
    }

    public DeliveryDraft build() {
        Objects.requireNonNull(items, DeliveryDraft.class + ": items is missing");
        Objects.requireNonNull(parcels, DeliveryDraft.class + ": parcels is missing");
        return new DeliveryDraftImpl(items, address, parcels);
    }

    /**
     * builds DeliveryDraft without checking for non null required values
     */
    public DeliveryDraft buildUnchecked() {
        return new DeliveryDraftImpl(items, address, parcels);
    }

    public static DeliveryDraftBuilder of() {
        return new DeliveryDraftBuilder();
    }

    public static DeliveryDraftBuilder of(final DeliveryDraft template) {
        DeliveryDraftBuilder builder = new DeliveryDraftBuilder();
        builder.items = template.getItems();
        builder.address = template.getAddress();
        builder.parcels = template.getParcels();
        return builder;
    }

}
