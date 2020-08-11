package com.commercetools.api.models.customer;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerChangeAddressActionImpl;

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
@JsonDeserialize(as = CustomerChangeAddressActionImpl.class)
public interface CustomerChangeAddressAction extends CustomerUpdateAction {


   @NotNull
   @JsonProperty("addressId")
   public String getAddressId();

   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddressId(final String addressId);

   public void setAddress(final Address address);

   public static CustomerChangeAddressActionImpl of(){
      return new CustomerChangeAddressActionImpl();
   }


   public static CustomerChangeAddressActionImpl of(final CustomerChangeAddressAction template) {
      CustomerChangeAddressActionImpl instance = new CustomerChangeAddressActionImpl();
      instance.setAddress(template.getAddress());
      instance.setAddressId(template.getAddressId());
      return instance;
   }

}
