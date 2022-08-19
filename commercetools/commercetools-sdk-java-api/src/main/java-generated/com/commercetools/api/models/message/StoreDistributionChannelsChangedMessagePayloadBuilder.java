
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreDistributionChannelsChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreDistributionChannelsChangedMessagePayload storeDistributionChannelsChangedMessagePayload = StoreDistributionChannelsChangedMessagePayload.builder()
 *             .plusAddedDistributionChannels(addedDistributionChannelsBuilder -> addedDistributionChannelsBuilder)
 *             .plusRemovedDistributionChannels(removedDistributionChannelsBuilder -> removedDistributionChannelsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreDistributionChannelsChangedMessagePayloadBuilder
        implements Builder<StoreDistributionChannelsChangedMessagePayload> {

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> addedDistributionChannels;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> removedDistributionChannels;

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder addedDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... addedDistributionChannels) {
        this.addedDistributionChannels = new ArrayList<>(Arrays.asList(addedDistributionChannels));
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder addedDistributionChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> addedDistributionChannels) {
        this.addedDistributionChannels = addedDistributionChannels;
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder plusAddedDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... addedDistributionChannels) {
        if (this.addedDistributionChannels == null) {
            this.addedDistributionChannels = new ArrayList<>();
        }
        this.addedDistributionChannels.addAll(Arrays.asList(addedDistributionChannels));
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
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
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder withAddedDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.addedDistributionChannels = new ArrayList<>();
        this.addedDistributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder removedDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... removedDistributionChannels) {
        this.removedDistributionChannels = new ArrayList<>(Arrays.asList(removedDistributionChannels));
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder removedDistributionChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> removedDistributionChannels) {
        this.removedDistributionChannels = removedDistributionChannels;
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder plusRemovedDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... removedDistributionChannels) {
        if (this.removedDistributionChannels == null) {
            this.removedDistributionChannels = new ArrayList<>();
        }
        this.removedDistributionChannels.addAll(Arrays.asList(removedDistributionChannels));
        return this;
    }

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
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
     */

    public StoreDistributionChannelsChangedMessagePayloadBuilder withRemovedDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.removedDistributionChannels = new ArrayList<>();
        this.removedDistributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getAddedDistributionChannels() {
        return this.addedDistributionChannels;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getRemovedDistributionChannels() {
        return this.removedDistributionChannels;
    }

    public StoreDistributionChannelsChangedMessagePayload build() {
        Objects.requireNonNull(addedDistributionChannels,
            StoreDistributionChannelsChangedMessagePayload.class + ": addedDistributionChannels is missing");
        Objects.requireNonNull(removedDistributionChannels,
            StoreDistributionChannelsChangedMessagePayload.class + ": removedDistributionChannels is missing");
        return new StoreDistributionChannelsChangedMessagePayloadImpl(addedDistributionChannels,
            removedDistributionChannels);
    }

    /**
     * builds StoreDistributionChannelsChangedMessagePayload without checking for non null required values
     */
    public StoreDistributionChannelsChangedMessagePayload buildUnchecked() {
        return new StoreDistributionChannelsChangedMessagePayloadImpl(addedDistributionChannels,
            removedDistributionChannels);
    }

    public static StoreDistributionChannelsChangedMessagePayloadBuilder of() {
        return new StoreDistributionChannelsChangedMessagePayloadBuilder();
    }

    public static StoreDistributionChannelsChangedMessagePayloadBuilder of(
            final StoreDistributionChannelsChangedMessagePayload template) {
        StoreDistributionChannelsChangedMessagePayloadBuilder builder = new StoreDistributionChannelsChangedMessagePayloadBuilder();
        builder.addedDistributionChannels = template.getAddedDistributionChannels();
        builder.removedDistributionChannels = template.getRemovedDistributionChannels();
        return builder;
    }

}
