package com.commercetools.api.models.message;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Generated after a successful Add Supply Channel, Remove Supply Channel, or Set Supply Channels update action.</p>
 *
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
@JsonDeserialize(as = StoreSupplyChannelsChangedMessagePayloadImpl.class)
public interface StoreSupplyChannelsChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreSupplyChannelsChangedMessagePayload
     */
    String STORE_SUPPLY_CHANNELS_CHANGED = "StoreSupplyChannelsChanged";

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @return addedSupplyChannels
     */
    @Valid
    @JsonProperty("addedSupplyChannels")
    public List<ChannelReference> getAddedSupplyChannels();
    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @return removedSupplyChannels
     */
    @Valid
    @JsonProperty("removedSupplyChannels")
    public List<ChannelReference> getRemovedSupplyChannels();

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @param addedSupplyChannels values to be set
     */
    
    @JsonIgnore
    public void setAddedSupplyChannels(final ChannelReference ...addedSupplyChannels);
    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @param addedSupplyChannels values to be set
     */
    
    public void setAddedSupplyChannels(final List<ChannelReference> addedSupplyChannels);
    
    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @param removedSupplyChannels values to be set
     */
    
    @JsonIgnore
    public void setRemovedSupplyChannels(final ChannelReference ...removedSupplyChannels);
    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @param removedSupplyChannels values to be set
     */
    
    public void setRemovedSupplyChannels(final List<ChannelReference> removedSupplyChannels);

    /**
     * factory method
     * @return instance of StoreSupplyChannelsChangedMessagePayload
     */
    public static StoreSupplyChannelsChangedMessagePayload of(){
        return new StoreSupplyChannelsChangedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy StoreSupplyChannelsChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSupplyChannelsChangedMessagePayload of(final StoreSupplyChannelsChangedMessagePayload template) {
        StoreSupplyChannelsChangedMessagePayloadImpl instance = new StoreSupplyChannelsChangedMessagePayloadImpl();
        instance.setAddedSupplyChannels(template.getAddedSupplyChannels());
        instance.setRemovedSupplyChannels(template.getRemovedSupplyChannels());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreSupplyChannelsChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSupplyChannelsChangedMessagePayload deepCopy(@Nullable final StoreSupplyChannelsChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreSupplyChannelsChangedMessagePayloadImpl instance = new StoreSupplyChannelsChangedMessagePayloadImpl();
        instance.setAddedSupplyChannels(Optional.ofNullable(template.getAddedSupplyChannels())
                .map(t -> t.stream().map(com.commercetools.api.models.channel.ChannelReference::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setRemovedSupplyChannels(Optional.ofNullable(template.getRemovedSupplyChannels())
                .map(t -> t.stream().map(com.commercetools.api.models.channel.ChannelReference::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreSupplyChannelsChangedMessagePayload
     * @return builder
     */
    public static StoreSupplyChannelsChangedMessagePayloadBuilder builder() {
        return StoreSupplyChannelsChangedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for StoreSupplyChannelsChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSupplyChannelsChangedMessagePayloadBuilder builder(final StoreSupplyChannelsChangedMessagePayload template) {
        return StoreSupplyChannelsChangedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSupplyChannelsChangedMessagePayload(Function<StoreSupplyChannelsChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreSupplyChannelsChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSupplyChannelsChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSupplyChannelsChangedMessagePayload>";
            }
        };
    }
}
