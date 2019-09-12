package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeAttributeNameActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeAttributeNameActionImpl.class)
public interface ProductTypeChangeAttributeNameAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("attributeName")
   public String getAttributeName();
   
   @NotNull
   @JsonProperty("newAttributeName")
   public String getNewAttributeName();

   public void setAttributeName(final String attributeName);
   
   public void setNewAttributeName(final String newAttributeName);
   
   public static ProductTypeChangeAttributeNameActionImpl of(){
      return new ProductTypeChangeAttributeNameActionImpl();
   }
   

   public static ProductTypeChangeAttributeNameActionImpl of(final ProductTypeChangeAttributeNameAction template) {
      ProductTypeChangeAttributeNameActionImpl instance = new ProductTypeChangeAttributeNameActionImpl();
      instance.setNewAttributeName(template.getNewAttributeName());
      instance.setAttributeName(template.getAttributeName());
      return instance;
   }

}