package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributePlainEnumValue;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeAddPlainEnumValueActionImpl;

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
@JsonDeserialize(as = ProductTypeAddPlainEnumValueActionImpl.class)
public interface ProductTypeAddPlainEnumValueAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("attributeName")
   public String getAttributeName();
   
   @NotNull
   @Valid
   @JsonProperty("value")
   public AttributePlainEnumValue getValue();

   public void setAttributeName(final String attributeName);
   
   public void setValue(final AttributePlainEnumValue value);
   
   public static ProductTypeAddPlainEnumValueActionImpl of(){
      return new ProductTypeAddPlainEnumValueActionImpl();
   }
   

   public static ProductTypeAddPlainEnumValueActionImpl of(final ProductTypeAddPlainEnumValueAction template) {
      ProductTypeAddPlainEnumValueActionImpl instance = new ProductTypeAddPlainEnumValueActionImpl();
      instance.setAttributeName(template.getAttributeName());
      instance.setValue(template.getValue());
      return instance;
   }

}