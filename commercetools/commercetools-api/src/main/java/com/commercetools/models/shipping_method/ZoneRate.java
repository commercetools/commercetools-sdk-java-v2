package com.commercetools.models.shipping_method;

import com.commercetools.models.shipping_method.ShippingRate;
import com.commercetools.models.zone.ZoneReference;
import com.commercetools.models.shipping_method.ZoneRateImpl;

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
@JsonDeserialize(as = ZoneRateImpl.class)
public interface ZoneRate  {

   
   @NotNull
   @Valid
   @JsonProperty("zone")
   public ZoneReference getZone();
   
   @NotNull
   @Valid
   @JsonProperty("shippingRates")
   public List<ShippingRate> getShippingRates();

   public void setZone(final ZoneReference zone);
   
   public void setShippingRates(final List<ShippingRate> shippingRates);
   
   public static ZoneRateImpl of(){
      return new ZoneRateImpl();
   }
   

   public static ZoneRateImpl of(final ZoneRate template) {
      ZoneRateImpl instance = new ZoneRateImpl();
      instance.setZone(template.getZone());
      instance.setShippingRates(template.getShippingRates());
      return instance;
   }

}