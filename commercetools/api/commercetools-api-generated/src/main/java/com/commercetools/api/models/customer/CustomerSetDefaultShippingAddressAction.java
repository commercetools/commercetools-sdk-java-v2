package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetDefaultShippingAddressActionImpl;

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
@JsonDeserialize(as = CustomerSetDefaultShippingAddressActionImpl.class)
public interface CustomerSetDefaultShippingAddressAction extends CustomerUpdateAction {

   /**
   *  <p>If not defined, the customer's <code>defaultShippingAddress</code> is unset.</p>
   */

   @JsonProperty("addressId")
   public String getAddressId();

   public void setAddressId(final String addressId);

   public static CustomerSetDefaultShippingAddressActionImpl of(){
      return new CustomerSetDefaultShippingAddressActionImpl();
   }


   public static CustomerSetDefaultShippingAddressActionImpl of(final CustomerSetDefaultShippingAddressAction template) {
      CustomerSetDefaultShippingAddressActionImpl instance = new CustomerSetDefaultShippingAddressActionImpl();
      instance.setAddressId(template.getAddressId());
      return instance;
   }

}
