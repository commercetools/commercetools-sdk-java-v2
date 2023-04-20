
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

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
 *             .externalId("{externalId}")
 *             .syncedAt("{syncedAt}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SyncInfoBuilder implements Builder<SyncInfo> {

    private com.commercetools.history.models.common.Reference channel;

    private String externalId;

    private String syncedAt;

    /**
     * set the value to the channel using the builder function
     * @param builder function to build the channel value
     * @return Builder
     */

    public SyncInfoBuilder channel(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the channel using the builder function
     * @param builder function to build the channel value
     * @return Builder
     */

    public SyncInfoBuilder withChannel(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.channel = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }

    /**
     * set the value to the channel
     * @param channel value to be set
     * @return Builder
     */

    public SyncInfoBuilder channel(final com.commercetools.history.models.common.Reference channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Can be used to reference an external order instance, file etc.</p>
     * @param externalId value to be set
     * @return Builder
     */

    public SyncInfoBuilder externalId(final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * set the value to the syncedAt
     * @param syncedAt value to be set
     * @return Builder
     */

    public SyncInfoBuilder syncedAt(final String syncedAt) {
        this.syncedAt = syncedAt;
        return this;
    }

    /**
     * value of channel}
     * @return channel
     */

    public com.commercetools.history.models.common.Reference getChannel() {
        return this.channel;
    }

    /**
     *  <p>Can be used to reference an external order instance, file etc.</p>
     * @return externalId
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * value of syncedAt}
     * @return syncedAt
     */

    public String getSyncedAt() {
        return this.syncedAt;
    }

    /**
     * builds SyncInfo with checking for non-null required values
     * @return SyncInfo
     */
    public SyncInfo build() {
        Objects.requireNonNull(channel, SyncInfo.class + ": channel is missing");
        Objects.requireNonNull(externalId, SyncInfo.class + ": externalId is missing");
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
