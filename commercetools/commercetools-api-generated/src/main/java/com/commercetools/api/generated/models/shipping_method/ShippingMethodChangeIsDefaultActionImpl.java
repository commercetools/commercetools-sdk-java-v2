package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class ShippingMethodChangeIsDefaultActionImpl implements ShippingMethodChangeIsDefaultAction {

   private String action;
   
   private Boolean isDefault;

   @JsonCreator
   ShippingMethodChangeIsDefaultActionImpl(@JsonProperty("isDefault") final Boolean isDefault) {
      this.isDefault = isDefault;
      this.action = "changeIsDefault";
   }
   public ShippingMethodChangeIsDefaultActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Boolean getIsDefault(){
      return this.isDefault;
   }

   public void setIsDefault(final Boolean isDefault){
      this.isDefault = isDefault;
   }

}