package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeRemoveEnumValuesActionImpl;

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
@JsonDeserialize(as = ProductTypeRemoveEnumValuesActionImpl.class)
public interface ProductTypeRemoveEnumValuesAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("attributeName")
   public String getAttributeName();
   
   @NotNull
   @JsonProperty("keys")
   public List<String> getKeys();

   public void setAttributeName(final String attributeName);
   
   public void setKeys(final List<String> keys);
   
   public static ProductTypeRemoveEnumValuesActionImpl of(){
      return new ProductTypeRemoveEnumValuesActionImpl();
   }
   

   public static ProductTypeRemoveEnumValuesActionImpl of(final ProductTypeRemoveEnumValuesAction template) {
      ProductTypeRemoveEnumValuesActionImpl instance = new ProductTypeRemoveEnumValuesActionImpl();
      instance.setKeys(template.getKeys());
      instance.setAttributeName(template.getAttributeName());
      return instance;
   }

}