
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntryDeletedMessagePayloadBuilder implements Builder<InventoryEntryDeletedMessagePayload> {

    private String sku;

    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    public InventoryEntryDeletedMessagePayloadBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    public InventoryEntryDeletedMessagePayloadBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    public InventoryEntryDeletedMessagePayloadBuilder supplyChannel(
            final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public String getSku() {
        return this.sku;
    }

    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    public InventoryEntryDeletedMessagePayload build() {
        Objects.requireNonNull(sku, InventoryEntryDeletedMessagePayload.class + ": sku is missing");
        Objects.requireNonNull(supplyChannel, InventoryEntryDeletedMessagePayload.class + ": supplyChannel is missing");
        return new InventoryEntryDeletedMessagePayloadImpl(sku, supplyChannel);
    }

    /**
     * builds InventoryEntryDeletedMessagePayload without checking for non null required values
     */
    public InventoryEntryDeletedMessagePayload buildUnchecked() {
        return new InventoryEntryDeletedMessagePayloadImpl(sku, supplyChannel);
    }

    public static InventoryEntryDeletedMessagePayloadBuilder of() {
        return new InventoryEntryDeletedMessagePayloadBuilder();
    }

    public static InventoryEntryDeletedMessagePayloadBuilder of(final InventoryEntryDeletedMessagePayload template) {
        InventoryEntryDeletedMessagePayloadBuilder builder = new InventoryEntryDeletedMessagePayloadBuilder();
        builder.sku = template.getSku();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
