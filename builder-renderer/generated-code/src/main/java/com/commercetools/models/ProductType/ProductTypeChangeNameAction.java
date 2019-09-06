package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductTypeChangeNameActionImpl.class)
public interface ProductTypeChangeNameAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();

   public void setName(final String name);
   
   public static ProductTypeChangeNameActionImpl of(){
      return new ProductTypeChangeNameActionImpl();
   }
   

   public static ProductTypeChangeNameActionImpl of(final ProductTypeChangeNameAction template) {
      ProductTypeChangeNameActionImpl instance = new ProductTypeChangeNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}