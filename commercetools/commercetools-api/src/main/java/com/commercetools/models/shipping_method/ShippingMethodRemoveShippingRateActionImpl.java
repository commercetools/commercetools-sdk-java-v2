package com.commercetools.models.shipping_method;

import com.commercetools.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.models.shipping_method.ShippingRateDraft;
import com.commercetools.models.zone.ZoneResourceIdentifier;
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
public final class ShippingMethodRemoveShippingRateActionImpl implements ShippingMethodRemoveShippingRateAction {

   private String action;
   
   private com.commercetools.models.shipping_method.ShippingRateDraft shippingRate;
   
   private com.commercetools.models.zone.ZoneResourceIdentifier zone;

   @JsonCreator
   ShippingMethodRemoveShippingRateActionImpl(@JsonProperty("shippingRate") final com.commercetools.models.shipping_method.ShippingRateDraft shippingRate, @JsonProperty("zone") final com.commercetools.models.zone.ZoneResourceIdentifier zone) {
      this.shippingRate = shippingRate;
      this.zone = zone;
      this.action = "removeShippingRate";
   }
   public ShippingMethodRemoveShippingRateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.shipping_method.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   
   public com.commercetools.models.zone.ZoneResourceIdentifier getZone(){
      return this.zone;
   }

   public void setShippingRate(final com.commercetools.models.shipping_method.ShippingRateDraft shippingRate){
      this.shippingRate = shippingRate;
   }
   
   public void setZone(final com.commercetools.models.zone.ZoneResourceIdentifier zone){
      this.zone = zone;
   }

}