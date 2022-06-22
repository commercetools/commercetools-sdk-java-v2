
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
 *  <p>Used when the ShippingRate maps to an abstract Cart categorization expressed by integers (such as shipping scores or weight ranges). Either <code>price</code> or <code>priceFunction</code> is required.</p>
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

    String CART_SCORE = "CartScore";

    /**
     *  <p>Abstract value for categorizing a Cart. The range starts at <code>0</code>. The default price covers <code>0</code>, tiers start at <code>1</code>. See Using Tiered Shipping Rates for details and examples.</p>
     */
    @NotNull
    @JsonProperty("score")
    public Integer getScore();

    /**
     *  <p>Defines a fixed price for the <code>score</code>.</p>
     */
    @Valid
    @JsonProperty("price")
    public Money getPrice();

    /**
     *  <p>Dynamically calculates a Price for a range of scores.</p>
     */
    @Valid
    @JsonProperty("priceFunction")
    public PriceFunction getPriceFunction();

    /**
     *  <p>Appears in response to Get ShippingMethods for a Cart if the shipping rate matches the search query.</p>
     */

    @JsonProperty("isMatching")
    public Boolean getIsMatching();

    public void setScore(final Integer score);

    public void setPrice(final Money price);

    public void setPriceFunction(final PriceFunction priceFunction);

    public void setIsMatching(final Boolean isMatching);

    public static CartScoreTier of() {
        return new CartScoreTierImpl();
    }

    public static CartScoreTier of(final CartScoreTier template) {
        CartScoreTierImpl instance = new CartScoreTierImpl();
        instance.setScore(template.getScore());
        instance.setPrice(template.getPrice());
        instance.setPriceFunction(template.getPriceFunction());
        instance.setIsMatching(template.getIsMatching());
        return instance;
    }

    public static CartScoreTierBuilder builder() {
        return CartScoreTierBuilder.of();
    }

    public static CartScoreTierBuilder builder(final CartScoreTier template) {
        return CartScoreTierBuilder.of(template);
    }

    default <T> T withCartScoreTier(Function<CartScoreTier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartScoreTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartScoreTier>() {
            @Override
            public String toString() {
                return "TypeReference<CartScoreTier>";
            }
        };
    }
}
