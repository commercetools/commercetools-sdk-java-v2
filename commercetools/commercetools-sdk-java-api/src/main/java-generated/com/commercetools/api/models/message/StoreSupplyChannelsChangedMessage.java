
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSupplyChannelsChangedMessageImpl.class)
public interface StoreSupplyChannelsChangedMessage extends Message {

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

    @JsonIgnore
    public void setAddedSupplyChannels(final ChannelReference... addedSupplyChannels);

    public void setAddedSupplyChannels(final List<ChannelReference> addedSupplyChannels);

    @JsonIgnore
    public void setRemovedSupplyChannels(final ChannelReference... removedSupplyChannels);

    public void setRemovedSupplyChannels(final List<ChannelReference> removedSupplyChannels);

    public static StoreSupplyChannelsChangedMessage of() {
        return new StoreSupplyChannelsChangedMessageImpl();
    }

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

    public static StoreSupplyChannelsChangedMessageBuilder builder() {
        return StoreSupplyChannelsChangedMessageBuilder.of();
    }

    public static StoreSupplyChannelsChangedMessageBuilder builder(final StoreSupplyChannelsChangedMessage template) {
        return StoreSupplyChannelsChangedMessageBuilder.of(template);
    }

    default <T> T withStoreSupplyChannelsChangedMessage(Function<StoreSupplyChannelsChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreSupplyChannelsChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSupplyChannelsChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSupplyChannelsChangedMessage>";
            }
        };
    }
}
