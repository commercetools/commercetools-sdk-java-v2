package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderRemoveCustomLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderRemoveCustomLineItemActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   public StagedOrderRemoveCustomLineItemActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }

   public StagedOrderRemoveCustomLineItemAction build() {
       return new StagedOrderRemoveCustomLineItemActionImpl(customLineItemId);
   }
   
   public static StagedOrderRemoveCustomLineItemActionBuilder of() {
      return new StagedOrderRemoveCustomLineItemActionBuilder();
   }
   
   public static StagedOrderRemoveCustomLineItemActionBuilder of(final StagedOrderRemoveCustomLineItemAction template) {
      StagedOrderRemoveCustomLineItemActionBuilder builder = new StagedOrderRemoveCustomLineItemActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      return builder;
   }
   
}