package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.product.ProductSetKeyActionImpl;

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
@JsonDeserialize(as = ProductSetKeyActionImpl.class)
public interface ProductSetKeyAction extends ProductUpdateAction {

   
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static ProductSetKeyActionImpl of(){
      return new ProductSetKeyActionImpl();
   }
   

   public static ProductSetKeyActionImpl of(final ProductSetKeyAction template) {
      ProductSetKeyActionImpl instance = new ProductSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}