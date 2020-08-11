package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderAddItemShippingAddressActionImpl;

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
@JsonDeserialize(as = StagedOrderAddItemShippingAddressActionImpl.class)
public interface StagedOrderAddItemShippingAddressAction extends StagedOrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static StagedOrderAddItemShippingAddressActionImpl of(){
      return new StagedOrderAddItemShippingAddressActionImpl();
   }
   

   public static StagedOrderAddItemShippingAddressActionImpl of(final StagedOrderAddItemShippingAddressAction template) {
      StagedOrderAddItemShippingAddressActionImpl instance = new StagedOrderAddItemShippingAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}
