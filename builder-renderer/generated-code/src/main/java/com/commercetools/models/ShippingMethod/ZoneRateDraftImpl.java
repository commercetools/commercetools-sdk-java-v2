package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingRateDraft;
import com.commercetools.models.Zone.ZoneResourceIdentifier;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ZoneRateDraftImpl implements ZoneRateDraft {

   private com.commercetools.models.Zone.ZoneResourceIdentifier zone;
   
   private java.util.List<com.commercetools.models.ShippingMethod.ShippingRateDraft> shippingRates;

   @JsonCreator
   ZoneRateDraftImpl(@JsonProperty("zone") final com.commercetools.models.Zone.ZoneResourceIdentifier zone, @JsonProperty("shippingRates") final java.util.List<com.commercetools.models.ShippingMethod.ShippingRateDraft> shippingRates) {
      this.zone = zone;
      this.shippingRates = shippingRates;
   }
   public ZoneRateDraftImpl() {
      
   }
   
   
   public com.commercetools.models.Zone.ZoneResourceIdentifier getZone(){
      return this.zone;
   }
   
   
   public java.util.List<com.commercetools.models.ShippingMethod.ShippingRateDraft> getShippingRates(){
      return this.shippingRates;
   }

   public void setZone(final com.commercetools.models.Zone.ZoneResourceIdentifier zone){
      this.zone = zone;
   }
   
   public void setShippingRates(final java.util.List<com.commercetools.models.ShippingMethod.ShippingRateDraft> shippingRates){
      this.shippingRates = shippingRates;
   }

}