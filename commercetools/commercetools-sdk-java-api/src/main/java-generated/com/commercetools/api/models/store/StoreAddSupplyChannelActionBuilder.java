
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreAddSupplyChannelActionBuilder implements Builder<StoreAddSupplyChannelAction> {

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    public StoreAddSupplyChannelActionBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public StoreAddSupplyChannelActionBuilder supplyChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    public StoreAddSupplyChannelAction build() {
        Objects.requireNonNull(supplyChannel, StoreAddSupplyChannelAction.class + ": supplyChannel is missing");
        return new StoreAddSupplyChannelActionImpl(supplyChannel);
    }

    /**
     * builds StoreAddSupplyChannelAction without checking for non null required values
     */
    public StoreAddSupplyChannelAction buildUnchecked() {
        return new StoreAddSupplyChannelActionImpl(supplyChannel);
    }

    public static StoreAddSupplyChannelActionBuilder of() {
        return new StoreAddSupplyChannelActionBuilder();
    }

    public static StoreAddSupplyChannelActionBuilder of(final StoreAddSupplyChannelAction template) {
        StoreAddSupplyChannelActionBuilder builder = new StoreAddSupplyChannelActionBuilder();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
