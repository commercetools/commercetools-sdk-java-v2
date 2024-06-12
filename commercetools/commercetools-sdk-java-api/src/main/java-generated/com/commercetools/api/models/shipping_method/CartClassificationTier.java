
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
 *  <p>The ShippingRate maps to an abstract Cart categorization expressed by strings (for example, <code>Light</code>, <code>Medium</code>, or <code>Heavy</code>).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartClassificationTier cartClassificationTier = CartClassificationTier.builder()
 *             .value("{value}")
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartClassificationTierImpl.class)
public interface CartClassificationTier extends ShippingRatePriceTier {

    /**
     * discriminator value for CartClassificationTier
     */
    String CART_CLASSIFICATION = "CartClassification";

    /**
     *  <p><code>key</code> selected from the <code>values</code> of the CartClassificationType configured in the Project.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public String getValue();

    /**
     *  <p>Fixed shipping rate for the selected classification.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Money getPrice();

    /**
     *  <p>Appears in response to Get ShippingMethods for a Cart if the shipping rate matches the search query.</p>
     * @return isMatching
     */

    @JsonProperty("isMatching")
    public Boolean getIsMatching();

    /**
     *  <p><code>key</code> selected from the <code>values</code> of the CartClassificationType configured in the Project.</p>
     * @param value value to be set
     */

    public void setValue(final String value);

    /**
     *  <p>Fixed shipping rate for the selected classification.</p>
     * @param price value to be set
     */

    public void setPrice(final Money price);

    /**
     *  <p>Appears in response to Get ShippingMethods for a Cart if the shipping rate matches the search query.</p>
     * @param isMatching value to be set
     */

    public void setIsMatching(final Boolean isMatching);

    /**
     * factory method
     * @return instance of CartClassificationTier
     */
    public static CartClassificationTier of() {
        return new CartClassificationTierImpl();
    }

    /**
     * factory method to create a shallow copy CartClassificationTier
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartClassificationTier of(final CartClassificationTier template) {
        CartClassificationTierImpl instance = new CartClassificationTierImpl();
        instance.setValue(template.getValue());
        instance.setPrice(template.getPrice());
        instance.setIsMatching(template.getIsMatching());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartClassificationTier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartClassificationTier deepCopy(@Nullable final CartClassificationTier template) {
        if (template == null) {
            return null;
        }
        CartClassificationTierImpl instance = new CartClassificationTierImpl();
        instance.setValue(template.getValue());
        instance.setPrice(com.commercetools.api.models.common.Money.deepCopy(template.getPrice()));
        instance.setIsMatching(template.getIsMatching());
        return instance;
    }

    /**
     * builder factory method for CartClassificationTier
     * @return builder
     */
    public static CartClassificationTierBuilder builder() {
        return CartClassificationTierBuilder.of();
    }

    /**
     * create builder for CartClassificationTier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartClassificationTierBuilder builder(final CartClassificationTier template) {
        return CartClassificationTierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartClassificationTier(Function<CartClassificationTier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartClassificationTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartClassificationTier>() {
            @Override
            public String toString() {
                return "TypeReference<CartClassificationTier>";
            }
        };
    }
}
