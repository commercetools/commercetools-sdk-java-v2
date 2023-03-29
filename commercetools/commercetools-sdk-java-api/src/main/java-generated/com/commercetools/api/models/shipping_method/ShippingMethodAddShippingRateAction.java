
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
 * ShippingMethodAddShippingRateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodAddShippingRateAction shippingMethodAddShippingRateAction = ShippingMethodAddShippingRateAction.builder()
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodAddShippingRateActionImpl.class)
public interface ShippingMethodAddShippingRateAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodAddShippingRateAction
     */
    String ADD_SHIPPING_RATE = "addShippingRate";

    /**
     *  <p>Zone to which the ShippingRate should be added.</p>
     * @return zone
     */
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneResourceIdentifier getZone();

    /**
     *  <p>Value to add to <code>shippingRates</code>.</p>
     * @return shippingRate
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();

    /**
     *  <p>Zone to which the ShippingRate should be added.</p>
     * @param zone value to be set
     */

    public void setZone(final ZoneResourceIdentifier zone);

    /**
     *  <p>Value to add to <code>shippingRates</code>.</p>
     * @param shippingRate value to be set
     */

    public void setShippingRate(final ShippingRateDraft shippingRate);

    /**
     * factory method
     * @return instance of ShippingMethodAddShippingRateAction
     */
    public static ShippingMethodAddShippingRateAction of() {
        return new ShippingMethodAddShippingRateActionImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodAddShippingRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodAddShippingRateAction of(final ShippingMethodAddShippingRateAction template) {
        ShippingMethodAddShippingRateActionImpl instance = new ShippingMethodAddShippingRateActionImpl();
        instance.setZone(template.getZone());
        instance.setShippingRate(template.getShippingRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodAddShippingRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodAddShippingRateAction deepCopy(
            @Nullable final ShippingMethodAddShippingRateAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodAddShippingRateActionImpl instance = new ShippingMethodAddShippingRateActionImpl();
        instance.setZone(com.commercetools.api.models.zone.ZoneResourceIdentifier.deepCopy(template.getZone()));
        instance.setShippingRate(
            com.commercetools.api.models.shipping_method.ShippingRateDraft.deepCopy(template.getShippingRate()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodAddShippingRateAction
     * @return builder
     */
    public static ShippingMethodAddShippingRateActionBuilder builder() {
        return ShippingMethodAddShippingRateActionBuilder.of();
    }

    /**
     * create builder for ShippingMethodAddShippingRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodAddShippingRateActionBuilder builder(
            final ShippingMethodAddShippingRateAction template) {
        return ShippingMethodAddShippingRateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodAddShippingRateAction(Function<ShippingMethodAddShippingRateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodAddShippingRateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodAddShippingRateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodAddShippingRateAction>";
            }
        };
    }
}
