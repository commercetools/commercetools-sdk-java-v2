
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ShippingRate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRate shippingRate = ShippingRate.builder()
 *             .price(priceBuilder -> priceBuilder)
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingRateImpl.class)
public interface ShippingRate {

    /**
     *  <p>Currency amount of the ShippingRate.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public CentPrecisionMoney getPrice();

    /**
     *  <p><span>Free shipping</span> is applied if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     * @return freeAbove
     */
    @Valid
    @JsonProperty("freeAbove")
    public CentPrecisionMoney getFreeAbove();

    /**
     *  <p><code>true</code> if the ShippingRate matches given <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Location" rel="nofollow">Location</a>. Only appears in response to requests for <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/shipping-methods/matching-cart:GET" rel="nofollow">Get ShippingMethods for a Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/shipping-methods/matching-location:GET" rel="nofollow">Get ShippingMethods for a Location</a>.</p>
     * @return isMatching
     */

    @JsonProperty("isMatching")
    public Boolean getIsMatching();

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @return tiers
     */
    @NotNull
    @Valid
    @JsonProperty("tiers")
    public List<ShippingRatePriceTier> getTiers();

    /**
     *  <p>Currency amount of the ShippingRate.</p>
     * @param price value to be set
     */

    public void setPrice(final CentPrecisionMoney price);

    /**
     *  <p><span>Free shipping</span> is applied if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     * @param freeAbove value to be set
     */

    public void setFreeAbove(final CentPrecisionMoney freeAbove);

    /**
     *  <p><code>true</code> if the ShippingRate matches given <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Location" rel="nofollow">Location</a>. Only appears in response to requests for <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/shipping-methods/matching-cart:GET" rel="nofollow">Get ShippingMethods for a Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/shipping-methods/matching-location:GET" rel="nofollow">Get ShippingMethods for a Location</a>.</p>
     * @param isMatching value to be set
     */

    public void setIsMatching(final Boolean isMatching);

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final ShippingRatePriceTier... tiers);

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @param tiers values to be set
     */

    public void setTiers(final List<ShippingRatePriceTier> tiers);

    /**
     * factory method
     * @return instance of ShippingRate
     */
    public static ShippingRate of() {
        return new ShippingRateImpl();
    }

    /**
     * factory method to create a shallow copy ShippingRate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingRate of(final ShippingRate template) {
        ShippingRateImpl instance = new ShippingRateImpl();
        instance.setPrice(template.getPrice());
        instance.setFreeAbove(template.getFreeAbove());
        instance.setIsMatching(template.getIsMatching());
        instance.setTiers(template.getTiers());
        return instance;
    }

    public ShippingRate copyDeep();

    /**
     * factory method to create a deep copy of ShippingRate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingRate deepCopy(@Nullable final ShippingRate template) {
        if (template == null) {
            return null;
        }
        ShippingRateImpl instance = new ShippingRateImpl();
        instance.setPrice(com.commercetools.api.models.common.CentPrecisionMoney.deepCopy(template.getPrice()));
        instance.setFreeAbove(com.commercetools.api.models.common.CentPrecisionMoney.deepCopy(template.getFreeAbove()));
        instance.setIsMatching(template.getIsMatching());
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.shipping_method.ShippingRatePriceTier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ShippingRate
     * @return builder
     */
    public static ShippingRateBuilder builder() {
        return ShippingRateBuilder.of();
    }

    /**
     * create builder for ShippingRate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingRateBuilder builder(final ShippingRate template) {
        return ShippingRateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingRate(Function<ShippingRate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingRate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingRate>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingRate>";
            }
        };
    }
}
