package com.commercetools.models.Project;

import com.commercetools.models.Project.ShippingRateInputType;
import com.commercetools.models.ShippingMethod.ShippingRateTierType;
import com.commercetools.models.Type.CustomFieldLocalizedEnumValue;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartClassificationTypeImpl implements CartClassificationType {

   private com.commercetools.models.ShippingMethod.ShippingRateTierType type;
   
   private java.util.List<com.commercetools.models.Type.CustomFieldLocalizedEnumValue> values;

   @JsonCreator
   CartClassificationTypeImpl(@JsonProperty("values") final java.util.List<com.commercetools.models.Type.CustomFieldLocalizedEnumValue> values) {
      this.values = values;
      this.type = ShippingRateTierType.findEnumViaJsonName("CartClassification").get();
   }
   public CartClassificationTypeImpl() {
      
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingRateTierType getType(){
      return this.type;
   }
   
   
   public java.util.List<com.commercetools.models.Type.CustomFieldLocalizedEnumValue> getValues(){
      return this.values;
   }

   public void setValues(final java.util.List<com.commercetools.models.Type.CustomFieldLocalizedEnumValue> values){
      this.values = values;
   }

}