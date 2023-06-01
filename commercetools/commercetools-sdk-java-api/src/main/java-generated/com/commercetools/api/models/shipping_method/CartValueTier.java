package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.models.shipping_method.CartValueTierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartValueTierImpl.class)
public interface CartValueTier extends ShippingRatePriceTier {

    /**
     * discriminator value for CartValueTier
     */
    String CART_VALUE = "CartValue";

    /**
     *  <p>Minimum total price of a Cart for which a shipping rate applies.</p>
     * @return minimumCentAmount
     */
    @NotNull
    @JsonProperty("minimumCentAmount")
    public Long getMinimumCentAmount();
    /**
     *  <p>Fixed shipping rate Price for a CartValue.</p>
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
     *  <p>Minimum total price of a Cart for which a shipping rate applies.</p>
     * @param minimumCentAmount value to be set
     */
    
    public void setMinimumCentAmount(final Long minimumCentAmount);
    
    
    /**
     *  <p>Fixed shipping rate Price for a CartValue.</p>
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
     * @return instance of CartValueTier
     */
    public static CartValueTier of(){
        return new CartValueTierImpl();
    }
    

    /**
     * factory method to create a shallow copy CartValueTier
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartValueTier of(final CartValueTier template) {
        CartValueTierImpl instance = new CartValueTierImpl();
        instance.setMinimumCentAmount(template.getMinimumCentAmount());
        instance.setPrice(template.getPrice());
        instance.setIsMatching(template.getIsMatching());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartValueTier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartValueTier deepCopy(@Nullable final CartValueTier template) {
        if (template == null) {
            return null;
        }
        CartValueTierImpl instance = new CartValueTierImpl();
        instance.setMinimumCentAmount(template.getMinimumCentAmount());
        instance.setPrice(com.commercetools.api.models.common.Money.deepCopy(template.getPrice()));
        instance.setIsMatching(template.getIsMatching());
        return instance;
    }

    /**
     * builder factory method for CartValueTier
     * @return builder
     */
    public static CartValueTierBuilder builder() {
        return CartValueTierBuilder.of();
    }
    
    /**
     * create builder for CartValueTier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartValueTierBuilder builder(final CartValueTier template) {
        return CartValueTierBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartValueTier(Function<CartValueTier, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartValueTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartValueTier>() {
            @Override
            public String toString() {
                return "TypeReference<CartValueTier>";
            }
        };
    }
}
