package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCustomerRemoveAddressActionImpl;

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
@JsonDeserialize(as = MyCustomerRemoveAddressActionImpl.class)
public interface MyCustomerRemoveAddressAction extends MyCustomerUpdateAction {

   
   @NotNull
   @JsonProperty("addressId")
   public String getAddressId();

   public void setAddressId(final String addressId);
   
   public static MyCustomerRemoveAddressActionImpl of(){
      return new MyCustomerRemoveAddressActionImpl();
   }
   

   public static MyCustomerRemoveAddressActionImpl of(final MyCustomerRemoveAddressAction template) {
      MyCustomerRemoveAddressActionImpl instance = new MyCustomerRemoveAddressActionImpl();
      instance.setAddressId(template.getAddressId());
      return instance;
   }

}