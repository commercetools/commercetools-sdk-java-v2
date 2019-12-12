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
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodSetPredicateActionImpl implements ShippingMethodSetPredicateAction {

   private String action;
   
   private String predicate;

   @JsonCreator
   ShippingMethodSetPredicateActionImpl(@JsonProperty("predicate") final String predicate) {
      this.predicate = predicate;
      this.action = "setPredicate";
   }
   public ShippingMethodSetPredicateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>A valid Cart predicate.
   *  If <code>predicate</code> is absent or <code>null</code>, it is removed if it exists.</p>
   */
   public String getPredicate(){
      return this.predicate;
   }

   public void setPredicate(final String predicate){
      this.predicate = predicate;
   }

}