
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderUpdateSyncInfoActionBuilder {

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    @Nullable
    private String externalId;

    @Nullable
    private java.time.ZonedDateTime syncedAt;

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
