package com.commercetools.api.models.message;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StoreSupplyChannelsChangedMessagePayloadBuilder implements Builder<StoreSupplyChannelsChangedMessagePayload> {

    
    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelReference> addedSupplyChannels;
    
    
    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelReference> removedSupplyChannels;

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @param addedSupplyChannels value to be set
     * @return Builder
     */
    
    public StoreSupplyChannelsChangedMessagePayloadBuilder addedSupplyChannels(@Nullable final com.commercetools.api.models.channel.ChannelReference ...addedSupplyChannels) {
        this.addedSupplyChannels = new ArrayList<>(Arrays.asList(addedSupplyChannels));
        return this;
    }
    
    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @param addedSupplyChannels value to be set
     * @return Builder
     */
    
    public StoreSupplyChannelsChangedMessagePayloadBuilder addedSupplyChannels(@Nullable final java.util.List<com.commercetools.api.models.channel.ChannelReference> addedSupplyChannels) {
        this.addedSupplyChannels = addedSupplyChannels;
        return this;
    }
    
    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @param addedSupplyChannels value to be set
     * @return Builder
     */
    
    public StoreSupplyChannelsChangedMessagePayloadBuilder plusAddedSupplyChannels(@Nullable final com.commercetools.api.models.channel.ChannelReference ...addedSupplyChannels) {
        if (this.addedSupplyChannels == null) {
            this.addedSupplyChannels = new ArrayList<>();
        }
        this.addedSupplyChannels.addAll(Arrays.asList(addedSupplyChannels));
        return this;
    }
    
    
    
    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @param builder function to build the addedSupplyChannels value
     * @return Builder
     */
    
    public StoreSupplyChannelsChangedMessagePayloadBuilder plusAddedSupplyChannels(Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.addedSupplyChannels == null) {
            this.addedSupplyChannels = new ArrayList<>();
        }
        this.addedSupplyChannels.add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @param builder function to build the addedSupplyChannels value
     * @return Builder
     */
    
    public StoreSupplyChannelsChangedMessagePayloadBuilder withAddedSupplyChannels(Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.addedSupplyChannels = new ArrayList<>();
        this.addedSupplyChannels.add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @param builder function to build the addedSupplyChannels value
     * @return Builder
     */
    
    public StoreSupplyChannelsChangedMessagePayloadBuilder addAddedSupplyChannels(Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return plusAddedSupplyChannels(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }
    
    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @param builder function to build the addedSupplyChannels value
     * @return Builder
     */
    
    public StoreSupplyChannelsChangedMessagePayloadBuilder setAddedSupplyChannels(Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return addedSupplyChannels(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }
                    
    
    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @param removedSupplyChannels value to be set
     * @return Builder
     */
    
    public StoreSupplyChannelsChangedMessagePayloadBuilder removedSupplyChannels(@Nullable final com.commercetools.api.models.channel.ChannelReference ...removedSupplyChannels) {
        this.removedSupplyChannels = new ArrayList<>(Arrays.asList(removedSupplyChannels));
        return this;
    }
    
    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @param removedSupplyChannels value to be set
     * @return Builder
     */
    
    public StoreSupplyChannelsChangedMessagePayloadBuilder removedSupplyChannels(@Nullable final java.util.List<com.commercetools.api.models.channel.ChannelReference> removedSupplyChannels) {
        this.removedSupplyChannels = removedSupplyChannels;
        return this;
    }
    
    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @param removedSupplyChannels value to be set
     * @return Builder
     */
    
    public StoreSupplyChannelsChangedMessagePayloadBuilder plusRemovedSupplyChannels(@Nullable final com.commercetools.api.models.channel.ChannelReference ...removedSupplyChannels) {
        if (this.removedSupplyChannels == null) {
            this.removedSupplyChannels = new ArrayList<>();
        }
        this.removedSupplyChannels.addAll(Arrays.asList(removedSupplyChannels));
        return this;
    }
    
    
    
    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @param builder function to build the removedSupplyChannels value
     * @return Builder
     */
    
    public StoreSupplyChannelsChangedMessagePayloadBuilder plusRemovedSupplyChannels(Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.removedSupplyChannels == null) {
            this.removedSupplyChannels = new ArrayList<>();
        }
        this.removedSupplyChannels.add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @param builder function to build the removedSupplyChannels value
     * @return Builder
     */
    
    public StoreSupplyChannelsChangedMessagePayloadBuilder withRemovedSupplyChannels(Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.removedSupplyChannels = new ArrayList<>();
        this.removedSupplyChannels.add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @param builder function to build the removedSupplyChannels value
     * @return Builder
     */
    
    public StoreSupplyChannelsChangedMessagePayloadBuilder addRemovedSupplyChannels(Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return plusRemovedSupplyChannels(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }
    
    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @param builder function to build the removedSupplyChannels value
     * @return Builder
     */
    
    public StoreSupplyChannelsChangedMessagePayloadBuilder setRemovedSupplyChannels(Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        return removedSupplyChannels(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()));
    }
                    

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @return addedSupplyChannels
     */
    
    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getAddedSupplyChannels(){
        return this.addedSupplyChannels;
    }
    
    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @return removedSupplyChannels
     */
    
    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getRemovedSupplyChannels(){
        return this.removedSupplyChannels;
    }

    /**
     * builds StoreSupplyChannelsChangedMessagePayload with checking for non-null required values
     * @return StoreSupplyChannelsChangedMessagePayload
     */
    public StoreSupplyChannelsChangedMessagePayload build() {
        return new StoreSupplyChannelsChangedMessagePayloadImpl(addedSupplyChannels, removedSupplyChannels);
    }
    
    /**
     * builds StoreSupplyChannelsChangedMessagePayload without checking for non-null required values
     * @return StoreSupplyChannelsChangedMessagePayload
     */
    public StoreSupplyChannelsChangedMessagePayload buildUnchecked() {
        return new StoreSupplyChannelsChangedMessagePayloadImpl(addedSupplyChannels, removedSupplyChannels);
    }

    /**
     * factory method for an instance of StoreSupplyChannelsChangedMessagePayloadBuilder
     * @return builder 
     */
    public static StoreSupplyChannelsChangedMessagePayloadBuilder of() {
        return new StoreSupplyChannelsChangedMessagePayloadBuilder();
    }

    /**
     * create builder for StoreSupplyChannelsChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSupplyChannelsChangedMessagePayloadBuilder of(final StoreSupplyChannelsChangedMessagePayload template) {
        StoreSupplyChannelsChangedMessagePayloadBuilder builder = new StoreSupplyChannelsChangedMessagePayloadBuilder();
        builder.addedSupplyChannels = template.getAddedSupplyChannels();
        builder.removedSupplyChannels = template.getRemovedSupplyChannels();
        return builder;
    }

}
