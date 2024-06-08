
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a successful Add Distribution Channel, Remove Distribution Channel, or Set Distribution Channels update action.</p>
 *
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
@JsonDeserialize(as = StoreDistributionChannelsChangedMessagePayloadImpl.class)
public interface StoreDistributionChannelsChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreDistributionChannelsChangedMessagePayload
     */
    String STORE_DISTRIBUTION_CHANNELS_CHANGED = "StoreDistributionChannelsChanged";

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     * @return addedDistributionChannels
     */
    @Valid
    @JsonProperty("addedDistributionChannels")
    public List<ChannelReference> getAddedDistributionChannels();

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     * @return removedDistributionChannels
     */
    @Valid
    @JsonProperty("removedDistributionChannels")
    public List<ChannelReference> getRemovedDistributionChannels();

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     * @param addedDistributionChannels values to be set
     */

    @JsonIgnore
    public void setAddedDistributionChannels(final ChannelReference... addedDistributionChannels);

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     * @param addedDistributionChannels values to be set
     */

    public void setAddedDistributionChannels(final List<ChannelReference> addedDistributionChannels);

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     * @param removedDistributionChannels values to be set
     */

    @JsonIgnore
    public void setRemovedDistributionChannels(final ChannelReference... removedDistributionChannels);

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     * @param removedDistributionChannels values to be set
     */

    public void setRemovedDistributionChannels(final List<ChannelReference> removedDistributionChannels);

    /**
     * factory method
     * @return instance of StoreDistributionChannelsChangedMessagePayload
     */
    public static StoreDistributionChannelsChangedMessagePayload of() {
        return new StoreDistributionChannelsChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StoreDistributionChannelsChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreDistributionChannelsChangedMessagePayload of(
            final StoreDistributionChannelsChangedMessagePayload template) {
        StoreDistributionChannelsChangedMessagePayloadImpl instance = new StoreDistributionChannelsChangedMessagePayloadImpl();
        instance.setAddedDistributionChannels(template.getAddedDistributionChannels());
        instance.setRemovedDistributionChannels(template.getRemovedDistributionChannels());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreDistributionChannelsChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreDistributionChannelsChangedMessagePayload deepCopy(
            @Nullable final StoreDistributionChannelsChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreDistributionChannelsChangedMessagePayloadImpl instance = new StoreDistributionChannelsChangedMessagePayloadImpl();
        instance.setAddedDistributionChannels(Optional.ofNullable(template.getAddedDistributionChannels())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.channel.ChannelReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setRemovedDistributionChannels(Optional.ofNullable(template.getRemovedDistributionChannels())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.channel.ChannelReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreDistributionChannelsChangedMessagePayload
     * @return builder
     */
    public static StoreDistributionChannelsChangedMessagePayloadBuilder builder() {
        return StoreDistributionChannelsChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for StoreDistributionChannelsChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreDistributionChannelsChangedMessagePayloadBuilder builder(
            final StoreDistributionChannelsChangedMessagePayload template) {
        return StoreDistributionChannelsChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreDistributionChannelsChangedMessagePayload(
            Function<StoreDistributionChannelsChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreDistributionChannelsChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreDistributionChannelsChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreDistributionChannelsChangedMessagePayload>";
            }
        };
    }
}
