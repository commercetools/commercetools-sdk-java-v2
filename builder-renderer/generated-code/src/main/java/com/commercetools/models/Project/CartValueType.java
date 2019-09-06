package com.commercetools.models.Project;

import com.commercetools.models.Project.ShippingRateInputType;
import com.commercetools.models.ShippingMethod.ShippingRateTierType;
import com.commercetools.models.Project.CartValueTypeImpl;

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
@JsonDeserialize(as = CartValueTypeImpl.class)
public interface CartValueType extends ShippingRateInputType {


   
   public static CartValueTypeImpl of(){
      return new CartValueTypeImpl();
   }
   

   public static CartValueTypeImpl of(final CartValueType template) {
      CartValueTypeImpl instance = new CartValueTypeImpl();
      return instance;
   }

}