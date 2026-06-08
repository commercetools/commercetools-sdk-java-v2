
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.DiscountedPriceDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Discounts a Standalone Price of a Product Variant on a published <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>. If the Product Variant does not exist or if it exists only in the staged representation of a Product, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperationError</a> error is returned.</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceExternalDiscountSetMessage" rel="nofollow">StandalonePriceExternalDiscountSet</a> Message.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("setDiscountedPrice")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetDiscountedPriceActionImpl.class)
public interface StandalonePriceSetDiscountedPriceAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceSetDiscountedPriceAction
     */
    String SET_DISCOUNTED_PRICE = "setDiscountedPrice";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>The referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a> must be of type external, active, and its predicate must match the referenced Price.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPriceDraft getDiscounted();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>The referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a> must be of type external, active, and its predicate must match the referenced Price.</p>
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
     * factory method to create a shallow copy StandalonePriceSetDiscountedPriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetDiscountedPriceAction of(final StandalonePriceSetDiscountedPriceAction template) {
        StandalonePriceSetDiscountedPriceActionImpl instance = new StandalonePriceSetDiscountedPriceActionImpl();
        instance.setDiscounted(template.getDiscounted());
        return instance;
    }

    public StandalonePriceSetDiscountedPriceAction copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceSetDiscountedPriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetDiscountedPriceAction deepCopy(
            @Nullable final StandalonePriceSetDiscountedPriceAction template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetDiscountedPriceActionImpl instance = new StandalonePriceSetDiscountedPriceActionImpl();
        instance.setDiscounted(
            com.commercetools.api.models.common.DiscountedPriceDraft.deepCopy(template.getDiscounted()));
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
