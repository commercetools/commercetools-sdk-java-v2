
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public TypedMoney getPrice();

    /**
     *  <p>Shipping is free if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     */
    @Valid
    @JsonProperty("freeAbove")
    public TypedMoney getFreeAbove();

    /**
     *  <p><code>true</code> if the ShippingRate matches given Cart or Location. Only appears in response to requests for Get ShippingMethods for a Cart or Get ShippingMethods for a Location.</p>
     */

    @JsonProperty("isMatching")
    public Boolean getIsMatching();

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("tiers")
    public List<ShippingRatePriceTier> getTiers();

    public void setPrice(final TypedMoney price);

    public void setFreeAbove(final TypedMoney freeAbove);

    public void setIsMatching(final Boolean isMatching);

    @JsonIgnore
    public void setTiers(final ShippingRatePriceTier... tiers);

    public void setTiers(final List<ShippingRatePriceTier> tiers);

    public static ShippingRate of() {
        return new ShippingRateImpl();
    }

    public static ShippingRate of(final ShippingRate template) {
        ShippingRateImpl instance = new ShippingRateImpl();
        instance.setPrice(template.getPrice());
        instance.setFreeAbove(template.getFreeAbove());
        instance.setIsMatching(template.getIsMatching());
        instance.setTiers(template.getTiers());
        return instance;
    }

    public static ShippingRateBuilder builder() {
        return ShippingRateBuilder.of();
    }

    public static ShippingRateBuilder builder(final ShippingRate template) {
        return ShippingRateBuilder.of(template);
    }

    default <T> T withShippingRate(Function<ShippingRate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingRate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingRate>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingRate>";
            }
        };
    }
}
