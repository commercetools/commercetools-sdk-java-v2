
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
 * ShippingMethodAddZoneAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodAddZoneAction shippingMethodAddZoneAction = ShippingMethodAddZoneAction.builder()
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodAddZoneActionImpl.class)
public interface ShippingMethodAddZoneAction extends ShippingMethodUpdateAction {

    String ADD_ZONE = "addZone";

    /**
     *  <p>Value to add to <code>zoneRates</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneResourceIdentifier getZone();

    public void setZone(final ZoneResourceIdentifier zone);

    public static ShippingMethodAddZoneAction of() {
        return new ShippingMethodAddZoneActionImpl();
    }

    public static ShippingMethodAddZoneAction of(final ShippingMethodAddZoneAction template) {
        ShippingMethodAddZoneActionImpl instance = new ShippingMethodAddZoneActionImpl();
        instance.setZone(template.getZone());
        return instance;
    }

    public static ShippingMethodAddZoneActionBuilder builder() {
        return ShippingMethodAddZoneActionBuilder.of();
    }

    public static ShippingMethodAddZoneActionBuilder builder(final ShippingMethodAddZoneAction template) {
        return ShippingMethodAddZoneActionBuilder.of(template);
    }

    default <T> T withShippingMethodAddZoneAction(Function<ShippingMethodAddZoneAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodAddZoneAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodAddZoneAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodAddZoneAction>";
            }
        };
    }
}
