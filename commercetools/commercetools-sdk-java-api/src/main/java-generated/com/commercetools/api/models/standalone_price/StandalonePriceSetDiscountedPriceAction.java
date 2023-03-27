
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.DiscountedPriceDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Discounts a Standalone Price. The referenced ProductDiscount in the discounted field must be of type external, active, and its predicate must match the referenced Price. Produces the StandalonePriceExternalDiscountSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetDiscountedPriceAction standalonePriceSetDiscountedPriceAction = StandalonePriceSetDiscountedPriceAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetDiscountedPriceActionImpl.class)
public interface StandalonePriceSetDiscountedPriceAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceSetDiscountedPriceAction
     */
    String SET_DISCOUNTED_PRICE = "setDiscountedPrice";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPriceDraft getDiscounted();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPriceDraft discounted);

    /**
     * factory method
     * @return instance of StandalonePriceSetDiscountedPriceAction
     */
    public static StandalonePriceSetDiscountedPriceAction of() {
        return new StandalonePriceSetDiscountedPriceActionImpl();
    }

    /**
     * factory method to copy an instance of StandalonePriceSetDiscountedPriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetDiscountedPriceAction of(final StandalonePriceSetDiscountedPriceAction template) {
        StandalonePriceSetDiscountedPriceActionImpl instance = new StandalonePriceSetDiscountedPriceActionImpl();
        instance.setDiscounted(template.getDiscounted());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetDiscountedPriceAction
     * @return builder
     */
    public static StandalonePriceSetDiscountedPriceActionBuilder builder() {
        return StandalonePriceSetDiscountedPriceActionBuilder.of();
    }

    /**
     * create builder for StandalonePriceSetDiscountedPriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetDiscountedPriceActionBuilder builder(
            final StandalonePriceSetDiscountedPriceAction template) {
        return StandalonePriceSetDiscountedPriceActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetDiscountedPriceAction(
            Function<StandalonePriceSetDiscountedPriceAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetDiscountedPriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetDiscountedPriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetDiscountedPriceAction>";
            }
        };
    }
}
