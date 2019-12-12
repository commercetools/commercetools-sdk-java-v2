package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.ReturnItemDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.order.OrderAddReturnInfoAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderAddReturnInfoActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime returnDate;
   
   @Nullable
   private String returnTrackingId;
   
   
   private java.util.List<com.commercetools.api.generated.models.order.ReturnItemDraft> items;
   
   public OrderAddReturnInfoActionBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
      this.returnDate = returnDate;
      return this;
   }
   
   public OrderAddReturnInfoActionBuilder returnTrackingId(@Nullable final String returnTrackingId) {
      this.returnTrackingId = returnTrackingId;
      return this;
   }
   
   public OrderAddReturnInfoActionBuilder items( final java.util.List<com.commercetools.api.generated.models.order.ReturnItemDraft> items) {
      this.items = items;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getReturnDate(){
      return this.returnDate;
   }
   
   @Nullable
   public String getReturnTrackingId(){
      return this.returnTrackingId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.ReturnItemDraft> getItems(){
      return this.items;
   }

   public OrderAddReturnInfoAction build() {
       return new OrderAddReturnInfoActionImpl(returnDate, returnTrackingId, items);
   }
   
   public static OrderAddReturnInfoActionBuilder of() {
      return new OrderAddReturnInfoActionBuilder();
   }
   
   public static OrderAddReturnInfoActionBuilder of(final OrderAddReturnInfoAction template) {
      OrderAddReturnInfoActionBuilder builder = new OrderAddReturnInfoActionBuilder();
      builder.returnDate = template.getReturnDate();
      builder.returnTrackingId = template.getReturnTrackingId();
      builder.items = template.getItems();
      return builder;
   }
   
}