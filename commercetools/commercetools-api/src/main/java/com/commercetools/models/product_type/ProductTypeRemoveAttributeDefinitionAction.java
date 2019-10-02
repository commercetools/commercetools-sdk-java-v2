package com.commercetools.models.product_type;

import com.commercetools.models.product_type.ProductTypeUpdateAction;
import com.commercetools.models.product_type.ProductTypeRemoveAttributeDefinitionActionImpl;

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
@JsonDeserialize(as = ProductTypeRemoveAttributeDefinitionActionImpl.class)
public interface ProductTypeRemoveAttributeDefinitionAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();

   public void setName(final String name);
   
   public static ProductTypeRemoveAttributeDefinitionActionImpl of(){
      return new ProductTypeRemoveAttributeDefinitionActionImpl();
   }
   

   public static ProductTypeRemoveAttributeDefinitionActionImpl of(final ProductTypeRemoveAttributeDefinitionAction template) {
      ProductTypeRemoveAttributeDefinitionActionImpl instance = new ProductTypeRemoveAttributeDefinitionActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}