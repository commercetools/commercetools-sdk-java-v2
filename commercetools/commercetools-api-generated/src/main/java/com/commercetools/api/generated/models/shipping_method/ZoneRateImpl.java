package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ShippingRate;
import com.commercetools.api.generated.models.zone.ZoneReference;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ZoneRateImpl implements ZoneRate {

   private com.commercetools.api.generated.models.zone.ZoneReference zone;
   
   private java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRate> shippingRates;

   @JsonCreator
   ZoneRateImpl(@JsonProperty("zone") final com.commercetools.api.generated.models.zone.ZoneReference zone, @JsonProperty("shippingRates") final java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRate> shippingRates) {
      this.zone = zone;
      this.shippingRates = shippingRates;
   }
   public ZoneRateImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.zone.ZoneReference getZone(){
      return this.zone;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRate> getShippingRates(){
      return this.shippingRates;
   }

   public void setZone(final com.commercetools.api.generated.models.zone.ZoneReference zone){
      this.zone = zone;
   }
   
   public void setShippingRates(final java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRate> shippingRates){
      this.shippingRates = shippingRates;
   }

}