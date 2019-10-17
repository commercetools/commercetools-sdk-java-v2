package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartRemoveItemShippingAddressActionImpl;

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
@JsonDeserialize(as = MyCartRemoveItemShippingAddressActionImpl.class)
public interface MyCartRemoveItemShippingAddressAction extends MyCartUpdateAction {

   
   @NotNull
   @JsonProperty("addressKey")
   public String getAddressKey();

   public void setAddressKey(final String addressKey);
   
   public static MyCartRemoveItemShippingAddressActionImpl of(){
      return new MyCartRemoveItemShippingAddressActionImpl();
   }
   

   public static MyCartRemoveItemShippingAddressActionImpl of(final MyCartRemoveItemShippingAddressAction template) {
      MyCartRemoveItemShippingAddressActionImpl instance = new MyCartRemoveItemShippingAddressActionImpl();
      instance.setAddressKey(template.getAddressKey());
      return instance;
   }

}