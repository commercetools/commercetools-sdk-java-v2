package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
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
public final class ShippingMethodUpdateImpl implements ShippingMethodUpdate {

   private Long version;
   
   private java.util.List<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction> actions;

   @JsonCreator
   ShippingMethodUpdateImpl(@JsonProperty("version") final Long version, @JsonProperty("actions") final java.util.List<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction> actions) {
      this.version = version;
      this.actions = actions;
   }
   public ShippingMethodUpdateImpl() {
      
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public java.util.List<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction> getActions(){
      return this.actions;
   }

   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setActions(final java.util.List<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction> actions){
      this.actions = actions;
   }

}
