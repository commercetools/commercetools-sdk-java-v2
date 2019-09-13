package com.commercetools.models.me;

import com.commercetools.models.common.Address;
import com.commercetools.models.me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCustomerChangeAddressActionImpl;

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
@JsonDeserialize(as = MyCustomerChangeAddressActionImpl.class)
public interface MyCustomerChangeAddressAction extends MyCustomerUpdateAction {

   
   @NotNull
   @JsonProperty("addressId")
   public String getAddressId();
   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddressId(final String addressId);
   
   public void setAddress(final Address address);
   
   public static MyCustomerChangeAddressActionImpl of(){
      return new MyCustomerChangeAddressActionImpl();
   }
   

   public static MyCustomerChangeAddressActionImpl of(final MyCustomerChangeAddressAction template) {
      MyCustomerChangeAddressActionImpl instance = new MyCustomerChangeAddressActionImpl();
      instance.setAddress(template.getAddress());
      instance.setAddressId(template.getAddressId());
      return instance;
   }

}