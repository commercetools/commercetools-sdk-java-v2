package com.commercetools.models.order_edit;

import com.commercetools.models.common.Address;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderSetShippingAddressActionImpl;

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
@JsonDeserialize(as = StagedOrderSetShippingAddressActionImpl.class)
public interface StagedOrderSetShippingAddressAction extends StagedOrderUpdateAction {

   
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static StagedOrderSetShippingAddressActionImpl of(){
      return new StagedOrderSetShippingAddressActionImpl();
   }
   

   public static StagedOrderSetShippingAddressActionImpl of(final StagedOrderSetShippingAddressAction template) {
      StagedOrderSetShippingAddressActionImpl instance = new StagedOrderSetShippingAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}