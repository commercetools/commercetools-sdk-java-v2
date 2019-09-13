package com.commercetools.models.shipping_method;

import com.commercetools.models.shipping_method.ShippingMethodUpdateAction;
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
public final class ShippingMethodSetPredicateActionImpl implements ShippingMethodSetPredicateAction {

   private java.lang.String action;
   
   private java.lang.String predicate;

   @JsonCreator
   ShippingMethodSetPredicateActionImpl(@JsonProperty("predicate") final java.lang.String predicate) {
      this.predicate = predicate;
      this.action = "setPredicate";
   }
   public ShippingMethodSetPredicateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getPredicate(){
      return this.predicate;
   }

   public void setPredicate(final java.lang.String predicate){
      this.predicate = predicate;
   }

}