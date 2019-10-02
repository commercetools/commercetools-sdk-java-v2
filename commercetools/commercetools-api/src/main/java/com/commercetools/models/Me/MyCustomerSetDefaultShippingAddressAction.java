package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import com.commercetools.models.me.MyCustomerSetDefaultShippingAddressActionImpl;

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
@JsonDeserialize(as = MyCustomerSetDefaultShippingAddressActionImpl.class)
public interface MyCustomerSetDefaultShippingAddressAction extends MyCustomerUpdateAction {

   
   
   @JsonProperty("addressId")
   public String getAddressId();

   public void setAddressId(final String addressId);
   
   public static MyCustomerSetDefaultShippingAddressActionImpl of(){
      return new MyCustomerSetDefaultShippingAddressActionImpl();
   }
   

   public static MyCustomerSetDefaultShippingAddressActionImpl of(final MyCustomerSetDefaultShippingAddressAction template) {
      MyCustomerSetDefaultShippingAddressActionImpl instance = new MyCustomerSetDefaultShippingAddressActionImpl();
      instance.setAddressId(template.getAddressId());
      return instance;
   }

}