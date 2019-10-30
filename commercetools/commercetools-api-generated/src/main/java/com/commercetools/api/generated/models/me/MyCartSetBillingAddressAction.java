package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartSetBillingAddressActionImpl;

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
@JsonDeserialize(as = MyCartSetBillingAddressActionImpl.class)
public interface MyCartSetBillingAddressAction extends MyCartUpdateAction {

   
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static MyCartSetBillingAddressActionImpl of(){
      return new MyCartSetBillingAddressActionImpl();
   }
   

   public static MyCartSetBillingAddressActionImpl of(final MyCartSetBillingAddressAction template) {
      MyCartSetBillingAddressActionImpl instance = new MyCartSetBillingAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}