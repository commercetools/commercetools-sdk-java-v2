package com.commercetools.api.models.customer;


import com.commercetools.api.models.customer.CustomerEmailVerifyImpl;

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
@JsonDeserialize(as = CustomerEmailVerifyImpl.class)
public interface CustomerEmailVerify  {



   @JsonProperty("version")
   public Long getVersion();

   @NotNull
   @JsonProperty("tokenValue")
   public String getTokenValue();

   public void setVersion(final Long version);

   public void setTokenValue(final String tokenValue);

   public static CustomerEmailVerifyImpl of(){
      return new CustomerEmailVerifyImpl();
   }


   public static CustomerEmailVerifyImpl of(final CustomerEmailVerify template) {
      CustomerEmailVerifyImpl instance = new CustomerEmailVerifyImpl();
      instance.setTokenValue(template.getTokenValue());
      instance.setVersion(template.getVersion());
      return instance;
   }

}
