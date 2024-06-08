
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
 *     StoreDistributionChannelsChangedMessage storeDistributionChannelsChangedMessage = StoreDistributionChannelsChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreDistributionChannelsChangedMessageImpl.class)
public interface StoreDistributionChannelsChangedMessage extends Message {

    /**
     * discriminator value for StoreDistributionChannelsChangedMessage
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
     * @return instance of StoreDistributionChannelsChangedMessage
     */
    public static StoreDistributionChannelsChangedMessage of() {
        return new StoreDistributionChannelsChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy StoreDistributionChannelsChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreDistributionChannelsChangedMessage of(final StoreDistributionChannelsChangedMessage template) {
        StoreDistributionChannelsChangedMessageImpl instance = new StoreDistributionChannelsChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setAddedDistributionChannels(template.getAddedDistributionChannels());
        instance.setRemovedDistributionChannels(template.getRemovedDistributionChannels());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreDistributionChannelsChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreDistributionChannelsChangedMessage deepCopy(
            @Nullable final StoreDistributionChannelsChangedMessage template) {
        if (template == null) {
            return null;
        }
        StoreDistributionChannelsChangedMessageImpl instance = new StoreDistributionChannelsChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
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
     * builder factory method for StoreDistributionChannelsChangedMessage
     * @return builder
     */
    public static StoreDistributionChannelsChangedMessageBuilder builder() {
        return StoreDistributionChannelsChangedMessageBuilder.of();
    }

    /**
     * create builder for StoreDistributionChannelsChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreDistributionChannelsChangedMessageBuilder builder(
            final StoreDistributionChannelsChangedMessage template) {
        return StoreDistributionChannelsChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreDistributionChannelsChangedMessage(
            Function<StoreDistributionChannelsChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreDistributionChannelsChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreDistributionChannelsChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreDistributionChannelsChangedMessage>";
            }
        };
    }
}
