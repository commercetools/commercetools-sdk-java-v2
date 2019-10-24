package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.order_edit.StagedOrderTransitionLineItemStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderTransitionLineItemStateActionBuilder {
   
   
   private com.commercetools.api.generated.models.state.StateResourceIdentifier toState;
   
   
   private com.commercetools.api.generated.models.state.StateResourceIdentifier fromState;
   
   
   private Long quantity;
   
   
   private String lineItemId;
   
   @Nullable
   private java.time.ZonedDateTime actualTransitionDate;
   
   public StagedOrderTransitionLineItemStateActionBuilder toState( final com.commercetools.api.generated.models.state.StateResourceIdentifier toState) {
      this.toState = toState;
      return this;
   }
   
   public StagedOrderTransitionLineItemStateActionBuilder fromState( final com.commercetools.api.generated.models.state.StateResourceIdentifier fromState) {
      this.fromState = fromState;
      return this;
   }
   
   public StagedOrderTransitionLineItemStateActionBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public StagedOrderTransitionLineItemStateActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public StagedOrderTransitionLineItemStateActionBuilder actualTransitionDate(@Nullable final java.time.ZonedDateTime actualTransitionDate) {
      this.actualTransitionDate = actualTransitionDate;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getToState(){
      return this.toState;
   }
   
   
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getFromState(){
      return this.fromState;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public java.time.ZonedDateTime getActualTransitionDate(){
      return this.actualTransitionDate;
   }

   public StagedOrderTransitionLineItemStateAction build() {
       return new StagedOrderTransitionLineItemStateActionImpl(toState, fromState, quantity, lineItemId, actualTransitionDate);
   }
   
   public static StagedOrderTransitionLineItemStateActionBuilder of() {
      return new StagedOrderTransitionLineItemStateActionBuilder();
   }
   
   public static StagedOrderTransitionLineItemStateActionBuilder of(final StagedOrderTransitionLineItemStateAction template) {
      StagedOrderTransitionLineItemStateActionBuilder builder = new StagedOrderTransitionLineItemStateActionBuilder();
      builder.toState = template.getToState();
      builder.fromState = template.getFromState();
      builder.quantity = template.getQuantity();
      builder.lineItemId = template.getLineItemId();
      builder.actualTransitionDate = template.getActualTransitionDate();
      return builder;
   }
   
}