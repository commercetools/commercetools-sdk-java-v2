package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import com.commercetools.models.ShippingMethod.ShippingRateDraft;
import com.commercetools.models.Zone.ZoneResourceIdentifier;
import java.lang.String;
import com.commercetools.models.ShippingMethod.ShippingMethodAddShippingRateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
      instance.setShippingRate(template.getShippingRate());
      instance.setZone(template.getZone());
      return instance;
   }

}