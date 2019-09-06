package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeDescriptionActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeDescriptionActionImpl.class)
public interface ProductTypeChangeDescriptionAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("description")
   public String getDescription();

   public void setDescription(final String description);
   
   public static ProductTypeChangeDescriptionActionImpl of(){
      return new ProductTypeChangeDescriptionActionImpl();
   }
   

   public static ProductTypeChangeDescriptionActionImpl of(final ProductTypeChangeDescriptionAction template) {
      ProductTypeChangeDescriptionActionImpl instance = new ProductTypeChangeDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      return instance;
   }

}