
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SyncInfoBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SyncInfo syncInfo = SyncInfo.builder()
 *             .channel(channelBuilder -> channelBuilder)
 *             .syncedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SyncInfoBuilder implements Builder<SyncInfo> {

    private com.commercetools.api.models.channel.ChannelReference channel;

    @Nullable
    private String externalId;

    private java.time.ZonedDateTime syncedAt;

    /**
     *  <p>Connection to a synchronization destination.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public SyncInfoBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Connection to a synchronization destination.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public SyncInfoBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Connection to a synchronization destination.</p>
     * @param channel value to be set
     * @return Builder
     */

    public SyncInfoBuilder channel(final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Identifier of an external order instance, file, or other resource.</p>
     * @param externalId value to be set
     * @return Builder
     */

    public SyncInfoBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the information was synced.</p>
     * @param syncedAt value to be set
     * @return Builder
     */

    public SyncInfoBuilder syncedAt(final java.time.ZonedDateTime syncedAt) {
        this.syncedAt = syncedAt;
        return this;
    }

    /**
     *  <p>Connection to a synchronization destination.</p>
     * @return channel
     */

    public com.commercetools.api.models.channel.ChannelReference getChannel() {
        return this.channel;
    }

    /**
     *  <p>Identifier of an external order instance, file, or other resource.</p>
     * @return externalId
     */

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    /**
     *  <p>Date and time (UTC) the information was synced.</p>
     * @return syncedAt
     */

    public java.time.ZonedDateTime getSyncedAt() {
        return this.syncedAt;
    }

    /**
     * builds SyncInfo with checking for non-null required values
     * @return SyncInfo
     */
    public SyncInfo build() {
        Objects.requireNonNull(channel, SyncInfo.class + ": channel is missing");
        Objects.requireNonNull(syncedAt, SyncInfo.class + ": syncedAt is missing");
        return new SyncInfoImpl(channel, externalId, syncedAt);
    }

    /**
     * builds SyncInfo without checking for non-null required values
     * @return SyncInfo
     */
    public SyncInfo buildUnchecked() {
        return new SyncInfoImpl(channel, externalId, syncedAt);
    }

    /**
     * factory method for an instance of SyncInfoBuilder
     * @return builder
     */
    public static SyncInfoBuilder of() {
        return new SyncInfoBuilder();
    }

    /**
     * create builder for SyncInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SyncInfoBuilder of(final SyncInfo template) {
        SyncInfoBuilder builder = new SyncInfoBuilder();
        builder.channel = template.getChannel();
        builder.externalId = template.getExternalId();
        builder.syncedAt = template.getSyncedAt();
        return builder;
    }

}
