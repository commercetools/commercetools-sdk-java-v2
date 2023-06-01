package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodRemoveZoneActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodRemoveZoneActionImpl.class)
public interface ShippingMethodRemoveZoneAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodRemoveZoneAction
     */
    String REMOVE_ZONE = "removeZone";

    /**
     *  <p>Value to remove from <code>zoneRates</code>.</p>
     * @return zone
     */
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneResourceIdentifier getZone();

    /**
     *  <p>Value to remove from <code>zoneRates</code>.</p>
     * @param zone value to be set
     */
    
    public void setZone(final ZoneResourceIdentifier zone);
    

    /**
     * factory method
     * @return instance of ShippingMethodRemoveZoneAction
     */
    public static ShippingMethodRemoveZoneAction of(){
        return new ShippingMethodRemoveZoneActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ShippingMethodRemoveZoneAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodRemoveZoneAction of(final ShippingMethodRemoveZoneAction template) {
        ShippingMethodRemoveZoneActionImpl instance = new ShippingMethodRemoveZoneActionImpl();
        instance.setZone(template.getZone());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodRemoveZoneAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodRemoveZoneAction deepCopy(@Nullable final ShippingMethodRemoveZoneAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodRemoveZoneActionImpl instance = new ShippingMethodRemoveZoneActionImpl();
        instance.setZone(com.commercetools.api.models.zone.ZoneResourceIdentifier.deepCopy(template.getZone()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodRemoveZoneAction
     * @return builder
     */
    public static ShippingMethodRemoveZoneActionBuilder builder() {
        return ShippingMethodRemoveZoneActionBuilder.of();
    }
    
    /**
     * create builder for ShippingMethodRemoveZoneAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodRemoveZoneActionBuilder builder(final ShippingMethodRemoveZoneAction template) {
        return ShippingMethodRemoveZoneActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodRemoveZoneAction(Function<ShippingMethodRemoveZoneAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodRemoveZoneAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodRemoveZoneAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodRemoveZoneAction>";
            }
        };
    }
}
