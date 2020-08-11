package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetDefaultBillingAddressActionImpl;

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
@JsonDeserialize(as = MyCustomerSetDefaultBillingAddressActionImpl.class)
public interface MyCustomerSetDefaultBillingAddressAction extends MyCustomerUpdateAction {



   @JsonProperty("addressId")
   public String getAddressId();

   public void setAddressId(final String addressId);

   public static MyCustomerSetDefaultBillingAddressActionImpl of(){
      return new MyCustomerSetDefaultBillingAddressActionImpl();
   }


   public static MyCustomerSetDefaultBillingAddressActionImpl of(final MyCustomerSetDefaultBillingAddressAction template) {
      MyCustomerSetDefaultBillingAddressActionImpl instance = new MyCustomerSetDefaultBillingAddressActionImpl();
      instance.setAddressId(template.getAddressId());
      return instance;
   }

}
