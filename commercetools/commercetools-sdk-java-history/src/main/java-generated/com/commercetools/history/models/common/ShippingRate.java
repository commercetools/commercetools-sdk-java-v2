
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
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
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Money getPrice();

    /**
     *
     * @return freeAbove
     */
    @NotNull
    @Valid
    @JsonProperty("freeAbove")
    public Money getFreeAbove();

    /**
     *  <p>Only appears in response to requests for ShippingMethods by Cart or location to mark this shipping rate as one that matches the Cart or location.</p>
     * @return isMatching
     */
    @NotNull
    @JsonProperty("isMatching")
    public Boolean getIsMatching();

    /**
     *
     * @return tiers
     */
    @NotNull
    @Valid
    @JsonProperty("tiers")
    public List<ShippingRatePriceTier> getTiers();

    /**
     * set price
     * @param price value to be set
     */

    public void setPrice(final Money price);

    /**
     * set freeAbove
     * @param freeAbove value to be set
     */

    public void setFreeAbove(final Money freeAbove);

    /**
     *  <p>Only appears in response to requests for ShippingMethods by Cart or location to mark this shipping rate as one that matches the Cart or location.</p>
     * @param isMatching value to be set
     */

    public void setIsMatching(final Boolean isMatching);

    /**
     * set tiers
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final ShippingRatePriceTier... tiers);

    /**
     * set tiers
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
        instance.setPrice(Optional.ofNullable(template.getPrice())
                .map(com.commercetools.history.models.common.Money::deepCopy)
                .orElse(null));
        instance.setFreeAbove(Optional.ofNullable(template.getFreeAbove())
                .map(com.commercetools.history.models.common.Money::deepCopy)
                .orElse(null));
        instance.setIsMatching(template.getIsMatching());
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.ShippingRatePriceTier::deepCopy)
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
