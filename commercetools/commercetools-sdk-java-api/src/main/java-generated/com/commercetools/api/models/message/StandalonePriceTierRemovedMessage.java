
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceRemovePriceTierAction" rel="nofollow">Remove Price Tier</a> update action</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceTierRemovedMessage standalonePriceTierRemovedMessage = StandalonePriceTierRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .removedTier(removedTierBuilder -> removedTierBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceTierRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceTierRemovedMessageImpl.class)
public interface StandalonePriceTierRemovedMessage extends Message {

    /**
     * discriminator value for StandalonePriceTierRemovedMessage
     */
    String STANDALONE_PRICE_TIER_REMOVED = "StandalonePriceTierRemoved";

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">Price Tier</a> that has been removed from the array field <code>tiers</code> for the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @return removedTier
     */
    @NotNull
    @Valid
    @JsonProperty("removedTier")
    public PriceTier getRemovedTier();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">Price Tier</a> that has been removed from the array field <code>tiers</code> for the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @param removedTier value to be set
     */

    public void setRemovedTier(final PriceTier removedTier);

    /**
     * factory method
     * @return instance of StandalonePriceTierRemovedMessage
     */
    public static StandalonePriceTierRemovedMessage of() {
        return new StandalonePriceTierRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceTierRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceTierRemovedMessage of(final StandalonePriceTierRemovedMessage template) {
        StandalonePriceTierRemovedMessageImpl instance = new StandalonePriceTierRemovedMessageImpl();
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
        instance.setRemovedTier(template.getRemovedTier());
        return instance;
    }

    public StandalonePriceTierRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceTierRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceTierRemovedMessage deepCopy(
            @Nullable final StandalonePriceTierRemovedMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceTierRemovedMessageImpl instance = new StandalonePriceTierRemovedMessageImpl();
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
        instance.setRemovedTier(com.commercetools.api.models.common.PriceTier.deepCopy(template.getRemovedTier()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceTierRemovedMessage
     * @return builder
     */
    public static StandalonePriceTierRemovedMessageBuilder builder() {
        return StandalonePriceTierRemovedMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceTierRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceTierRemovedMessageBuilder builder(final StandalonePriceTierRemovedMessage template) {
        return StandalonePriceTierRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceTierRemovedMessage(Function<StandalonePriceTierRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceTierRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceTierRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceTierRemovedMessage>";
            }
        };
    }
}
