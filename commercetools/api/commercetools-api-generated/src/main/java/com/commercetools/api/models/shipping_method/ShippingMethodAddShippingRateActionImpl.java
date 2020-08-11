package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodAddShippingRateActionImpl implements ShippingMethodAddShippingRateAction {

   private String action;

   private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

   private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

   @JsonCreator
   ShippingMethodAddShippingRateActionImpl(@JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate, @JsonProperty("zone") final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
      this.shippingRate = shippingRate;
      this.zone = zone;
      this.action = "addShippingRate";
   }
   public ShippingMethodAddShippingRateActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }


   public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone(){
      return this.zone;
   }

   public void setShippingRate(final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate){
      this.shippingRate = shippingRate;
   }

   public void setZone(final com.commercetools.api.models.zone.ZoneResourceIdentifier zone){
      this.zone = zone;
   }

}
