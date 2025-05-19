
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
 *  <p>Generated after a successful Add Supply Channel, Remove Supply Channel, or Set Supply Channels update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSupplyChannelsChangedMessage storeSupplyChannelsChangedMessage = StoreSupplyChannelsChangedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("StoreSupplyChannelsChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSupplyChannelsChangedMessageImpl.class)
public interface StoreSupplyChannelsChangedMessage extends Message {

    /**
     * discriminator value for StoreSupplyChannelsChangedMessage
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
    public void setAddedSupplyChannels(final ChannelReference... addedSupplyChannels);

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
    public void setRemovedSupplyChannels(final ChannelReference... removedSupplyChannels);

    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @param removedSupplyChannels values to be set
     */

    public void setRemovedSupplyChannels(final List<ChannelReference> removedSupplyChannels);

    /**
     * factory method
     * @return instance of StoreSupplyChannelsChangedMessage
     */
    public static StoreSupplyChannelsChangedMessage of() {
        return new StoreSupplyChannelsChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy StoreSupplyChannelsChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSupplyChannelsChangedMessage of(final StoreSupplyChannelsChangedMessage template) {
        StoreSupplyChannelsChangedMessageImpl instance = new StoreSupplyChannelsChangedMessageImpl();
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
        instance.setAddedSupplyChannels(template.getAddedSupplyChannels());
        instance.setRemovedSupplyChannels(template.getRemovedSupplyChannels());
        return instance;
    }

    public StoreSupplyChannelsChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of StoreSupplyChannelsChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSupplyChannelsChangedMessage deepCopy(
            @Nullable final StoreSupplyChannelsChangedMessage template) {
        if (template == null) {
            return null;
        }
        StoreSupplyChannelsChangedMessageImpl instance = new StoreSupplyChannelsChangedMessageImpl();
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
        instance.setAddedSupplyChannels(Optional.ofNullable(template.getAddedSupplyChannels())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.channel.ChannelReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setRemovedSupplyChannels(Optional.ofNullable(template.getRemovedSupplyChannels())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.channel.ChannelReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreSupplyChannelsChangedMessage
     * @return builder
     */
    public static StoreSupplyChannelsChangedMessageBuilder builder() {
        return StoreSupplyChannelsChangedMessageBuilder.of();
    }

    /**
     * create builder for StoreSupplyChannelsChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSupplyChannelsChangedMessageBuilder builder(final StoreSupplyChannelsChangedMessage template) {
        return StoreSupplyChannelsChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSupplyChannelsChangedMessage(Function<StoreSupplyChannelsChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreSupplyChannelsChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSupplyChannelsChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSupplyChannelsChangedMessage>";
            }
        };
    }
}
