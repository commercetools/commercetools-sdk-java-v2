
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreDistributionChannelsChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreDistributionChannelsChangedMessagePayload storeDistributionChannelsChangedMessagePayload = StoreDistributionChannelsChangedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreDistributionChannelsChangedMessagePayloadBuilder
        implements Builder<StoreDistributionChannelsChangedMessagePayload> {

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelReference> addedDistributionChannels;

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelReference> removedDistributionChannels;

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     * @param addedDistributionChannels value to be set
     * @return Builder
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder addedDistributionChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelReference... addedDistributionChannels) {
        this.addedDistributionChannels = new ArrayList<>(Arrays.asList(addedDistributionChannels));
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     * @param addedDistributionChannels value to be set
     * @return Builder
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder addedDistributionChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelReference> addedDistributionChannels) {
        this.addedDistributionChannels = addedDistributionChannels;
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     * @param addedDistributionChannels value to be set
     * @return Builder
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder plusAddedDistributionChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelReference... addedDistributionChannels) {
        if (this.addedDistributionChannels == null) {
            this.addedDistributionChannels = new ArrayList<>();
        }
        this.addedDistributionChannels.addAll(Arrays.asList(addedDistributionChannels));
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     * @param builder function to build the addedDistributionChannels value
     * @return Builder
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder plusAddedDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.addedDistributionChannels == null) {
            this.addedDistributionChannels = new ArrayList<>();
        }
        this.addedDistributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     * @param builder function to build the addedDistributionChannels value
     * @return Builder
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder withAddedDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.addedDistributionChannels = new ArrayList<>();
        this.addedDistributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     * @param builder function to build the addedDistributionChannels value
     * @return Builder
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder addAddedDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return plusAddedDistributionChannels(
            builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     * @param builder function to build the addedDistributionChannels value
     * @return Builder
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder setAddedDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return addedDistributionChannels(
            builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     * @param removedDistributionChannels value to be set
     * @return Builder
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder removedDistributionChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelReference... removedDistributionChannels) {
        this.removedDistributionChannels = new ArrayList<>(Arrays.asList(removedDistributionChannels));
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     * @param removedDistributionChannels value to be set
     * @return Builder
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder removedDistributionChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelReference> removedDistributionChannels) {
        this.removedDistributionChannels = removedDistributionChannels;
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     * @param removedDistributionChannels value to be set
     * @return Builder
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder plusRemovedDistributionChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelReference... removedDistributionChannels) {
        if (this.removedDistributionChannels == null) {
            this.removedDistributionChannels = new ArrayList<>();
        }
        this.removedDistributionChannels.addAll(Arrays.asList(removedDistributionChannels));
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     * @param builder function to build the removedDistributionChannels value
     * @return Builder
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder plusRemovedDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.removedDistributionChannels == null) {
            this.removedDistributionChannels = new ArrayList<>();
        }
        this.removedDistributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     * @param builder function to build the removedDistributionChannels value
     * @return Builder
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder withRemovedDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.removedDistributionChannels = new ArrayList<>();
        this.removedDistributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     * @param builder function to build the removedDistributionChannels value
     * @return Builder
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder addRemovedDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return plusRemovedDistributionChannels(
            builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     * @param builder function to build the removedDistributionChannels value
     * @return Builder
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder setRemovedDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return removedDistributionChannels(
            builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     * @return addedDistributionChannels
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getAddedDistributionChannels() {
        return this.addedDistributionChannels;
    }

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     * @return removedDistributionChannels
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getRemovedDistributionChannels() {
        return this.removedDistributionChannels;
    }

    /**
     * builds StoreDistributionChannelsChangedMessagePayload with checking for non-null required values
     * @return StoreDistributionChannelsChangedMessagePayload
     */
    public StoreDistributionChannelsChangedMessagePayload build() {
        return new StoreDistributionChannelsChangedMessagePayloadImpl(addedDistributionChannels,
            removedDistributionChannels);
    }

    /**
     * builds StoreDistributionChannelsChangedMessagePayload without checking for non-null required values
     * @return StoreDistributionChannelsChangedMessagePayload
     */
    public StoreDistributionChannelsChangedMessagePayload buildUnchecked() {
        return new StoreDistributionChannelsChangedMessagePayloadImpl(addedDistributionChannels,
            removedDistributionChannels);
    }

    /**
     * factory method for an instance of StoreDistributionChannelsChangedMessagePayloadBuilder
     * @return builder
     */
    public static StoreDistributionChannelsChangedMessagePayloadBuilder of() {
        return new StoreDistributionChannelsChangedMessagePayloadBuilder();
    }

    /**
     * create builder for StoreDistributionChannelsChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreDistributionChannelsChangedMessagePayloadBuilder of(
            final StoreDistributionChannelsChangedMessagePayload template) {
        StoreDistributionChannelsChangedMessagePayloadBuilder builder = new StoreDistributionChannelsChangedMessagePayloadBuilder();
        builder.addedDistributionChannels = template.getAddedDistributionChannels();
        builder.removedDistributionChannels = template.getRemovedDistributionChannels();
        return builder;
    }

}
