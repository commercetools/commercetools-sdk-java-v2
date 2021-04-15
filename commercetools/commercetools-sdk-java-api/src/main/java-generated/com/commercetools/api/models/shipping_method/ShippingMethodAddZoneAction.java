package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodAddZoneActionImpl;

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
@JsonDeserialize(as = ShippingMethodAddZoneActionImpl.class)
public interface ShippingMethodAddZoneAction extends ShippingMethodUpdateAction {

    String ADD_ZONE = "addZone";

    
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneResourceIdentifier getZone();

    
    public void setZone(final ZoneResourceIdentifier zone);
    

    public static ShippingMethodAddZoneAction of(){
        return new ShippingMethodAddZoneActionImpl();
    }
    

    public static ShippingMethodAddZoneAction of(final ShippingMethodAddZoneAction template) {
        ShippingMethodAddZoneActionImpl instance = new ShippingMethodAddZoneActionImpl();
        instance.setZone(template.getZone());
        return instance;
    }

    public static ShippingMethodAddZoneActionBuilder builder(){
        return ShippingMethodAddZoneActionBuilder.of();
    }
    
    public static ShippingMethodAddZoneActionBuilder builder(final ShippingMethodAddZoneAction template){
        return ShippingMethodAddZoneActionBuilder.of(template);
    }
    

    default <T> T withShippingMethodAddZoneAction(Function<ShippingMethodAddZoneAction, T> helper) {
        return helper.apply(this);
    }
}
