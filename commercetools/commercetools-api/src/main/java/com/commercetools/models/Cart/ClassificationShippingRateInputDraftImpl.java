package com.commercetools.models.Cart;

import com.commercetools.models.Cart.ShippingRateInputDraft;
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
public final class ClassificationShippingRateInputDraftImpl implements ClassificationShippingRateInputDraft {

   private java.lang.String type;
   
   private java.lang.String key;

   @JsonCreator
   ClassificationShippingRateInputDraftImpl(@JsonProperty("key") final java.lang.String key) {
      this.key = key;
      this.type = "Classification";
   }
   public ClassificationShippingRateInputDraftImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setKey(final java.lang.String key){
      this.key = key;
   }

}