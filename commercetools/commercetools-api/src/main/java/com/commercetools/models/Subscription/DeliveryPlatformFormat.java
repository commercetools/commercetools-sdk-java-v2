package com.commercetools.models.subscription;

import com.commercetools.models.subscription.DeliveryFormat;
import java.lang.String;
import com.commercetools.models.subscription.DeliveryPlatformFormatImpl;

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
@JsonDeserialize(as = DeliveryPlatformFormatImpl.class)
public interface DeliveryPlatformFormat extends DeliveryFormat {


   
   public static DeliveryPlatformFormatImpl of(){
      return new DeliveryPlatformFormatImpl();
   }
   

   public static DeliveryPlatformFormatImpl of(final DeliveryPlatformFormat template) {
      DeliveryPlatformFormatImpl instance = new DeliveryPlatformFormatImpl();
      return instance;
   }

}