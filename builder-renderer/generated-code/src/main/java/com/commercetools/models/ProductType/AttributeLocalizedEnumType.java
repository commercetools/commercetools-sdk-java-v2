package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeLocalizedEnumValue;
import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeLocalizedEnumTypeImpl;

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
@JsonDeserialize(as = AttributeLocalizedEnumTypeImpl.class)
public interface AttributeLocalizedEnumType extends AttributeType {

   
   @NotNull
   @Valid
   @JsonProperty("values")
   public List<AttributeLocalizedEnumValue> getValues();

   public void setValues(final List<AttributeLocalizedEnumValue> values);
   
   public static AttributeLocalizedEnumTypeImpl of(){
      return new AttributeLocalizedEnumTypeImpl();
   }
   

   public static AttributeLocalizedEnumTypeImpl of(final AttributeLocalizedEnumType template) {
      AttributeLocalizedEnumTypeImpl instance = new AttributeLocalizedEnumTypeImpl();
      instance.setValues(template.getValues());
      return instance;
   }

}