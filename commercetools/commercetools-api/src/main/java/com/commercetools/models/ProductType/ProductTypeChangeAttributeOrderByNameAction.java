package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeAttributeOrderByNameActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeAttributeOrderByNameActionImpl.class)
public interface ProductTypeChangeAttributeOrderByNameAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("attributeNames")
   public List<String> getAttributeNames();

   public void setAttributeNames(final List<String> attributeNames);
   
   public static ProductTypeChangeAttributeOrderByNameActionImpl of(){
      return new ProductTypeChangeAttributeOrderByNameActionImpl();
   }
   

   public static ProductTypeChangeAttributeOrderByNameActionImpl of(final ProductTypeChangeAttributeOrderByNameAction template) {
      ProductTypeChangeAttributeOrderByNameActionImpl instance = new ProductTypeChangeAttributeOrderByNameActionImpl();
      instance.setAttributeNames(template.getAttributeNames());
      return instance;
   }

}