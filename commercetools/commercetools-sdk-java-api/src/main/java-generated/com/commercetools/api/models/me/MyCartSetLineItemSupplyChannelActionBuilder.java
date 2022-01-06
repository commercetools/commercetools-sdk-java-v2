
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MyCartSetLineItemSupplyChannelActionBuilder implements Builder<MyCartSetLineItemSupplyChannelAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    public MyCartSetLineItemSupplyChannelActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public MyCartSetLineItemSupplyChannelActionBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public MyCartSetLineItemSupplyChannelActionBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    public MyCartSetLineItemSupplyChannelAction build() {
        Objects.requireNonNull(lineItemId, MyCartSetLineItemSupplyChannelAction.class + ": lineItemId is missing");
        return new MyCartSetLineItemSupplyChannelActionImpl(lineItemId, distributionChannel);
    }

    /**
     * builds MyCartSetLineItemSupplyChannelAction without checking for non null required values
     */
    public MyCartSetLineItemSupplyChannelAction buildUnchecked() {
        return new MyCartSetLineItemSupplyChannelActionImpl(lineItemId, distributionChannel);
    }

    public static MyCartSetLineItemSupplyChannelActionBuilder of() {
        return new MyCartSetLineItemSupplyChannelActionBuilder();
    }

    public static MyCartSetLineItemSupplyChannelActionBuilder of(final MyCartSetLineItemSupplyChannelAction template) {
        MyCartSetLineItemSupplyChannelActionBuilder builder = new MyCartSetLineItemSupplyChannelActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
