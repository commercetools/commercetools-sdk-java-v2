package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import com.commercetools.models.ShippingMethod.ShippingRateDraft;
import com.commercetools.models.Zone.ZoneResourceIdentifier;
import java.lang.String;
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
public final class ShippingMethodRemoveShippingRateActionImpl implements ShippingMethodRemoveShippingRateAction {

   private java.lang.String action;
   
   private com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate;
   
   private com.commercetools.models.Zone.ZoneResourceIdentifier zone;

   @JsonCreator
   ShippingMethodRemoveShippingRateActionImpl(@JsonProperty("shippingRate") final com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate, @JsonProperty("zone") final com.commercetools.models.Zone.ZoneResourceIdentifier zone) {
      this.shippingRate = shippingRate;
      this.zone = zone;
      this.action = "removeShippingRate";
   }
   public ShippingMethodRemoveShippingRateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   
   public com.commercetools.models.Zone.ZoneResourceIdentifier getZone(){
      return this.zone;
   }

   public void setShippingRate(final com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate){
      this.shippingRate = shippingRate;
   }
   
   public void setZone(final com.commercetools.models.Zone.ZoneResourceIdentifier zone){
      this.zone = zone;
   }

}