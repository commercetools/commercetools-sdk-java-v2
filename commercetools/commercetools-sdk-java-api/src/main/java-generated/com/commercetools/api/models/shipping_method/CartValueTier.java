
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
 *  <p>Used when the ShippingRate maps to the sum of LineItem Prices. The value of the Cart is used to select a tier. If chosen, it is not possible to set a value for the <code>shippingRateInput</code> on the Cart. Tiers contain the <code>centAmount</code> (a value of <code>100</code> in the currency <code>USD</code> corresponds to <code>$ 1.00</code>), and start at <code>1</code>.'</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartValueTier cartValueTier = CartValueTier.builder()
 *             .minimumCentAmount(1)
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartValueTierImpl.class)
public interface CartValueTier extends ShippingRatePriceTier {

    String CART_VALUE = "CartValue";

    /**
     *  <p>Minimum total price of a Cart for which a shipping rate applies.</p>
     */
    @NotNull
    @JsonProperty("minimumCentAmount")
    public Long getMinimumCentAmount();

    /**
     *  <p>Fixed shipping rate Price for a CartValue.</p>
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

    public void setMinimumCentAmount(final Long minimumCentAmount);

    public void setPrice(final Money price);

    public void setIsMatching(final Boolean isMatching);

    public static CartValueTier of() {
        return new CartValueTierImpl();
    }

    public static CartValueTier of(final CartValueTier template) {
        CartValueTierImpl instance = new CartValueTierImpl();
        instance.setMinimumCentAmount(template.getMinimumCentAmount());
        instance.setPrice(template.getPrice());
        instance.setIsMatching(template.getIsMatching());
        return instance;
    }

    public static CartValueTierBuilder builder() {
        return CartValueTierBuilder.of();
    }

    public static CartValueTierBuilder builder(final CartValueTier template) {
        return CartValueTierBuilder.of(template);
    }

    default <T> T withCartValueTier(Function<CartValueTier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartValueTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartValueTier>() {
            @Override
            public String toString() {
                return "TypeReference<CartValueTier>";
            }
        };
    }
}
