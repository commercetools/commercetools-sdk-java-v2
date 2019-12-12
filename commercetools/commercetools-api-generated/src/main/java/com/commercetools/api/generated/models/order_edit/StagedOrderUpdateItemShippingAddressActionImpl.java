package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderUpdateItemShippingAddressActionImpl implements StagedOrderUpdateItemShippingAddressAction {

   private String action;
   
   private com.commercetools.api.generated.models.common.Address address;

   @JsonCreator
   StagedOrderUpdateItemShippingAddressActionImpl(@JsonProperty("address") final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      this.action = "updateItemShippingAddress";
   }
   public StagedOrderUpdateItemShippingAddressActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }

   public void setAddress(final com.commercetools.api.generated.models.common.Address address){
      this.address = address;
   }

}