package com.commercetools.api.models.order;

import com.commercetools.api.models.order.CustomLineItemReturnItem;
import com.commercetools.api.models.order.LineItemReturnItem;
import com.commercetools.api.models.order.ReturnPaymentState;
import com.commercetools.api.models.order.ReturnShipmentState;
import java.time.ZonedDateTime;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.LineItemReturnItemImpl.class, name = "LineItemReturnItem"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.order.CustomLineItemReturnItemImpl.class, name = "CustomLineItemReturnItem")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type",
   defaultImpl = ReturnItemImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ReturnItem  {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @JsonProperty("quantity")
   public Long getQuantity();
   
   
   @JsonProperty("comment")
   public String getComment();
   
   @NotNull
   @JsonProperty("shipmentState")
   public ReturnShipmentState getShipmentState();
   
   @NotNull
   @JsonProperty("paymentState")
   public ReturnPaymentState getPaymentState();
   
   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();

   public void setId(final String id);
   
   public void setQuantity(final Long quantity);
   
   public void setComment(final String comment);
   
   public void setShipmentState(final ReturnShipmentState shipmentState);
   
   public void setPaymentState(final ReturnPaymentState paymentState);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   


}
