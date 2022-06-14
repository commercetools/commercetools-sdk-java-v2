
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
 *             .freeAbove(freeAboveBuilder -> freeAboveBuilder)
 *             .isMatching(true)
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingRateImpl.class)
public interface ShippingRate {

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Money getPrice();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("freeAbove")
    public Money getFreeAbove();

    /**
     *  <p>Only appears in response to requests for ShippingMethods by Cart or location to mark this shipping rate as one that matches the Cart or location.</p>
     */
    @NotNull
    @JsonProperty("isMatching")
    public Boolean getIsMatching();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("tiers")
    public List<ShippingRatePriceTier> getTiers();

    public void setPrice(final Money price);

    public void setFreeAbove(final Money freeAbove);

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
