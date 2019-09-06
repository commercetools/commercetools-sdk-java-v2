package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetDefaultBillingAddressActionImpl;

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
@JsonDeserialize(as = CustomerSetDefaultBillingAddressActionImpl.class)
public interface CustomerSetDefaultBillingAddressAction extends CustomerUpdateAction {

   
   
   @JsonProperty("addressId")
   public String getAddressId();

   public void setAddressId(final String addressId);
   
   public static CustomerSetDefaultBillingAddressActionImpl of(){
      return new CustomerSetDefaultBillingAddressActionImpl();
   }
   

   public static CustomerSetDefaultBillingAddressActionImpl of(final CustomerSetDefaultBillingAddressAction template) {
      CustomerSetDefaultBillingAddressActionImpl instance = new CustomerSetDefaultBillingAddressActionImpl();
      instance.setAddressId(template.getAddressId());
      return instance;
   }

}