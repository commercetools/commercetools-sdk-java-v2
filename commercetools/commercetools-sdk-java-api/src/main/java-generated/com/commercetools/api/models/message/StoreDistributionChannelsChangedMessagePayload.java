
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Distribution Channel, Remove Distribution Channel, or Set Distribution Channels update action.</p>
 *
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
@JsonDeserialize(as = StoreDistributionChannelsChangedMessagePayloadImpl.class)
public interface StoreDistributionChannelsChangedMessagePayload extends MessagePayload {

    String STORE_DISTRIBUTION_CHANNELS_CHANGED = "StoreDistributionChannelsChanged";

    /**
     *  <p>The product distribution channels that have been added.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("addedDistributionChannels")
    public List<ChannelReference> getAddedDistributionChannels();

    /**
     *  <p>The product distribution channels that have been removed.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("removedDistributionChannels")
    public List<ChannelReference> getRemovedDistributionChannels();

    @JsonIgnore
    public void setAddedDistributionChannels(final ChannelReference... addedDistributionChannels);

    public void setAddedDistributionChannels(final List<ChannelReference> addedDistributionChannels);

    @JsonIgnore
    public void setRemovedDistributionChannels(final ChannelReference... removedDistributionChannels);

    public void setRemovedDistributionChannels(final List<ChannelReference> removedDistributionChannels);

    public static StoreDistributionChannelsChangedMessagePayload of() {
        return new StoreDistributionChannelsChangedMessagePayloadImpl();
    }

    public static StoreDistributionChannelsChangedMessagePayload of(
            final StoreDistributionChannelsChangedMessagePayload template) {
        StoreDistributionChannelsChangedMessagePayloadImpl instance = new StoreDistributionChannelsChangedMessagePayloadImpl();
        instance.setAddedDistributionChannels(template.getAddedDistributionChannels());
        instance.setRemovedDistributionChannels(template.getRemovedDistributionChannels());
        return instance;
    }

    public static StoreDistributionChannelsChangedMessagePayloadBuilder builder() {
        return StoreDistributionChannelsChangedMessagePayloadBuilder.of();
    }

    public static StoreDistributionChannelsChangedMessagePayloadBuilder builder(
            final StoreDistributionChannelsChangedMessagePayload template) {
        return StoreDistributionChannelsChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withStoreDistributionChannelsChangedMessagePayload(
            Function<StoreDistributionChannelsChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreDistributionChannelsChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreDistributionChannelsChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreDistributionChannelsChangedMessagePayload>";
            }
        };
    }
}
