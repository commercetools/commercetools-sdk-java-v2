package com.commercetools.api.models.customer;


import com.commercetools.api.models.customer.CustomerCreateEmailTokenImpl;

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
@JsonDeserialize(as = CustomerCreateEmailTokenImpl.class)
public interface CustomerCreateEmailToken  {


   @NotNull
   @JsonProperty("id")
   public String getId();


   @JsonProperty("version")
   public Long getVersion();

   @NotNull
   @JsonProperty("ttlMinutes")
   public Long getTtlMinutes();

   public void setId(final String id);

   public void setVersion(final Long version);

   public void setTtlMinutes(final Long ttlMinutes);

   public static CustomerCreateEmailTokenImpl of(){
      return new CustomerCreateEmailTokenImpl();
   }


   public static CustomerCreateEmailTokenImpl of(final CustomerCreateEmailToken template) {
      CustomerCreateEmailTokenImpl instance = new CustomerCreateEmailTokenImpl();
      instance.setTtlMinutes(template.getTtlMinutes());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      return instance;
   }

}
