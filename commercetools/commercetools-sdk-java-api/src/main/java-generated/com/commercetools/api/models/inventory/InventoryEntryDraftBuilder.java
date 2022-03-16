
package com.commercetools.api.models.inventory;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class InventoryEntryDraftBuilder implements Builder<InventoryEntryDraft> {

    private String sku;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    private Long quantityOnStock;

    @Nullable
    private Long restockableInDays;

    @Nullable
    private java.time.ZonedDateTime expectedDelivery;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    public InventoryEntryDraftBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    public InventoryEntryDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public InventoryEntryDraftBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public InventoryEntryDraftBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public InventoryEntryDraftBuilder quantityOnStock(final Long quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
        return this;
    }

    public InventoryEntryDraftBuilder restockableInDays(@Nullable final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    public InventoryEntryDraftBuilder expectedDelivery(@Nullable final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
        return this;
    }

    public InventoryEntryDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public InventoryEntryDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public String getSku() {
        return this.sku;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    public Long getQuantityOnStock() {
        return this.quantityOnStock;
    }

    @Nullable
    public Long getRestockableInDays() {
        return this.restockableInDays;
    }

    @Nullable
    public java.time.ZonedDateTime getExpectedDelivery() {
        return this.expectedDelivery;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public InventoryEntryDraft build() {
        Objects.requireNonNull(sku, InventoryEntryDraft.class + ": sku is missing");
        Objects.requireNonNull(quantityOnStock, InventoryEntryDraft.class + ": quantityOnStock is missing");
        return new InventoryEntryDraftImpl(sku, key, supplyChannel, quantityOnStock, restockableInDays,
            expectedDelivery, custom);
    }

    /**
     * builds InventoryEntryDraft without checking for non null required values
     */
    public InventoryEntryDraft buildUnchecked() {
        return new InventoryEntryDraftImpl(sku, key, supplyChannel, quantityOnStock, restockableInDays,
            expectedDelivery, custom);
    }

    public static InventoryEntryDraftBuilder of() {
        return new InventoryEntryDraftBuilder();
    }

    public static InventoryEntryDraftBuilder of(final InventoryEntryDraft template) {
        InventoryEntryDraftBuilder builder = new InventoryEntryDraftBuilder();
        builder.sku = template.getSku();
        builder.key = template.getKey();
        builder.supplyChannel = template.getSupplyChannel();
        builder.quantityOnStock = template.getQuantityOnStock();
        builder.restockableInDays = template.getRestockableInDays();
        builder.expectedDelivery = template.getExpectedDelivery();
        builder.custom = template.getCustom();
        return builder;
    }

}
