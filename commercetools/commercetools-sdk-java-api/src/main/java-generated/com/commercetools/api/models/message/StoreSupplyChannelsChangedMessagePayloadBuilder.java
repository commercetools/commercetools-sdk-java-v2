
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSupplyChannelsChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSupplyChannelsChangedMessagePayload storeSupplyChannelsChangedMessagePayload = StoreSupplyChannelsChangedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSupplyChannelsChangedMessagePayloadBuilder
        implements Builder<StoreSupplyChannelsChangedMessagePayload> {

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelReference> addedSupplyChannels;

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelReference> removedSupplyChannels;

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     */

    public StoreSupplyChannelsChangedMessagePayloadBuilder addedSupplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelReference... addedSupplyChannels) {
        this.addedSupplyChannels = new ArrayList<>(Arrays.asList(addedSupplyChannels));
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     */

    public StoreSupplyChannelsChangedMessagePayloadBuilder addedSupplyChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelReference> addedSupplyChannels) {
        this.addedSupplyChannels = addedSupplyChannels;
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     */

    public StoreSupplyChannelsChangedMessagePayloadBuilder plusAddedSupplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelReference... addedSupplyChannels) {
        if (this.addedSupplyChannels == null) {
            this.addedSupplyChannels = new ArrayList<>();
        }
        this.addedSupplyChannels.addAll(Arrays.asList(addedSupplyChannels));
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     */

    public StoreSupplyChannelsChangedMessagePayloadBuilder plusAddedSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.addedSupplyChannels == null) {
            this.addedSupplyChannels = new ArrayList<>();
        }
        this.addedSupplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     */

    public StoreSupplyChannelsChangedMessagePayloadBuilder withAddedSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.addedSupplyChannels = new ArrayList<>();
        this.addedSupplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     */

    public StoreSupplyChannelsChangedMessagePayloadBuilder removedSupplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelReference... removedSupplyChannels) {
        this.removedSupplyChannels = new ArrayList<>(Arrays.asList(removedSupplyChannels));
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     */

    public StoreSupplyChannelsChangedMessagePayloadBuilder removedSupplyChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelReference> removedSupplyChannels) {
        this.removedSupplyChannels = removedSupplyChannels;
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     */

    public StoreSupplyChannelsChangedMessagePayloadBuilder plusRemovedSupplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelReference... removedSupplyChannels) {
        if (this.removedSupplyChannels == null) {
            this.removedSupplyChannels = new ArrayList<>();
        }
        this.removedSupplyChannels.addAll(Arrays.asList(removedSupplyChannels));
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     */

    public StoreSupplyChannelsChangedMessagePayloadBuilder plusRemovedSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.removedSupplyChannels == null) {
            this.removedSupplyChannels = new ArrayList<>();
        }
        this.removedSupplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     */

    public StoreSupplyChannelsChangedMessagePayloadBuilder withRemovedSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.removedSupplyChannels = new ArrayList<>();
        this.removedSupplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getAddedSupplyChannels() {
        return this.addedSupplyChannels;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getRemovedSupplyChannels() {
        return this.removedSupplyChannels;
    }

    public StoreSupplyChannelsChangedMessagePayload build() {
        return new StoreSupplyChannelsChangedMessagePayloadImpl(addedSupplyChannels, removedSupplyChannels);
    }

    /**
     * builds StoreSupplyChannelsChangedMessagePayload without checking for non null required values
     */
    public StoreSupplyChannelsChangedMessagePayload buildUnchecked() {
        return new StoreSupplyChannelsChangedMessagePayloadImpl(addedSupplyChannels, removedSupplyChannels);
    }

    public static StoreSupplyChannelsChangedMessagePayloadBuilder of() {
        return new StoreSupplyChannelsChangedMessagePayloadBuilder();
    }

    public static StoreSupplyChannelsChangedMessagePayloadBuilder of(
            final StoreSupplyChannelsChangedMessagePayload template) {
        StoreSupplyChannelsChangedMessagePayloadBuilder builder = new StoreSupplyChannelsChangedMessagePayloadBuilder();
        builder.addedSupplyChannels = template.getAddedSupplyChannels();
        builder.removedSupplyChannels = template.getRemovedSupplyChannels();
        return builder;
    }

}
