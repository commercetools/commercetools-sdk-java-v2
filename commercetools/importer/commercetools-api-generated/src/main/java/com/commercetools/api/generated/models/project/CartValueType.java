package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ShippingRateInputType;
import com.commercetools.api.generated.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.generated.models.project.CartValueTypeImpl;

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