package com.commercetools.models.Order;

import com.commercetools.models.Order.CustomLineItemReturnItem;
import com.commercetools.models.Order.LineItemReturnItem;
import com.commercetools.models.Order.ReturnPaymentState;
import com.commercetools.models.Order.ReturnShipmentState;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Order.CustomLineItemReturnItemImpl.class, name = "CustomLineItemReturnItem"),
   @JsonSubTypes.Type(value = com.commercetools.models.Order.LineItemReturnItemImpl.class, name = "LineItemReturnItem")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type"
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