
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.zone.ZoneReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Defines shipping rates in different currencies for a specific Zone.</p>
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
     *  <p>Zone for which the shipping rates are valid.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneReference getZone();

    /**
     *  <p>Shipping rates defined per currency.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRates")
    public List<ShippingRate> getShippingRates();

    public void setZone(final ZoneReference zone);

    @JsonIgnore
    public void setShippingRates(final ShippingRate... shippingRates);

    public void setShippingRates(final List<ShippingRate> shippingRates);

    public static ZoneRate of() {
        return new ZoneRateImpl();
    }

    public static ZoneRate of(final ZoneRate template) {
        ZoneRateImpl instance = new ZoneRateImpl();
        instance.setZone(template.getZone());
        instance.setShippingRates(template.getShippingRates());
        return instance;
    }

    public static ZoneRateBuilder builder() {
        return ZoneRateBuilder.of();
    }

    public static ZoneRateBuilder builder(final ZoneRate template) {
        return ZoneRateBuilder.of(template);
    }

    default <T> T withZoneRate(Function<ZoneRate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ZoneRate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneRate>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneRate>";
            }
        };
    }
}
