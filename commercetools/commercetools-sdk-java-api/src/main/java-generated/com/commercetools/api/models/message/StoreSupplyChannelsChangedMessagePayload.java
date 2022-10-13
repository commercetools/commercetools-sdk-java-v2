
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.channel.ChannelReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSupplyChannelsChangedMessagePayloadImpl.class)
public interface StoreSupplyChannelsChangedMessagePayload extends MessagePayload {

    String STORE_SUPPLY_CHANNELS_CHANGED = "StoreSupplyChannelsChanged";

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     */
    @Valid
    @JsonProperty("addedSupplyChannels")
    public List<ChannelReference> getAddedSupplyChannels();

    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     */
    @Valid
    @JsonProperty("removedSupplyChannels")
    public List<ChannelReference> getRemovedSupplyChannels();

    @JsonIgnore
    public void setAddedSupplyChannels(final ChannelReference... addedSupplyChannels);

    public void setAddedSupplyChannels(final List<ChannelReference> addedSupplyChannels);

    @JsonIgnore
    public void setRemovedSupplyChannels(final ChannelReference... removedSupplyChannels);

    public void setRemovedSupplyChannels(final List<ChannelReference> removedSupplyChannels);

    public static StoreSupplyChannelsChangedMessagePayload of() {
        return new StoreSupplyChannelsChangedMessagePayloadImpl();
    }

    public static StoreSupplyChannelsChangedMessagePayload of(final StoreSupplyChannelsChangedMessagePayload template) {
        StoreSupplyChannelsChangedMessagePayloadImpl instance = new StoreSupplyChannelsChangedMessagePayloadImpl();
        instance.setAddedSupplyChannels(template.getAddedSupplyChannels());
        instance.setRemovedSupplyChannels(template.getRemovedSupplyChannels());
        return instance;
    }

    public static StoreSupplyChannelsChangedMessagePayloadBuilder builder() {
        return StoreSupplyChannelsChangedMessagePayloadBuilder.of();
    }

    public static StoreSupplyChannelsChangedMessagePayloadBuilder builder(
            final StoreSupplyChannelsChangedMessagePayload template) {
        return StoreSupplyChannelsChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withStoreSupplyChannelsChangedMessagePayload(
            Function<StoreSupplyChannelsChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreSupplyChannelsChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSupplyChannelsChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSupplyChannelsChangedMessagePayload>";
            }
        };
    }
}
