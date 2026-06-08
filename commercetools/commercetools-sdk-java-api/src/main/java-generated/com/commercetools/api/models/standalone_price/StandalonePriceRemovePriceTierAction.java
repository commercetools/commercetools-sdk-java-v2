
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
 *  <p>Removing a <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">PriceTier</a> from a <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceTierRemovedMessage" rel="nofollow">Standalone Price Tier Removed</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceRemovePriceTierAction standalonePriceRemovePriceTierAction = StandalonePriceRemovePriceTierAction.builder()
 *             .minimumQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removePriceTier")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceRemovePriceTierActionImpl.class)
public interface StandalonePriceRemovePriceTierAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceRemovePriceTierAction
     */
    String REMOVE_PRICE_TIER = "removePriceTier";

    /**
     *  <p>The <code>minimumQuantity</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">PriceTier</a> to be removed from the <code>tiers</code> field of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @return minimumQuantity
     */
    @NotNull
    @JsonProperty("minimumQuantity")
    public Long getMinimumQuantity();

    /**
     *  <p>The <code>minimumQuantity</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">PriceTier</a> to be removed from the <code>tiers</code> field of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @param minimumQuantity value to be set
     */

    public void setMinimumQuantity(final Long minimumQuantity);

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
        instance.setMinimumQuantity(template.getMinimumQuantity());
        return instance;
    }

    public StandalonePriceRemovePriceTierAction copyDeep();

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
        instance.setMinimumQuantity(template.getMinimumQuantity());
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
