
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.zone.ZoneReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Defines shipping rates in different currencies for a specific <a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneRate zoneRate = ZoneRate.builder()
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .plusShippingRates(shippingRatesBuilder -> shippingRatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ZoneRateImpl.class)
public interface ZoneRate {

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a> for which the shipping rates are valid.</p>
     * @return zone
     */
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneReference getZone();

    /**
     *  <p>Shipping rates defined per currency.</p>
     * @return shippingRates
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRates")
    public List<ShippingRate> getShippingRates();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a> for which the shipping rates are valid.</p>
     * @param zone value to be set
     */

    public void setZone(final ZoneReference zone);

    /**
     *  <p>Shipping rates defined per currency.</p>
     * @param shippingRates values to be set
     */

    @JsonIgnore
    public void setShippingRates(final ShippingRate... shippingRates);

    /**
     *  <p>Shipping rates defined per currency.</p>
     * @param shippingRates values to be set
     */

    public void setShippingRates(final List<ShippingRate> shippingRates);

    /**
     * factory method
     * @return instance of ZoneRate
     */
    public static ZoneRate of() {
        return new ZoneRateImpl();
    }

    /**
     * factory method to create a shallow copy ZoneRate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ZoneRate of(final ZoneRate template) {
        ZoneRateImpl instance = new ZoneRateImpl();
        instance.setZone(template.getZone());
        instance.setShippingRates(template.getShippingRates());
        return instance;
    }

    public ZoneRate copyDeep();

    /**
     * factory method to create a deep copy of ZoneRate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ZoneRate deepCopy(@Nullable final ZoneRate template) {
        if (template == null) {
            return null;
        }
        ZoneRateImpl instance = new ZoneRateImpl();
        instance.setZone(com.commercetools.api.models.zone.ZoneReference.deepCopy(template.getZone()));
        instance.setShippingRates(Optional.ofNullable(template.getShippingRates())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.shipping_method.ShippingRate::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ZoneRate
     * @return builder
     */
    public static ZoneRateBuilder builder() {
        return ZoneRateBuilder.of();
    }

    /**
     * create builder for ZoneRate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneRateBuilder builder(final ZoneRate template) {
        return ZoneRateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withZoneRate(Function<ZoneRate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ZoneRate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneRate>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneRate>";
            }
        };
    }
}
