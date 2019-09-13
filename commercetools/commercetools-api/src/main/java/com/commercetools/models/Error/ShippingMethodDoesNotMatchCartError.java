package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import java.lang.String;
import com.commercetools.models.error.ShippingMethodDoesNotMatchCartErrorImpl;

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
@JsonDeserialize(as = ShippingMethodDoesNotMatchCartErrorImpl.class)
public interface ShippingMethodDoesNotMatchCartError extends ErrorObject {


   
   public static ShippingMethodDoesNotMatchCartErrorImpl of(){
      return new ShippingMethodDoesNotMatchCartErrorImpl();
   }
   

   public static ShippingMethodDoesNotMatchCartErrorImpl of(final ShippingMethodDoesNotMatchCartError template) {
      ShippingMethodDoesNotMatchCartErrorImpl instance = new ShippingMethodDoesNotMatchCartErrorImpl();
      instance.setMessage(template.getMessage());
      return instance;
   }

}