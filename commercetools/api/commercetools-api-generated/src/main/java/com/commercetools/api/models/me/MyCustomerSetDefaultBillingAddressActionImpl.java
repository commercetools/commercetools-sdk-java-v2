package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerSetDefaultBillingAddressActionImpl implements MyCustomerSetDefaultBillingAddressAction {

   private String action;
   
   private String addressId;

   @JsonCreator
   MyCustomerSetDefaultBillingAddressActionImpl(@JsonProperty("addressId") final String addressId) {
      this.addressId = addressId;
      this.action = "setDefaultBillingAddress";
   }
   public MyCustomerSetDefaultBillingAddressActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAddressId(){
      return this.addressId;
   }

   public void setAddressId(final String addressId){
      this.addressId = addressId;
   }

}
