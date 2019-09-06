package com.commercetools.models.Order;

import com.commercetools.models.Order.ReturnItem;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Order.ReturnInfo;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReturnInfoBuilder {
   
   @Nullable
   private java.time.ZonedDateTime returnDate;
   
   @Nullable
   private java.lang.String returnTrackingId;
   
   
   private java.util.List<com.commercetools.models.Order.ReturnItem> items;
   
   public ReturnInfoBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
      this.returnDate = returnDate;
      return this;
   }
   
   public ReturnInfoBuilder returnTrackingId(@Nullable final java.lang.String returnTrackingId) {
      this.returnTrackingId = returnTrackingId;
      return this;
   }
   
   public ReturnInfoBuilder items( final java.util.List<com.commercetools.models.Order.ReturnItem> items) {
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
   
   
   public java.util.List<com.commercetools.models.Order.ReturnItem> getItems(){
      return this.items;
   }

   public ReturnInfo build() {
       return new ReturnInfoImpl(returnDate, returnTrackingId, items);
   }
   
   public static ReturnInfoBuilder of() {
      return new ReturnInfoBuilder();
   }
   
   public static ReturnInfoBuilder of(final ReturnInfo template) {
      ReturnInfoBuilder builder = new ReturnInfoBuilder();
      builder.returnDate = template.getReturnDate();
      builder.returnTrackingId = template.getReturnTrackingId();
      builder.items = template.getItems();
      return builder;
   }
   
}