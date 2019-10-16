package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.generated.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.generated.models.zone.ZoneResourceIdentifier;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodRemoveShippingRateActionImpl;

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
@JsonDeserialize(as = ShippingMethodRemoveShippingRateActionImpl.class)
public interface ShippingMethodRemoveShippingRateAction extends ShippingMethodUpdateAction {

   
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
   
   public static ShippingMethodRemoveShippingRateActionImpl of(){
      return new ShippingMethodRemoveShippingRateActionImpl();
   }
   

   public static ShippingMethodRemoveShippingRateActionImpl of(final ShippingMethodRemoveShippingRateAction template) {
      ShippingMethodRemoveShippingRateActionImpl instance = new ShippingMethodRemoveShippingRateActionImpl();
      instance.setShippingRate(template.getShippingRate());
      instance.setZone(template.getZone());
      return instance;
   }

}