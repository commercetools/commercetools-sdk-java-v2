
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderUpdateSyncInfoActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderUpdateSyncInfoAction stagedOrderUpdateSyncInfoAction = StagedOrderUpdateSyncInfoAction.builder()
 *             .channel(channelBuilder -> channelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderUpdateSyncInfoActionBuilder implements Builder<StagedOrderUpdateSyncInfoAction> {

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    @Nullable
    private String externalId;

    @Nullable
    private java.time.ZonedDateTime syncedAt;

    /**
     <*  <p>ResourceIdentifier to a Channel.</p>>
     */

    public StagedOrderUpdateSyncInfoActionBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     <*  <p>ResourceIdentifier to a Channel.</p>>
     */

    public StagedOrderUpdateSyncInfoActionBuilder channel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    /**
     <>
     */

    public StagedOrderUpdateSyncInfoActionBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     <>
     */

    public StagedOrderUpdateSyncInfoActionBuilder syncedAt(@Nullable final java.time.ZonedDateTime syncedAt) {
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

    public StagedOrderUpdateSyncInfoAction build() {
        Objects.requireNonNull(channel, StagedOrderUpdateSyncInfoAction.class + ": channel is missing");
        return new StagedOrderUpdateSyncInfoActionImpl(channel, externalId, syncedAt);
    }

    /**
     * builds StagedOrderUpdateSyncInfoAction without checking for non null required values
     */
    public StagedOrderUpdateSyncInfoAction buildUnchecked() {
        return new StagedOrderUpdateSyncInfoActionImpl(channel, externalId, syncedAt);
    }

    public static StagedOrderUpdateSyncInfoActionBuilder of() {
        return new StagedOrderUpdateSyncInfoActionBuilder();
    }

    public static StagedOrderUpdateSyncInfoActionBuilder of(final StagedOrderUpdateSyncInfoAction template) {
        StagedOrderUpdateSyncInfoActionBuilder builder = new StagedOrderUpdateSyncInfoActionBuilder();
        builder.channel = template.getChannel();
        builder.externalId = template.getExternalId();
        builder.syncedAt = template.getSyncedAt();
        return builder;
    }

}
