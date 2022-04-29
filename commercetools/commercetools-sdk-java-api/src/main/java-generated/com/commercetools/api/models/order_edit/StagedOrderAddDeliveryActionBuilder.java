
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderAddDeliveryActionBuilder implements Builder<StagedOrderAddDeliveryAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    public StagedOrderAddDeliveryActionBuilder items(
            @Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public StagedOrderAddDeliveryActionBuilder items(
            @Nullable final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public StagedOrderAddDeliveryActionBuilder plusItems(
            @Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    public StagedOrderAddDeliveryActionBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public StagedOrderAddDeliveryActionBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public StagedOrderAddDeliveryActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public StagedOrderAddDeliveryActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public StagedOrderAddDeliveryActionBuilder parcels(
            @Nullable final com.commercetools.api.models.order.ParcelDraft... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    public StagedOrderAddDeliveryActionBuilder parcels(
            @Nullable final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels) {
        this.parcels = parcels;
        return this;
    }

    public StagedOrderAddDeliveryActionBuilder plusParcels(
            @Nullable final com.commercetools.api.models.order.ParcelDraft... parcels) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.addAll(Arrays.asList(parcels));
        return this;
    }

    public StagedOrderAddDeliveryActionBuilder plusParcels(
            Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraftBuilder> builder) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.add(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()).build());
        return this;
    }

    public StagedOrderAddDeliveryActionBuilder withParcels(
            Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraftBuilder> builder) {
        this.parcels = new ArrayList<>();
        this.parcels.add(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()).build());
        return this;
    }

    public StagedOrderAddDeliveryActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public StagedOrderAddDeliveryActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ParcelDraft> getParcels() {
        return this.parcels;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public StagedOrderAddDeliveryAction build() {
        return new StagedOrderAddDeliveryActionImpl(items, address, parcels, custom);
    }

    /**
     * builds StagedOrderAddDeliveryAction without checking for non null required values
     */
    public StagedOrderAddDeliveryAction buildUnchecked() {
        return new StagedOrderAddDeliveryActionImpl(items, address, parcels, custom);
    }

    public static StagedOrderAddDeliveryActionBuilder of() {
        return new StagedOrderAddDeliveryActionBuilder();
    }

    public static StagedOrderAddDeliveryActionBuilder of(final StagedOrderAddDeliveryAction template) {
        StagedOrderAddDeliveryActionBuilder builder = new StagedOrderAddDeliveryActionBuilder();
        builder.items = template.getItems();
        builder.address = template.getAddress();
        builder.parcels = template.getParcels();
        builder.custom = template.getCustom();
        return builder;
    }

}
