package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderRemoveParcelFromDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderRemoveParcelFromDeliveryActionBuilder {
   
   
   private java.lang.String parcelId;
   
   public StagedOrderRemoveParcelFromDeliveryActionBuilder parcelId( final java.lang.String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   
   public java.lang.String getParcelId(){
      return this.parcelId;
   }

   public StagedOrderRemoveParcelFromDeliveryAction build() {
       return new StagedOrderRemoveParcelFromDeliveryActionImpl(parcelId);
   }
   
   public static StagedOrderRemoveParcelFromDeliveryActionBuilder of() {
      return new StagedOrderRemoveParcelFromDeliveryActionBuilder();
   }
   
   public static StagedOrderRemoveParcelFromDeliveryActionBuilder of(final StagedOrderRemoveParcelFromDeliveryAction template) {
      StagedOrderRemoveParcelFromDeliveryActionBuilder builder = new StagedOrderRemoveParcelFromDeliveryActionBuilder();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}