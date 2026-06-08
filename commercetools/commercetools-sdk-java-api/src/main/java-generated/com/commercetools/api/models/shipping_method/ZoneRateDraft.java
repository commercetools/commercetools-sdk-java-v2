
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ZoneRateDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneRateDraft zoneRateDraft = ZoneRateDraft.builder()
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .plusShippingRates(shippingRatesBuilder -> shippingRatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ZoneRateDraftImpl.class)
public interface ZoneRateDraft extends io.vrap.rmf.base.client.Draft<ZoneRateDraft> {

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a> for which the shippng rates are valid.</p>
     * @return zone
     */
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneResourceIdentifier getZone();

    /**
     *  <p>Shipping rates for the <code>currencies</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>. The array must not contain two ShippingRates with the same <a href="https://docs.commercetools.com/apis/ctp:api:type:CurrencyCode" rel="nofollow">CurrencyCode</a>.</p>
     * @return shippingRates
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRates")
    public List<ShippingRateDraft> getShippingRates();

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a> for which the shippng rates are valid.</p>
     * @param zone value to be set
     */

    public void setZone(final ZoneResourceIdentifier zone);

    /**
     *  <p>Shipping rates for the <code>currencies</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>. The array must not contain two ShippingRates with the same <a href="https://docs.commercetools.com/apis/ctp:api:type:CurrencyCode" rel="nofollow">CurrencyCode</a>.</p>
     * @param shippingRates values to be set
     */

    @JsonIgnore
    public void setShippingRates(final ShippingRateDraft... shippingRates);

    /**
     *  <p>Shipping rates for the <code>currencies</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>. The array must not contain two ShippingRates with the same <a href="https://docs.commercetools.com/apis/ctp:api:type:CurrencyCode" rel="nofollow">CurrencyCode</a>.</p>
     * @param shippingRates values to be set
     */

    public void setShippingRates(final List<ShippingRateDraft> shippingRates);

    /**
     * factory method
     * @return instance of ZoneRateDraft
     */
    public static ZoneRateDraft of() {
        return new ZoneRateDraftImpl();
    }

    /**
     * factory method to create a shallow copy ZoneRateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ZoneRateDraft of(final ZoneRateDraft template) {
        ZoneRateDraftImpl instance = new ZoneRateDraftImpl();
        instance.setZone(template.getZone());
        instance.setShippingRates(template.getShippingRates());
        return instance;
    }

    public ZoneRateDraft copyDeep();

    /**
     * factory method to create a deep copy of ZoneRateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ZoneRateDraft deepCopy(@Nullable final ZoneRateDraft template) {
        if (template == null) {
            return null;
        }
        ZoneRateDraftImpl instance = new ZoneRateDraftImpl();
        instance.setZone(com.commercetools.api.models.zone.ZoneResourceIdentifier.deepCopy(template.getZone()));
        instance.setShippingRates(Optional.ofNullable(template.getShippingRates())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.shipping_method.ShippingRateDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ZoneRateDraft
     * @return builder
     */
    public static ZoneRateDraftBuilder builder() {
        return ZoneRateDraftBuilder.of();
    }

    /**
     * create builder for ZoneRateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneRateDraftBuilder builder(final ZoneRateDraft template) {
        return ZoneRateDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withZoneRateDraft(Function<ZoneRateDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ZoneRateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneRateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneRateDraft>";
            }
        };
    }
}
