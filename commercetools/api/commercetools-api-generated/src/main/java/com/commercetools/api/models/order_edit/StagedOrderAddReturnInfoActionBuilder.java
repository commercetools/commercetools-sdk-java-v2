package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.ReturnItemDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order_edit.StagedOrderAddReturnInfoAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderAddReturnInfoActionBuilder {

   @Nullable
   private java.time.ZonedDateTime returnDate;

   @Nullable
   private String returnTrackingId;


   private java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items;

   public StagedOrderAddReturnInfoActionBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
      this.returnDate = returnDate;
      return this;
   }

   public StagedOrderAddReturnInfoActionBuilder returnTrackingId(@Nullable final String returnTrackingId) {
      this.returnTrackingId = returnTrackingId;
      return this;
   }

   public StagedOrderAddReturnInfoActionBuilder items( final java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items) {
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


   public java.util.List<com.commercetools.api.models.order.ReturnItemDraft> getItems(){
      return this.items;
   }

   public StagedOrderAddReturnInfoAction build() {
       return new StagedOrderAddReturnInfoActionImpl(returnDate, returnTrackingId, items);
   }

   public static StagedOrderAddReturnInfoActionBuilder of() {
      return new StagedOrderAddReturnInfoActionBuilder();
   }

   public static StagedOrderAddReturnInfoActionBuilder of(final StagedOrderAddReturnInfoAction template) {
      StagedOrderAddReturnInfoActionBuilder builder = new StagedOrderAddReturnInfoActionBuilder();
      builder.returnDate = template.getReturnDate();
      builder.returnTrackingId = template.getReturnTrackingId();
      builder.items = template.getItems();
      return builder;
   }

}
