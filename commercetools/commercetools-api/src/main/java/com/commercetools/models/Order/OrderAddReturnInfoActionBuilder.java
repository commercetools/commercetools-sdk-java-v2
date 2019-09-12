package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Order.ReturnItemDraft;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Order.OrderAddReturnInfoAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderAddReturnInfoActionBuilder {
   
   @Nullable
   private java.time.ZonedDateTime returnDate;
   
   @Nullable
   private java.lang.String returnTrackingId;
   
   
   private java.util.List<com.commercetools.models.Order.ReturnItemDraft> items;
   
   public OrderAddReturnInfoActionBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
      this.returnDate = returnDate;
      return this;
   }
   
   public OrderAddReturnInfoActionBuilder returnTrackingId(@Nullable final java.lang.String returnTrackingId) {
      this.returnTrackingId = returnTrackingId;
      return this;
   }
   
   public OrderAddReturnInfoActionBuilder items( final java.util.List<com.commercetools.models.Order.ReturnItemDraft> items) {
      this.items = items;
      return this;
   }
   
   @Nullable
   public java.time.ZonedDateTime getReturnDate(){
      return this.returnDate;
   }
   
   @Nullable
   public java.lang.String getReturnTrackingId(){
      return this.returnTrackingId;
   }
   
   
   public java.util.List<com.commercetools.models.Order.ReturnItemDraft> getItems(){
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