package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodRemoveZoneActionImpl implements ShippingMethodRemoveZoneAction {

   private java.lang.String action;
   
   private com.commercetools.models.Zone.ZoneResourceIdentifier zone;

   @JsonCreator
   ShippingMethodRemoveZoneActionImpl(@JsonProperty("zone") final com.commercetools.models.Zone.ZoneResourceIdentifier zone) {
      this.zone = zone;
      this.action = "removeZone";
   }
   public ShippingMethodRemoveZoneActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Zone.ZoneResourceIdentifier getZone(){
      return this.zone;
   }

   public void setZone(final com.commercetools.models.Zone.ZoneResourceIdentifier zone){
      this.zone = zone;
   }

}