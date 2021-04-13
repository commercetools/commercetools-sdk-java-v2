package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodRemoveZoneActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodRemoveZoneActionImpl.class)
public interface ShippingMethodRemoveZoneAction extends ShippingMethodUpdateAction {

    String REMOVE_ZONE = "removeZone";

    
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneResourceIdentifier getZone();

    
    public void setZone(final ZoneResourceIdentifier zone);
    

    public static ShippingMethodRemoveZoneAction of(){
        return new ShippingMethodRemoveZoneActionImpl();
    }
    

    public static ShippingMethodRemoveZoneAction of(final ShippingMethodRemoveZoneAction template) {
        ShippingMethodRemoveZoneActionImpl instance = new ShippingMethodRemoveZoneActionImpl();
        instance.setZone(template.getZone());
        return instance;
    }

    public static ShippingMethodRemoveZoneActionBuilder builder(){
        return ShippingMethodRemoveZoneActionBuilder.of();
    }
    
    public static ShippingMethodRemoveZoneActionBuilder builder(final ShippingMethodRemoveZoneAction template){
        return ShippingMethodRemoveZoneActionBuilder.of(template);
    }
    

    default <T> T withShippingMethodRemoveZoneAction(Function<ShippingMethodRemoveZoneAction, T> helper) {
        return helper.apply(this);
    }
}
