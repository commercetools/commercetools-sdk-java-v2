
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.PriceTier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Add Price Tier update action</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceTierAddedMessage standalonePriceTierAddedMessage = StandalonePriceTierAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .tier(tierBuilder -> tierBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceTierAddedMessageImpl.class)
public interface StandalonePriceTierAddedMessage extends Message {

    /**
     * discriminator value for StandalonePriceTierAddedMessage
     */
    String STANDALONE_PRICE_TIER_ADDED = "StandalonePriceTierAdded";

    /**
     *  <p>The Price Tier that has been added to the array field <code>tiers</code> for the StandalonePrice.</p>
     * @return tier
     */
    @NotNull
    @Valid
    @JsonProperty("tier")
    public PriceTier getTier();

    /**
     *  <p>The Price Tier that has been added to the array field <code>tiers</code> for the StandalonePrice.</p>
     * @param tier value to be set
     */

    public void setTier(final PriceTier tier);

    /**
     * factory method
     * @return instance of StandalonePriceTierAddedMessage
     */
    public static StandalonePriceTierAddedMessage of() {
        return new StandalonePriceTierAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceTierAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceTierAddedMessage of(final StandalonePriceTierAddedMessage template) {
        StandalonePriceTierAddedMessageImpl instance = new StandalonePriceTierAddedMessageImpl();
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
        instance.setTier(template.getTier());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceTierAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceTierAddedMessage deepCopy(@Nullable final StandalonePriceTierAddedMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceTierAddedMessageImpl instance = new StandalonePriceTierAddedMessageImpl();
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
        instance.setTier(com.commercetools.api.models.common.PriceTier.deepCopy(template.getTier()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceTierAddedMessage
     * @return builder
     */
    public static StandalonePriceTierAddedMessageBuilder builder() {
        return StandalonePriceTierAddedMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceTierAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceTierAddedMessageBuilder builder(final StandalonePriceTierAddedMessage template) {
        return StandalonePriceTierAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceTierAddedMessage(Function<StandalonePriceTierAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceTierAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceTierAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceTierAddedMessage>";
            }
        };
    }
}
