package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.generated.models.cart.TaxedItemPrice;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.OrderCustomLineItemDiscountSetMessagePayloadImpl;

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
@JsonDeserialize(as = OrderCustomLineItemDiscountSetMessagePayloadImpl.class)
public interface OrderCustomLineItemDiscountSetMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @NotNull
   @Valid
   @JsonProperty("discountedPricePerQuantity")
   public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();
   
   @Valid
   @JsonProperty("taxedPrice")
   public TaxedItemPrice getTaxedPrice();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setDiscountedPricePerQuantity(final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);
   
   public void setTaxedPrice(final TaxedItemPrice taxedPrice);
   
   public static OrderCustomLineItemDiscountSetMessagePayloadImpl of(){
      return new OrderCustomLineItemDiscountSetMessagePayloadImpl();
   }
   

   public static OrderCustomLineItemDiscountSetMessagePayloadImpl of(final OrderCustomLineItemDiscountSetMessagePayload template) {
      OrderCustomLineItemDiscountSetMessagePayloadImpl instance = new OrderCustomLineItemDiscountSetMessagePayloadImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setTaxedPrice(template.getTaxedPrice());
      instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
      return instance;
   }

}