package com.commercetools.models.Project;

import com.commercetools.models.Project.ShippingRateInputType;
import com.commercetools.models.ShippingMethod.ShippingRateTierType;
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
public final class CartValueTypeImpl implements CartValueType {

   private com.commercetools.models.ShippingMethod.ShippingRateTierType type;

   @JsonCreator
   CartValueTypeImpl() {
      this.type = ShippingRateTierType.findEnumViaJsonName("CartValue").get();
   }
   
   
   
   public com.commercetools.models.ShippingMethod.ShippingRateTierType getType(){
      return this.type;
   }


}