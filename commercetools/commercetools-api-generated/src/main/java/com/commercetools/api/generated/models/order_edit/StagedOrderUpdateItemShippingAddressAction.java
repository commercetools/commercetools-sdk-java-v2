package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderUpdateItemShippingAddressActionImpl;

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
@JsonDeserialize(as = StagedOrderUpdateItemShippingAddressActionImpl.class)
public interface StagedOrderUpdateItemShippingAddressAction extends StagedOrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static StagedOrderUpdateItemShippingAddressActionImpl of(){
      return new StagedOrderUpdateItemShippingAddressActionImpl();
   }
   

   public static StagedOrderUpdateItemShippingAddressActionImpl of(final StagedOrderUpdateItemShippingAddressAction template) {
      StagedOrderUpdateItemShippingAddressActionImpl instance = new StagedOrderUpdateItemShippingAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}