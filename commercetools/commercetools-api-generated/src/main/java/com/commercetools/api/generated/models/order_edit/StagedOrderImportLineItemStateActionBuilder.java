package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.ItemState;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderImportLineItemStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderImportLineItemStateActionBuilder {
   
   
   private String lineItemId;
   
   
   private java.util.List<com.commercetools.api.generated.models.order.ItemState> state;
   
   public StagedOrderImportLineItemStateActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public StagedOrderImportLineItemStateActionBuilder state( final java.util.List<com.commercetools.api.generated.models.order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.ItemState> getState(){
      return this.state;
   }

   public StagedOrderImportLineItemStateAction build() {
       return new StagedOrderImportLineItemStateActionImpl(lineItemId, state);
   }
   
   public static StagedOrderImportLineItemStateActionBuilder of() {
      return new StagedOrderImportLineItemStateActionBuilder();
   }
   
   public static StagedOrderImportLineItemStateActionBuilder of(final StagedOrderImportLineItemStateAction template) {
      StagedOrderImportLineItemStateActionBuilder builder = new StagedOrderImportLineItemStateActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.state = template.getState();
      return builder;
   }
   
}