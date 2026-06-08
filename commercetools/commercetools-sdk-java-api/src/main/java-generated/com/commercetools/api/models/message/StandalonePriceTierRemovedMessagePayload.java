
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
 *     StandalonePriceTierRemovedMessagePayload standalonePriceTierRemovedMessagePayload = StandalonePriceTierRemovedMessagePayload.builder()
 *             .removedTier(removedTierBuilder -> removedTierBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceTierRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceTierRemovedMessagePayloadImpl.class)
public interface StandalonePriceTierRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StandalonePriceTierRemovedMessagePayload
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
     * @return instance of StandalonePriceTierRemovedMessagePayload
     */
    public static StandalonePriceTierRemovedMessagePayload of() {
        return new StandalonePriceTierRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceTierRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceTierRemovedMessagePayload of(final StandalonePriceTierRemovedMessagePayload template) {
        StandalonePriceTierRemovedMessagePayloadImpl instance = new StandalonePriceTierRemovedMessagePayloadImpl();
        instance.setRemovedTier(template.getRemovedTier());
        return instance;
    }

    public StandalonePriceTierRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceTierRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceTierRemovedMessagePayload deepCopy(
            @Nullable final StandalonePriceTierRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        StandalonePriceTierRemovedMessagePayloadImpl instance = new StandalonePriceTierRemovedMessagePayloadImpl();
        instance.setRemovedTier(com.commercetools.api.models.common.PriceTier.deepCopy(template.getRemovedTier()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceTierRemovedMessagePayload
     * @return builder
     */
    public static StandalonePriceTierRemovedMessagePayloadBuilder builder() {
        return StandalonePriceTierRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for StandalonePriceTierRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceTierRemovedMessagePayloadBuilder builder(
            final StandalonePriceTierRemovedMessagePayload template) {
        return StandalonePriceTierRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceTierRemovedMessagePayload(
            Function<StandalonePriceTierRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceTierRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceTierRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceTierRemovedMessagePayload>";
            }
        };
    }
}
