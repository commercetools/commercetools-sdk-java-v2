package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodAddShippingRateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodAddShippingRateActionImpl.class)
public interface ShippingMethodAddShippingRateAction extends ShippingMethodUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("zone")
   public ZoneResourceIdentifier getZone();
   
   @NotNull
   @Valid
   @JsonProperty("shippingRate")
   public ShippingRateDraft getShippingRate();

   public void setZone(final ZoneResourceIdentifier zone);
   
   public void setShippingRate(final ShippingRateDraft shippingRate);
   
   public static ShippingMethodAddShippingRateActionImpl of(){
      return new ShippingMethodAddShippingRateActionImpl();
   }
   

   public static ShippingMethodAddShippingRateActionImpl of(final ShippingMethodAddShippingRateAction template) {
      ShippingMethodAddShippingRateActionImpl instance = new ShippingMethodAddShippingRateActionImpl();
      instance.setZone(template.getZone());
      instance.setShippingRate(template.getShippingRate());
      return instance;
   }

}
