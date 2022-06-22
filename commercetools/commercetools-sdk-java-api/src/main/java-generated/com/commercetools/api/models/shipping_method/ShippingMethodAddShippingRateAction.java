
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String ADD_SHIPPING_RATE = "addShippingRate";

    /**
     *  <p>Zone to which the ShippingRate should be added.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneResourceIdentifier getZone();

    /**
     *  <p>Value to add to <code>shippingRates</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();

    public void setZone(final ZoneResourceIdentifier zone);

    public void setShippingRate(final ShippingRateDraft shippingRate);

    public static ShippingMethodAddShippingRateAction of() {
        return new ShippingMethodAddShippingRateActionImpl();
    }

    public static ShippingMethodAddShippingRateAction of(final ShippingMethodAddShippingRateAction template) {
        ShippingMethodAddShippingRateActionImpl instance = new ShippingMethodAddShippingRateActionImpl();
        instance.setZone(template.getZone());
        instance.setShippingRate(template.getShippingRate());
        return instance;
    }

    public static ShippingMethodAddShippingRateActionBuilder builder() {
        return ShippingMethodAddShippingRateActionBuilder.of();
    }

    public static ShippingMethodAddShippingRateActionBuilder builder(
            final ShippingMethodAddShippingRateAction template) {
        return ShippingMethodAddShippingRateActionBuilder.of(template);
    }

    default <T> T withShippingMethodAddShippingRateAction(Function<ShippingMethodAddShippingRateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodAddShippingRateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodAddShippingRateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodAddShippingRateAction>";
            }
        };
    }
}
