
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Used when the ShippingRate maps to an abstract Cart categorization expressed by strings (for example, <code>Light</code>, <code>Medium</code>, or <code>Heavy</code>).</p>
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

    String CART_CLASSIFICATION = "CartClassification";

    /**
     *  <p><code>key</code> selected from the <code>values</code> of the CartClassificationType configured in the Project.</p>
     */
    @NotNull
    @JsonProperty("value")
    public String getValue();

    /**
     *  <p>Fixed shipping rate for the selected classification.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Money getPrice();

    /**
     *  <p>Appears in response to Get ShippingMethods for a Cart if the shipping rate matches the search query.</p>
     */

    @JsonProperty("isMatching")
    public Boolean getIsMatching();

    public void setValue(final String value);

    public void setPrice(final Money price);

    public void setIsMatching(final Boolean isMatching);

    public static CartClassificationTier of() {
        return new CartClassificationTierImpl();
    }

    public static CartClassificationTier of(final CartClassificationTier template) {
        CartClassificationTierImpl instance = new CartClassificationTierImpl();
        instance.setValue(template.getValue());
        instance.setPrice(template.getPrice());
        instance.setIsMatching(template.getIsMatching());
        return instance;
    }

    public static CartClassificationTierBuilder builder() {
        return CartClassificationTierBuilder.of();
    }

    public static CartClassificationTierBuilder builder(final CartClassificationTier template) {
        return CartClassificationTierBuilder.of(template);
    }

    default <T> T withCartClassificationTier(Function<CartClassificationTier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartClassificationTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartClassificationTier>() {
            @Override
            public String toString() {
                return "TypeReference<CartClassificationTier>";
            }
        };
    }
}
