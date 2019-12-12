package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.generated.models.zone.ZoneResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ZoneRateDraftImpl implements ZoneRateDraft {

   private com.commercetools.api.generated.models.zone.ZoneResourceIdentifier zone;
   
   private java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRateDraft> shippingRates;

   @JsonCreator
   ZoneRateDraftImpl(@JsonProperty("zone") final com.commercetools.api.generated.models.zone.ZoneResourceIdentifier zone, @JsonProperty("shippingRates") final java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRateDraft> shippingRates) {
      this.zone = zone;
      this.shippingRates = shippingRates;
   }
   public ZoneRateDraftImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.zone.ZoneResourceIdentifier getZone(){
      return this.zone;
   }
   
   /**
   *  <p>The array must not contain two shipping rates with the same currency.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRateDraft> getShippingRates(){
      return this.shippingRates;
   }

   public void setZone(final com.commercetools.api.generated.models.zone.ZoneResourceIdentifier zone){
      this.zone = zone;
   }
   
   public void setShippingRates(final java.util.List<com.commercetools.api.generated.models.shipping_method.ShippingRateDraft> shippingRates){
      this.shippingRates = shippingRates;
   }

}