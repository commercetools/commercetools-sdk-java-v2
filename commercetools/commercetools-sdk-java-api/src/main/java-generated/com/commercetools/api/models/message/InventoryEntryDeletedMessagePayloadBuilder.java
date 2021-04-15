
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntryDeletedMessagePayloadBuilder {

    private String sku;

    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    public InventoryEntryDeletedMessagePayloadBuilder sku(final String sku) {
        this.sku = sku;
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
