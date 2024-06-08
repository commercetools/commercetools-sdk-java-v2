
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.PriceTierDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adding a PriceTier to a StandalonePrice produces the Standalone Price Tier Added Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceAddPriceTierAction standalonePriceAddPriceTierAction = StandalonePriceAddPriceTierAction.builder()
 *             .tier(tierBuilder -> tierBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceAddPriceTierActionImpl.class)
public interface StandalonePriceAddPriceTierAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceAddPriceTierAction
     */
    String ADD_PRICE_TIER = "addPriceTier";

    /**
     *  <p>The PriceTier to be added to the <code>tiers</code> field of the StandalonePrice. The action returns an InvalidField error in the following cases:</p>
     *  <ul>
     *   <li>Trying to add a PriceTier with <code>minimumQuantity</code> &lt; <code>2</code>.</li>
     *   <li>Trying to add a PriceTier with <code>minimumQuantity</code> that already exists for the StandalonePrice.</li>
     *  </ul>
     * @return tier
     */
    @NotNull
    @Valid
    @JsonProperty("tier")
    public PriceTierDraft getTier();

    /**
     *  <p>The PriceTier to be added to the <code>tiers</code> field of the StandalonePrice. The action returns an InvalidField error in the following cases:</p>
     *  <ul>
     *   <li>Trying to add a PriceTier with <code>minimumQuantity</code> &lt; <code>2</code>.</li>
     *   <li>Trying to add a PriceTier with <code>minimumQuantity</code> that already exists for the StandalonePrice.</li>
     *  </ul>
     * @param tier value to be set
     */

    public void setTier(final PriceTierDraft tier);

    /**
     * factory method
     * @return instance of StandalonePriceAddPriceTierAction
     */
    public static StandalonePriceAddPriceTierAction of() {
        return new StandalonePriceAddPriceTierActionImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceAddPriceTierAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceAddPriceTierAction of(final StandalonePriceAddPriceTierAction template) {
        StandalonePriceAddPriceTierActionImpl instance = new StandalonePriceAddPriceTierActionImpl();
        instance.setTier(template.getTier());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceAddPriceTierAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceAddPriceTierAction deepCopy(
            @Nullable final StandalonePriceAddPriceTierAction template) {
        if (template == null) {
            return null;
        }
        StandalonePriceAddPriceTierActionImpl instance = new StandalonePriceAddPriceTierActionImpl();
        instance.setTier(com.commercetools.api.models.common.PriceTierDraft.deepCopy(template.getTier()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceAddPriceTierAction
     * @return builder
     */
    public static StandalonePriceAddPriceTierActionBuilder builder() {
        return StandalonePriceAddPriceTierActionBuilder.of();
    }

    /**
     * create builder for StandalonePriceAddPriceTierAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceAddPriceTierActionBuilder builder(final StandalonePriceAddPriceTierAction template) {
        return StandalonePriceAddPriceTierActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceAddPriceTierAction(Function<StandalonePriceAddPriceTierAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceAddPriceTierAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceAddPriceTierAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceAddPriceTierAction>";
            }
        };
    }
}
