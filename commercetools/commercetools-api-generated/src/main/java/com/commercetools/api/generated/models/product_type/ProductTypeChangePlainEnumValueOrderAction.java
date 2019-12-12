package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributePlainEnumValue;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeChangePlainEnumValueOrderActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = ProductTypeChangePlainEnumValueOrderActionImpl.class)
public interface ProductTypeChangePlainEnumValueOrderAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("attributeName")
   public String getAttributeName();
   
   @NotNull
   @Valid
   @JsonProperty("values")
   public List<AttributePlainEnumValue> getValues();

   public void setAttributeName(final String attributeName);
   
   public void setValues(final List<AttributePlainEnumValue> values);
   
   public static ProductTypeChangePlainEnumValueOrderActionImpl of(){
      return new ProductTypeChangePlainEnumValueOrderActionImpl();
   }
   

   public static ProductTypeChangePlainEnumValueOrderActionImpl of(final ProductTypeChangePlainEnumValueOrderAction template) {
      ProductTypeChangePlainEnumValueOrderActionImpl instance = new ProductTypeChangePlainEnumValueOrderActionImpl();
      instance.setValues(template.getValues());
      instance.setAttributeName(template.getAttributeName());
      return instance;
   }

}