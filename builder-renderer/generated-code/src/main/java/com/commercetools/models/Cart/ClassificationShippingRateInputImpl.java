package com.commercetools.models.Cart;

import com.commercetools.models.Cart.ShippingRateInput;
import com.commercetools.models.Common.LocalizedString;
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
public final class ClassificationShippingRateInputImpl implements ClassificationShippingRateInput {

   private java.lang.String type;
   
   private com.commercetools.models.Common.LocalizedString label;
   
   private java.lang.String key;

   @JsonCreator
   ClassificationShippingRateInputImpl(@JsonProperty("label") final com.commercetools.models.Common.LocalizedString label, @JsonProperty("key") final java.lang.String key) {
      this.label = label;
      this.key = key;
      this.type = "Classification";
   }
   public ClassificationShippingRateInputImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setLabel(final com.commercetools.models.Common.LocalizedString label){
      this.label = label;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}