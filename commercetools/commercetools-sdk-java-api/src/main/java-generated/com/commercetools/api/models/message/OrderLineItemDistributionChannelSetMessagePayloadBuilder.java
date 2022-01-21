
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderLineItemDistributionChannelSetMessagePayloadBuilder
        implements Builder<OrderLineItemDistributionChannelSetMessagePayload> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    public OrderLineItemDistributionChannelSetMessagePayloadBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public OrderLineItemDistributionChannelSetMessagePayloadBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.distributionChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of())
                .build();
        return this;
    }

    public OrderLineItemDistributionChannelSetMessagePayloadBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    public OrderLineItemDistributionChannelSetMessagePayload build() {
        Objects.requireNonNull(lineItemId,
            OrderLineItemDistributionChannelSetMessagePayload.class + ": lineItemId is missing");
        return new OrderLineItemDistributionChannelSetMessagePayloadImpl(lineItemId, distributionChannel);
    }

    /**
     * builds OrderLineItemDistributionChannelSetMessagePayload without checking for non null required values
     */
    public OrderLineItemDistributionChannelSetMessagePayload buildUnchecked() {
        return new OrderLineItemDistributionChannelSetMessagePayloadImpl(lineItemId, distributionChannel);
    }

    public static OrderLineItemDistributionChannelSetMessagePayloadBuilder of() {
        return new OrderLineItemDistributionChannelSetMessagePayloadBuilder();
    }

    public static OrderLineItemDistributionChannelSetMessagePayloadBuilder of(
            final OrderLineItemDistributionChannelSetMessagePayload template) {
        OrderLineItemDistributionChannelSetMessagePayloadBuilder builder = new OrderLineItemDistributionChannelSetMessagePayloadBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
