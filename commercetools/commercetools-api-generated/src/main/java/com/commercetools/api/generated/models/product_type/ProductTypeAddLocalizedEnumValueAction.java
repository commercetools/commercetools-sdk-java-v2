package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeAddLocalizedEnumValueActionImpl;

import com.fasterxml.jackson.annotation.*;
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
@JsonDeserialize(as = ProductTypeAddLocalizedEnumValueActionImpl.class)
public interface ProductTypeAddLocalizedEnumValueAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("attributeName")
   public String getAttributeName();
   
   @NotNull
   @Valid
   @JsonProperty("value")
   public AttributeLocalizedEnumValue getValue();

   public void setAttributeName(final String attributeName);
   
   public void setValue(final AttributeLocalizedEnumValue value);
   
   public static ProductTypeAddLocalizedEnumValueActionImpl of(){
      return new ProductTypeAddLocalizedEnumValueActionImpl();
   }
   

   public static ProductTypeAddLocalizedEnumValueActionImpl of(final ProductTypeAddLocalizedEnumValueAction template) {
      ProductTypeAddLocalizedEnumValueActionImpl instance = new ProductTypeAddLocalizedEnumValueActionImpl();
      instance.setAttributeName(template.getAttributeName());
      instance.setValue(template.getValue());
      return instance;
   }

}