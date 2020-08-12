package com.commercetools.api.models.me;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerAddAddressActionImpl;

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
@JsonDeserialize(as = MyCustomerAddAddressActionImpl.class)
public interface MyCustomerAddAddressAction extends MyCustomerUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static MyCustomerAddAddressActionImpl of(){
      return new MyCustomerAddAddressActionImpl();
   }
   

   public static MyCustomerAddAddressActionImpl of(final MyCustomerAddAddressAction template) {
      MyCustomerAddAddressActionImpl instance = new MyCustomerAddAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}
