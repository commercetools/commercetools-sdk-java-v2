
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
 *     StandalonePriceTierAddedMessagePayload standalonePriceTierAddedMessagePayload = StandalonePriceTierAddedMessagePayload.builder()
 *             .tier(tierBuilder -> tierBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceTierAddedMessagePayloadImpl.class)
public interface StandalonePriceTierAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StandalonePriceTierAddedMessagePayload
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
     * @return instance of StandalonePriceTierAddedMessagePayload
     */
    public static StandalonePriceTierAddedMessagePayload of() {
        return new StandalonePriceTierAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceTierAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceTierAddedMessagePayload of(final StandalonePriceTierAddedMessagePayload template) {
        StandalonePriceTierAddedMessagePayloadImpl instance = new StandalonePriceTierAddedMessagePayloadImpl();
        instance.setTier(template.getTier());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceTierAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceTierAddedMessagePayload deepCopy(
            @Nullable final StandalonePriceTierAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        StandalonePriceTierAddedMessagePayloadImpl instance = new StandalonePriceTierAddedMessagePayloadImpl();
        instance.setTier(com.commercetools.api.models.common.PriceTier.deepCopy(template.getTier()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceTierAddedMessagePayload
     * @return builder
     */
    public static StandalonePriceTierAddedMessagePayloadBuilder builder() {
        return StandalonePriceTierAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for StandalonePriceTierAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceTierAddedMessagePayloadBuilder builder(
            final StandalonePriceTierAddedMessagePayload template) {
        return StandalonePriceTierAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceTierAddedMessagePayload(
            Function<StandalonePriceTierAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceTierAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceTierAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceTierAddedMessagePayload>";
            }
        };
    }
}
