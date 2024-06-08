
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Removing a PriceTier from a StandalonePrice produces the Standalone Price Tier Removed Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceRemovePriceTierAction standalonePriceRemovePriceTierAction = StandalonePriceRemovePriceTierAction.builder()
 *             .tierMinimumQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceRemovePriceTierActionImpl.class)
public interface StandalonePriceRemovePriceTierAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceRemovePriceTierAction
     */
    String REMOVE_PRICE_TIER = "removePriceTier";

    /**
     *  <p>The <code>minimumQuantity</code> of the PriceTier to be removed from the <code>tiers</code> field of the StandalonePrice.</p>
     * @return tierMinimumQuantity
     */
    @NotNull
    @JsonProperty("tierMinimumQuantity")
    public Long getTierMinimumQuantity();

    /**
     *  <p>The <code>minimumQuantity</code> of the PriceTier to be removed from the <code>tiers</code> field of the StandalonePrice.</p>
     * @param tierMinimumQuantity value to be set
     */

    public void setTierMinimumQuantity(final Long tierMinimumQuantity);

    /**
     * factory method
     * @return instance of StandalonePriceRemovePriceTierAction
     */
    public static StandalonePriceRemovePriceTierAction of() {
        return new StandalonePriceRemovePriceTierActionImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceRemovePriceTierAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceRemovePriceTierAction of(final StandalonePriceRemovePriceTierAction template) {
        StandalonePriceRemovePriceTierActionImpl instance = new StandalonePriceRemovePriceTierActionImpl();
        instance.setTierMinimumQuantity(template.getTierMinimumQuantity());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceRemovePriceTierAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceRemovePriceTierAction deepCopy(
            @Nullable final StandalonePriceRemovePriceTierAction template) {
        if (template == null) {
            return null;
        }
        StandalonePriceRemovePriceTierActionImpl instance = new StandalonePriceRemovePriceTierActionImpl();
        instance.setTierMinimumQuantity(template.getTierMinimumQuantity());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceRemovePriceTierAction
     * @return builder
     */
    public static StandalonePriceRemovePriceTierActionBuilder builder() {
        return StandalonePriceRemovePriceTierActionBuilder.of();
    }

    /**
     * create builder for StandalonePriceRemovePriceTierAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceRemovePriceTierActionBuilder builder(
            final StandalonePriceRemovePriceTierAction template) {
        return StandalonePriceRemovePriceTierActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceRemovePriceTierAction(Function<StandalonePriceRemovePriceTierAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceRemovePriceTierAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceRemovePriceTierAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceRemovePriceTierAction>";
            }
        };
    }
}
