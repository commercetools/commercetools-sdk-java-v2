package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveLineItemActionImpl;

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
@JsonDeserialize(as = StagedOrderRemoveLineItemActionImpl.class)
public interface StagedOrderRemoveLineItemAction extends StagedOrderUpdateAction {


   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();


   @JsonProperty("quantity")
   public Integer getQuantity();

   @Valid
   @JsonProperty("externalPrice")
   public Money getExternalPrice();

   @Valid
   @JsonProperty("externalTotalPrice")
   public ExternalLineItemTotalPrice getExternalTotalPrice();

   @Valid
   @JsonProperty("shippingDetailsToRemove")
   public ItemShippingDetailsDraft getShippingDetailsToRemove();

   public void setLineItemId(final String lineItemId);

   public void setQuantity(final Integer quantity);

   public void setExternalPrice(final Money externalPrice);

   public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

   public void setShippingDetailsToRemove(final ItemShippingDetailsDraft shippingDetailsToRemove);

   public static StagedOrderRemoveLineItemActionImpl of(){
      return new StagedOrderRemoveLineItemActionImpl();
   }


   public static StagedOrderRemoveLineItemActionImpl of(final StagedOrderRemoveLineItemAction template) {
      StagedOrderRemoveLineItemActionImpl instance = new StagedOrderRemoveLineItemActionImpl();
      instance.setQuantity(template.getQuantity());
      instance.setExternalTotalPrice(template.getExternalTotalPrice());
      instance.setLineItemId(template.getLineItemId());
      instance.setShippingDetailsToRemove(template.getShippingDetailsToRemove());
      instance.setExternalPrice(template.getExternalPrice());
      return instance;
   }

}
