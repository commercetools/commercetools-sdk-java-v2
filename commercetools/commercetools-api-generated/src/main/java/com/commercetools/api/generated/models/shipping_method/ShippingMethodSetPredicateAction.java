package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodSetPredicateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodSetPredicateActionImpl.class)
public interface ShippingMethodSetPredicateAction extends ShippingMethodUpdateAction {

   
   
   @JsonProperty("predicate")
   public String getPredicate();

   public void setPredicate(final String predicate);
   
   public static ShippingMethodSetPredicateActionImpl of(){
      return new ShippingMethodSetPredicateActionImpl();
   }
   

   public static ShippingMethodSetPredicateActionImpl of(final ShippingMethodSetPredicateAction template) {
      ShippingMethodSetPredicateActionImpl instance = new ShippingMethodSetPredicateActionImpl();
      instance.setPredicate(template.getPredicate());
      return instance;
   }

}