package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import com.commercetools.api.generated.models.customer.CustomerRemoveBillingAddressIdActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = CustomerRemoveBillingAddressIdActionImpl.class)
public interface CustomerRemoveBillingAddressIdAction extends CustomerUpdateAction {

   
   @NotNull
   @JsonProperty("addressId")
   public String getAddressId();

   public void setAddressId(final String addressId);
   
   public static CustomerRemoveBillingAddressIdActionImpl of(){
      return new CustomerRemoveBillingAddressIdActionImpl();
   }
   

   public static CustomerRemoveBillingAddressIdActionImpl of(final CustomerRemoveBillingAddressIdAction template) {
      CustomerRemoveBillingAddressIdActionImpl instance = new CustomerRemoveBillingAddressIdActionImpl();
      instance.setAddressId(template.getAddressId());
      return instance;
   }

}