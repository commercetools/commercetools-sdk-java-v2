
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

    @Nullable
    private String externalId;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    @Nullable
    private java.time.ZonedDateTime syncedAt;

    /**
     *  <p>Set this to identify an external order instance, file, or other resource.</p>
     * @param externalId value to be set
     * @return Builder
     */

    public StagedOrderUpdateSyncInfoActionBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>The synchronization destination to set. Must not be empty. The referenced Channel must have the <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">Channel Role</a> <code>OrderExport</code> or <code>OrderImport</code>. Otherwise this update action returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public StagedOrderUpdateSyncInfoActionBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The synchronization destination to set. Must not be empty. The referenced Channel must have the <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">Channel Role</a> <code>OrderExport</code> or <code>OrderImport</code>. Otherwise this update action returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public StagedOrderUpdateSyncInfoActionBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>The synchronization destination to set. Must not be empty. The referenced Channel must have the <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">Channel Role</a> <code>OrderExport</code> or <code>OrderImport</code>. Otherwise this update action returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error.</p>
     * @param channel value to be set
     * @return Builder
     */

    public StagedOrderUpdateSyncInfoActionBuilder channel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>If not set, it defaults to the current date and time.</p>
     * @param syncedAt value to be set
     * @return Builder
     */

    public StagedOrderUpdateSyncInfoActionBuilder syncedAt(@Nullable final java.time.ZonedDateTime syncedAt) {
        this.syncedAt = syncedAt;
        return this;
    }

    /**
     *  <p>Set this to identify an external order instance, file, or other resource.</p>
     * @return externalId
     */

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    /**
     *  <p>The synchronization destination to set. Must not be empty. The referenced Channel must have the <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">Channel Role</a> <code>OrderExport</code> or <code>OrderImport</code>. Otherwise this update action returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error.</p>
     * @return channel
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *  <p>If not set, it defaults to the current date and time.</p>
     * @return syncedAt
     */

    @Nullable
    public java.time.ZonedDateTime getSyncedAt() {
        return this.syncedAt;
    }

    /**
     * builds StagedOrderUpdateSyncInfoAction with checking for non-null required values
     * @return StagedOrderUpdateSyncInfoAction
     */
    public StagedOrderUpdateSyncInfoAction build() {
        Objects.requireNonNull(channel, StagedOrderUpdateSyncInfoAction.class + ": channel is missing");
        return new StagedOrderUpdateSyncInfoActionImpl(externalId, channel, syncedAt);
    }

    /**
     * builds StagedOrderUpdateSyncInfoAction without checking for non-null required values
     * @return StagedOrderUpdateSyncInfoAction
     */
    public StagedOrderUpdateSyncInfoAction buildUnchecked() {
        return new StagedOrderUpdateSyncInfoActionImpl(externalId, channel, syncedAt);
    }

    /**
     * factory method for an instance of StagedOrderUpdateSyncInfoActionBuilder
     * @return builder
     */
    public static StagedOrderUpdateSyncInfoActionBuilder of() {
        return new StagedOrderUpdateSyncInfoActionBuilder();
    }

    /**
     * create builder for StagedOrderUpdateSyncInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderUpdateSyncInfoActionBuilder of(final StagedOrderUpdateSyncInfoAction template) {
        StagedOrderUpdateSyncInfoActionBuilder builder = new StagedOrderUpdateSyncInfoActionBuilder();
        builder.externalId = template.getExternalId();
        builder.channel = template.getChannel();
        builder.syncedAt = template.getSyncedAt();
        return builder;
    }

}
