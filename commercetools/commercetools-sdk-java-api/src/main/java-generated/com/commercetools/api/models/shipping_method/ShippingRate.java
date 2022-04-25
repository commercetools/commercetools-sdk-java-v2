
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingRateImpl.class)
public interface ShippingRate {

    @NotNull
    @Valid
    @JsonProperty("price")
    public TypedMoney getPrice();

    /**
    *  <p>The shipping is free if the order total (the sum of line item prices) exceeds the <code>freeAbove</code> value.
    *  Note: <code>freeAbove</code> applies before any Cart or Product discounts, and can cause discounts to apply in invalid scenarios.
    *  Use a Cart Discount to set the shipping price to 0 to avoid providing free shipping in invalid discount scenarios.</p>
    */
    @Valid
    @JsonProperty("freeAbove")
    public TypedMoney getFreeAbove();

    /**
    *  <p>Only appears in response to requests for shipping methods by cart or location to mark this shipping rate as one that matches the cart or location.</p>
    */

    @JsonProperty("isMatching")
    public Boolean getIsMatching();

    /**
    *  <p>A list of shipping rate price tiers.</p>
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
