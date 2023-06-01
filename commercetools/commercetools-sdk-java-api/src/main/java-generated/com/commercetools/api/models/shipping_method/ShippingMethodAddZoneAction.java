package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodAddZoneActionImpl;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodAddZoneActionImpl.class)
public interface ShippingMethodAddZoneAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodAddZoneAction
     */
    String ADD_ZONE = "addZone";

    /**
     *  <p>Value to add to <code>zoneRates</code>.</p>
     * @return zone
     */
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneResourceIdentifier getZone();

    /**
     *  <p>Value to add to <code>zoneRates</code>.</p>
     * @param zone value to be set
     */
    
    public void setZone(final ZoneResourceIdentifier zone);
    

    /**
     * factory method
     * @return instance of ShippingMethodAddZoneAction
     */
    public static ShippingMethodAddZoneAction of(){
        return new ShippingMethodAddZoneActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ShippingMethodAddZoneAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodAddZoneAction of(final ShippingMethodAddZoneAction template) {
        ShippingMethodAddZoneActionImpl instance = new ShippingMethodAddZoneActionImpl();
        instance.setZone(template.getZone());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodAddZoneAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodAddZoneAction deepCopy(@Nullable final ShippingMethodAddZoneAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodAddZoneActionImpl instance = new ShippingMethodAddZoneActionImpl();
        instance.setZone(com.commercetools.api.models.zone.ZoneResourceIdentifier.deepCopy(template.getZone()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodAddZoneAction
     * @return builder
     */
    public static ShippingMethodAddZoneActionBuilder builder() {
        return ShippingMethodAddZoneActionBuilder.of();
    }
    
    /**
     * create builder for ShippingMethodAddZoneAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodAddZoneActionBuilder builder(final ShippingMethodAddZoneAction template) {
        return ShippingMethodAddZoneActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodAddZoneAction(Function<ShippingMethodAddZoneAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodAddZoneAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodAddZoneAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodAddZoneAction>";
            }
        };
    }
}
