package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
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
public final class CustomerChangeAddressActionImpl implements CustomerChangeAddressAction {

   private String action;
   
   private com.commercetools.api.generated.models.common.Address address;
   
   private String addressId;

   @JsonCreator
   CustomerChangeAddressActionImpl(@JsonProperty("address") final com.commercetools.api.generated.models.common.Address address, @JsonProperty("addressId") final String addressId) {
      this.address = address;
      this.addressId = addressId;
      this.action = "changeAddress";
   }
   public CustomerChangeAddressActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }
   
   
   public String getAddressId(){
      return this.addressId;
   }

   public void setAddress(final com.commercetools.api.generated.models.common.Address address){
      this.address = address;
   }
   
   public void setAddressId(final String addressId){
      this.addressId = addressId;
   }

}