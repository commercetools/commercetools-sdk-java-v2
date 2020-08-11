package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressActionImpl;

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
@JsonDeserialize(as = StagedOrderSetDeliveryAddressActionImpl.class)
public interface StagedOrderSetDeliveryAddressAction extends StagedOrderUpdateAction {


   @NotNull
   @JsonProperty("deliveryId")
   public String getDeliveryId();

   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setDeliveryId(final String deliveryId);

   public void setAddress(final Address address);

   public static StagedOrderSetDeliveryAddressActionImpl of(){
      return new StagedOrderSetDeliveryAddressActionImpl();
   }


   public static StagedOrderSetDeliveryAddressActionImpl of(final StagedOrderSetDeliveryAddressAction template) {
      StagedOrderSetDeliveryAddressActionImpl instance = new StagedOrderSetDeliveryAddressActionImpl();
      instance.setDeliveryId(template.getDeliveryId());
      instance.setAddress(template.getAddress());
      return instance;
   }

}
