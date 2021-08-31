
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartSetLineItemDistributionChannelActionBuilder
        implements Builder<MyCartSetLineItemDistributionChannelAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    public MyCartSetLineItemDistributionChannelActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public MyCartSetLineItemDistributionChannelActionBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public MyCartSetLineItemDistributionChannelActionBuilder distributionChannel(
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

    public MyCartSetLineItemDistributionChannelAction build() {
        Objects.requireNonNull(lineItemId,
            MyCartSetLineItemDistributionChannelAction.class + ": lineItemId is missing");
        return new MyCartSetLineItemDistributionChannelActionImpl(lineItemId, distributionChannel);
    }

    /**
     * builds MyCartSetLineItemDistributionChannelAction without checking for non null required values
     */
    public MyCartSetLineItemDistributionChannelAction buildUnchecked() {
        return new MyCartSetLineItemDistributionChannelActionImpl(lineItemId, distributionChannel);
    }

    public static MyCartSetLineItemDistributionChannelActionBuilder of() {
        return new MyCartSetLineItemDistributionChannelActionBuilder();
    }

    public static MyCartSetLineItemDistributionChannelActionBuilder of(
            final MyCartSetLineItemDistributionChannelAction template) {
        MyCartSetLineItemDistributionChannelActionBuilder builder = new MyCartSetLineItemDistributionChannelActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
