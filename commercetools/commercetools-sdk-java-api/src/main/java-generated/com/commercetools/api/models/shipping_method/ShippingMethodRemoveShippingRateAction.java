
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodRemoveShippingRateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodRemoveShippingRateAction shippingMethodRemoveShippingRateAction = ShippingMethodRemoveShippingRateAction.builder()
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodRemoveShippingRateActionImpl.class)
public interface ShippingMethodRemoveShippingRateAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodRemoveShippingRateAction
     */
    String REMOVE_SHIPPING_RATE = "removeShippingRate";

    /**
     *  <p>Zone from which the ShippingRate should be removed.</p>
     * @return zone
     */
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneResourceIdentifier getZone();

    /**
     *  <p>Value to remove from <code>shippingRates</code>.</p>
     * @return shippingRate
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();

    /**
     *  <p>Zone from which the ShippingRate should be removed.</p>
     * @param zone value to be set
     */

    public void setZone(final ZoneResourceIdentifier zone);

    /**
     *  <p>Value to remove from <code>shippingRates</code>.</p>
     * @param shippingRate value to be set
     */

    public void setShippingRate(final ShippingRateDraft shippingRate);

    /**
     * factory method
     * @return instance of ShippingMethodRemoveShippingRateAction
     */
    public static ShippingMethodRemoveShippingRateAction of() {
        return new ShippingMethodRemoveShippingRateActionImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodRemoveShippingRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodRemoveShippingRateAction of(final ShippingMethodRemoveShippingRateAction template) {
        ShippingMethodRemoveShippingRateActionImpl instance = new ShippingMethodRemoveShippingRateActionImpl();
        instance.setZone(template.getZone());
        instance.setShippingRate(template.getShippingRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodRemoveShippingRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodRemoveShippingRateAction deepCopy(
            @Nullable final ShippingMethodRemoveShippingRateAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodRemoveShippingRateActionImpl instance = new ShippingMethodRemoveShippingRateActionImpl();
        instance.setZone(Optional.ofNullable(template.getZone())
                .map(com.commercetools.api.models.zone.ZoneResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setShippingRate(Optional.ofNullable(template.getShippingRate())
                .map(com.commercetools.api.models.shipping_method.ShippingRateDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodRemoveShippingRateAction
     * @return builder
     */
    public static ShippingMethodRemoveShippingRateActionBuilder builder() {
        return ShippingMethodRemoveShippingRateActionBuilder.of();
    }

    /**
     * create builder for ShippingMethodRemoveShippingRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodRemoveShippingRateActionBuilder builder(
            final ShippingMethodRemoveShippingRateAction template) {
        return ShippingMethodRemoveShippingRateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodRemoveShippingRateAction(
            Function<ShippingMethodRemoveShippingRateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodRemoveShippingRateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodRemoveShippingRateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodRemoveShippingRateAction>";
            }
        };
    }
}
