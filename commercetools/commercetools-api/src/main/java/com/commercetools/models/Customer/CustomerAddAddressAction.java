package com.commercetools.models.Customer;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerAddAddressActionImpl;

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
@JsonDeserialize(as = CustomerAddAddressActionImpl.class)
public interface CustomerAddAddressAction extends CustomerUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static CustomerAddAddressActionImpl of(){
      return new CustomerAddAddressActionImpl();
   }
   

   public static CustomerAddAddressActionImpl of(final CustomerAddAddressAction template) {
      CustomerAddAddressActionImpl instance = new CustomerAddAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}