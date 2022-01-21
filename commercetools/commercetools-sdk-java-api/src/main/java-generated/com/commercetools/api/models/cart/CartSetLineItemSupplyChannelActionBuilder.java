
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartSetLineItemSupplyChannelActionBuilder implements Builder<CartSetLineItemSupplyChannelAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    public CartSetLineItemSupplyChannelActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public CartSetLineItemSupplyChannelActionBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public CartSetLineItemSupplyChannelActionBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    public CartSetLineItemSupplyChannelAction build() {
        Objects.requireNonNull(lineItemId, CartSetLineItemSupplyChannelAction.class + ": lineItemId is missing");
        return new CartSetLineItemSupplyChannelActionImpl(lineItemId, supplyChannel);
    }

    /**
     * builds CartSetLineItemSupplyChannelAction without checking for non null required values
     */
    public CartSetLineItemSupplyChannelAction buildUnchecked() {
        return new CartSetLineItemSupplyChannelActionImpl(lineItemId, supplyChannel);
    }

    public static CartSetLineItemSupplyChannelActionBuilder of() {
        return new CartSetLineItemSupplyChannelActionBuilder();
    }

    public static CartSetLineItemSupplyChannelActionBuilder of(final CartSetLineItemSupplyChannelAction template) {
        CartSetLineItemSupplyChannelActionBuilder builder = new CartSetLineItemSupplyChannelActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
