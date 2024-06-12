
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The ShippingRate maps to an abstract Cart categorization expressed by integers (such as shipping scores or weight ranges). Either <code>price</code> or <code>priceFunction</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartScoreTier cartScoreTier = CartScoreTier.builder()
 *             .score(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartScoreTierImpl.class)
public interface CartScoreTier extends ShippingRatePriceTier {

    /**
     * discriminator value for CartScoreTier
     */
    String CART_SCORE = "CartScore";

    /**
     *  <p>Abstract value for categorizing a Cart. The range starts at <code>0</code>. The default price covers <code>0</code>, tiers start at <code>1</code>. See Tiered shipping rates for details and examples.</p>
     * @return score
     */
    @NotNull
    @JsonProperty("score")
    public Integer getScore();

    /**
     *  <p>Defines a fixed price for the <code>score</code>.</p>
     * @return price
     */
    @Valid
    @JsonProperty("price")
    public Money getPrice();

    /**
     *  <p>Dynamically calculates a Price for a range of scores.</p>
     * @return priceFunction
     */
    @Valid
    @JsonProperty("priceFunction")
    public PriceFunction getPriceFunction();

    /**
     *  <p>Appears in response to Get ShippingMethods for a Cart if the shipping rate matches the search query.</p>
     * @return isMatching
     */

    @JsonProperty("isMatching")
    public Boolean getIsMatching();

    /**
     *  <p>Abstract value for categorizing a Cart. The range starts at <code>0</code>. The default price covers <code>0</code>, tiers start at <code>1</code>. See Tiered shipping rates for details and examples.</p>
     * @param score value to be set
     */

    public void setScore(final Integer score);

    /**
     *  <p>Defines a fixed price for the <code>score</code>.</p>
     * @param price value to be set
     */

    public void setPrice(final Money price);

    /**
     *  <p>Dynamically calculates a Price for a range of scores.</p>
     * @param priceFunction value to be set
     */

    public void setPriceFunction(final PriceFunction priceFunction);

    /**
     *  <p>Appears in response to Get ShippingMethods for a Cart if the shipping rate matches the search query.</p>
     * @param isMatching value to be set
     */

    public void setIsMatching(final Boolean isMatching);

    /**
     * factory method
     * @return instance of CartScoreTier
     */
    public static CartScoreTier of() {
        return new CartScoreTierImpl();
    }

    /**
     * factory method to create a shallow copy CartScoreTier
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartScoreTier of(final CartScoreTier template) {
        CartScoreTierImpl instance = new CartScoreTierImpl();
        instance.setScore(template.getScore());
        instance.setPrice(template.getPrice());
        instance.setPriceFunction(template.getPriceFunction());
        instance.setIsMatching(template.getIsMatching());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartScoreTier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartScoreTier deepCopy(@Nullable final CartScoreTier template) {
        if (template == null) {
            return null;
        }
        CartScoreTierImpl instance = new CartScoreTierImpl();
        instance.setScore(template.getScore());
        instance.setPrice(com.commercetools.api.models.common.Money.deepCopy(template.getPrice()));
        instance.setPriceFunction(
            com.commercetools.api.models.shipping_method.PriceFunction.deepCopy(template.getPriceFunction()));
        instance.setIsMatching(template.getIsMatching());
        return instance;
    }

    /**
     * builder factory method for CartScoreTier
     * @return builder
     */
    public static CartScoreTierBuilder builder() {
        return CartScoreTierBuilder.of();
    }

    /**
     * create builder for CartScoreTier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartScoreTierBuilder builder(final CartScoreTier template) {
        return CartScoreTierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartScoreTier(Function<CartScoreTier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartScoreTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartScoreTier>() {
            @Override
            public String toString() {
                return "TypeReference<CartScoreTier>";
            }
        };
    }
}
