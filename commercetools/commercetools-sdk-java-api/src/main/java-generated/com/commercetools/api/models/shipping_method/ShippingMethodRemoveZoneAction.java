
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
 * ShippingMethodRemoveZoneAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodRemoveZoneAction shippingMethodRemoveZoneAction = ShippingMethodRemoveZoneAction.builder()
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodRemoveZoneActionImpl.class)
public interface ShippingMethodRemoveZoneAction extends ShippingMethodUpdateAction {

    String REMOVE_ZONE = "removeZone";

    /**
     *  <p>Value to remove from <code>zoneRates</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneResourceIdentifier getZone();

    public void setZone(final ZoneResourceIdentifier zone);

    public static ShippingMethodRemoveZoneAction of() {
        return new ShippingMethodRemoveZoneActionImpl();
    }

    public static ShippingMethodRemoveZoneAction of(final ShippingMethodRemoveZoneAction template) {
        ShippingMethodRemoveZoneActionImpl instance = new ShippingMethodRemoveZoneActionImpl();
        instance.setZone(template.getZone());
        return instance;
    }

    public static ShippingMethodRemoveZoneActionBuilder builder() {
        return ShippingMethodRemoveZoneActionBuilder.of();
    }

    public static ShippingMethodRemoveZoneActionBuilder builder(final ShippingMethodRemoveZoneAction template) {
        return ShippingMethodRemoveZoneActionBuilder.of(template);
    }

    default <T> T withShippingMethodRemoveZoneAction(Function<ShippingMethodRemoveZoneAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodRemoveZoneAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodRemoveZoneAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodRemoveZoneAction>";
            }
        };
    }
}
