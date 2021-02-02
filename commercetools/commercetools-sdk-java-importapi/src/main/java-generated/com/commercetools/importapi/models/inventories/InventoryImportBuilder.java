
package com.commercetools.importapi.models.inventories;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryImportBuilder {

    private String key;

    private String sku;

    private Double quantityOnStock;

    @Nullable
    private Double restockableInDays;

    @Nullable
    private java.time.ZonedDateTime expectedDelivery;

    @Nullable
    private com.commercetools.importapi.models.common.ChannelKeyReference supplyChannel;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    public InventoryImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public InventoryImportBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    public InventoryImportBuilder quantityOnStock(final Double quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
        return this;
    }

    public InventoryImportBuilder restockableInDays(@Nullable final Double restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    public InventoryImportBuilder expectedDelivery(@Nullable final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
        return this;
    }

    public InventoryImportBuilder supplyChannel(
            @Nullable final com.commercetools.importapi.models.common.ChannelKeyReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public InventoryImportBuilder custom(
            @Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public String getSku() {
        return this.sku;
    }

    public Double getQuantityOnStock() {
        return this.quantityOnStock;
    }

    @Nullable
    public Double getRestockableInDays() {
        return this.restockableInDays;
    }

    @Nullable
    public java.time.ZonedDateTime getExpectedDelivery() {
        return this.expectedDelivery;
    }

    @Nullable
    public com.commercetools.importapi.models.common.ChannelKeyReference getSupplyChannel() {
        return this.supplyChannel;
    }

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public InventoryImport build() {
        return new InventoryImportImpl(key, sku, quantityOnStock, restockableInDays, expectedDelivery, supplyChannel,
            custom);
    }

    public static InventoryImportBuilder of() {
        return new InventoryImportBuilder();
    }

    public static InventoryImportBuilder of(final InventoryImport template) {
        InventoryImportBuilder builder = new InventoryImportBuilder();
        builder.key = template.getKey();
        builder.sku = template.getSku();
        builder.quantityOnStock = template.getQuantityOnStock();
        builder.restockableInDays = template.getRestockableInDays();
        builder.expectedDelivery = template.getExpectedDelivery();
        builder.supplyChannel = template.getSupplyChannel();
        builder.custom = template.getCustom();
        return builder;
    }

}
