package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingRate;
import com.commercetools.models.Zone.ZoneReference;
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

   private com.commercetools.models.Zone.ZoneReference zone;
   
   private java.util.List<com.commercetools.models.ShippingMethod.ShippingRate> shippingRates;

   @JsonCreator
   ZoneRateImpl(@JsonProperty("zone") final com.commercetools.models.Zone.ZoneReference zone, @JsonProperty("shippingRates") final java.util.List<com.commercetools.models.ShippingMethod.ShippingRate> shippingRates) {
      this.zone = zone;
      this.shippingRates = shippingRates;
   }
   public ZoneRateImpl() {
      
   }
   
   
   public com.commercetools.models.Zone.ZoneReference getZone(){
      return this.zone;
   }
   
   
   public java.util.List<com.commercetools.models.ShippingMethod.ShippingRate> getShippingRates(){
      return this.shippingRates;
   }

   public void setZone(final com.commercetools.models.Zone.ZoneReference zone){
      this.zone = zone;
   }
   
   public void setShippingRates(final java.util.List<com.commercetools.models.ShippingMethod.ShippingRate> shippingRates){
      this.shippingRates = shippingRates;
   }

}