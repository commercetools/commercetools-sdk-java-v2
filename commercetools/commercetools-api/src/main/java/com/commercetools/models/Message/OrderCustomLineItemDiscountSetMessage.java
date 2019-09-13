package com.commercetools.models.message;

import com.commercetools.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.models.cart.TaxedItemPrice;
import com.commercetools.models.message.Message;
import java.lang.String;
import com.commercetools.models.message.OrderCustomLineItemDiscountSetMessageImpl;

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
@JsonDeserialize(as = OrderCustomLineItemDiscountSetMessageImpl.class)
public interface OrderCustomLineItemDiscountSetMessage extends Message {

   
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
   
   public static OrderCustomLineItemDiscountSetMessageImpl of(){
      return new OrderCustomLineItemDiscountSetMessageImpl();
   }
   

   public static OrderCustomLineItemDiscountSetMessageImpl of(final OrderCustomLineItemDiscountSetMessage template) {
      OrderCustomLineItemDiscountSetMessageImpl instance = new OrderCustomLineItemDiscountSetMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setTaxedPrice(template.getTaxedPrice());
      instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
      return instance;
   }

}