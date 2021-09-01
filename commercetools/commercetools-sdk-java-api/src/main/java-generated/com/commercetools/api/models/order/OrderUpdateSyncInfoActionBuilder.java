
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderUpdateSyncInfoActionBuilder implements Builder<OrderUpdateSyncInfoAction> {

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    @Nullable
    private String externalId;

    @Nullable
    private java.time.ZonedDateTime syncedAt;

    public OrderUpdateSyncInfoActionBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public OrderUpdateSyncInfoActionBuilder channel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    public OrderUpdateSyncInfoActionBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    public OrderUpdateSyncInfoActionBuilder syncedAt(@Nullable final java.time.ZonedDateTime syncedAt) {
        this.syncedAt = syncedAt;
        return this;
    }

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    @Nullable
    public java.time.ZonedDateTime getSyncedAt() {
        return this.syncedAt;
    }

    public OrderUpdateSyncInfoAction build() {
        Objects.requireNonNull(channel, OrderUpdateSyncInfoAction.class + ": channel is missing");
        return new OrderUpdateSyncInfoActionImpl(channel, externalId, syncedAt);
    }

    /**
     * builds OrderUpdateSyncInfoAction without checking for non null required values
     */
    public OrderUpdateSyncInfoAction buildUnchecked() {
        return new OrderUpdateSyncInfoActionImpl(channel, externalId, syncedAt);
    }

    public static OrderUpdateSyncInfoActionBuilder of() {
        return new OrderUpdateSyncInfoActionBuilder();
    }

    public static OrderUpdateSyncInfoActionBuilder of(final OrderUpdateSyncInfoAction template) {
        OrderUpdateSyncInfoActionBuilder builder = new OrderUpdateSyncInfoActionBuilder();
        builder.channel = template.getChannel();
        builder.externalId = template.getExternalId();
        builder.syncedAt = template.getSyncedAt();
        return builder;
    }

}
