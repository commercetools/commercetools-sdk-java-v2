package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.State.StateReference;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Message.LineItemStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class LineItemStateTransitionMessagePayloadBuilder {
   
   
   private com.commercetools.models.State.StateReference toState;
   
   
   private com.commercetools.models.State.StateReference fromState;
   
   
   private java.lang.Long quantity;
   
   
   private java.lang.String lineItemId;
   
   
   private java.time.ZonedDateTime transitionDate;
   
   public LineItemStateTransitionMessagePayloadBuilder toState( final com.commercetools.models.State.StateReference toState) {
      this.toState = toState;
      return this;
   }
   
   public LineItemStateTransitionMessagePayloadBuilder fromState( final com.commercetools.models.State.StateReference fromState) {
      this.fromState = fromState;
      return this;
   }
   
   public LineItemStateTransitionMessagePayloadBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public LineItemStateTransitionMessagePayloadBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public LineItemStateTransitionMessagePayloadBuilder transitionDate( final java.time.ZonedDateTime transitionDate) {
      this.transitionDate = transitionDate;
      return this;
   }
   
   
   public com.commercetools.models.State.StateReference getToState(){
      return this.toState;
   }
   
   
   public com.commercetools.models.State.StateReference getFromState(){
      return this.fromState;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.time.ZonedDateTime getTransitionDate(){
      return this.transitionDate;
   }

   public LineItemStateTransitionMessagePayload build() {
       return new LineItemStateTransitionMessagePayloadImpl(toState, fromState, quantity, lineItemId, transitionDate);
   }
   
   public static LineItemStateTransitionMessagePayloadBuilder of() {
      return new LineItemStateTransitionMessagePayloadBuilder();
   }
   
   public static LineItemStateTransitionMessagePayloadBuilder of(final LineItemStateTransitionMessagePayload template) {
      LineItemStateTransitionMessagePayloadBuilder builder = new LineItemStateTransitionMessagePayloadBuilder();
      builder.toState = template.getToState();
      builder.fromState = template.getFromState();
      builder.quantity = template.getQuantity();
      builder.lineItemId = template.getLineItemId();
      builder.transitionDate = template.getTransitionDate();
      return builder;
   }
   
}