package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.ReturnItem;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.order.ReturnInfo;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReturnInfoBuilder {
   
   @Nullable
   private java.time.ZonedDateTime returnDate;
   
   @Nullable
   private String returnTrackingId;
   
   
   private java.util.List<com.commercetools.api.generated.models.order.ReturnItem> items;
   
   public ReturnInfoBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
      this.returnDate = returnDate;
      return this;
   }
   
   public ReturnInfoBuilder returnTrackingId(@Nullable final String returnTrackingId) {
      this.returnTrackingId = returnTrackingId;
      return this;
   }
   
   public ReturnInfoBuilder items( final java.util.List<com.commercetools.api.generated.models.order.ReturnItem> items) {
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
   
   
   public java.util.List<com.commercetools.api.generated.models.order.ReturnItem> getItems(){
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