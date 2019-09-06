package com.commercetools.models.Message;

import com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.models.Cart.TaxedItemPrice;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.OrderCustomLineItemDiscountSetMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
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