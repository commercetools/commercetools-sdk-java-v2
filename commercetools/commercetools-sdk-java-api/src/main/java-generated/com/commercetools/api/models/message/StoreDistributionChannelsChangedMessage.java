
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

    @JsonIgnore
    public void setAddedDistributionChannels(final ChannelReference... addedDistributionChannels);

    public void setAddedDistributionChannels(final List<ChannelReference> addedDistributionChannels);

    @JsonIgnore
    public void setRemovedDistributionChannels(final ChannelReference... removedDistributionChannels);

    public void setRemovedDistributionChannels(final List<ChannelReference> removedDistributionChannels);

    public static StoreDistributionChannelsChangedMessage of() {
        return new StoreDistributionChannelsChangedMessageImpl();
    }

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

    public static StoreDistributionChannelsChangedMessageBuilder builder() {
        return StoreDistributionChannelsChangedMessageBuilder.of();
    }

    public static StoreDistributionChannelsChangedMessageBuilder builder(
            final StoreDistributionChannelsChangedMessage template) {
        return StoreDistributionChannelsChangedMessageBuilder.of(template);
    }

    default <T> T withStoreDistributionChannelsChangedMessage(
            Function<StoreDistributionChannelsChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreDistributionChannelsChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreDistributionChannelsChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreDistributionChannelsChangedMessage>";
            }
        };
    }
}
