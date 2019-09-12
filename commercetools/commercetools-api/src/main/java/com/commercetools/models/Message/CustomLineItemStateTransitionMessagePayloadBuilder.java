package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.State.StateReference;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Message.CustomLineItemStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomLineItemStateTransitionMessagePayloadBuilder {
   
   
   private com.commercetools.models.State.StateReference toState;
   
   
   private com.commercetools.models.State.StateReference fromState;
   
   
   private java.lang.String customLineItemId;
   
   
   private java.lang.Long quantity;
   
   
   private java.time.ZonedDateTime transitionDate;
   
   public CustomLineItemStateTransitionMessagePayloadBuilder toState( final com.commercetools.models.State.StateReference toState) {
      this.toState = toState;
      return this;
   }
   
   public CustomLineItemStateTransitionMessagePayloadBuilder fromState( final com.commercetools.models.State.StateReference fromState) {
      this.fromState = fromState;
      return this;
   }
   
   public CustomLineItemStateTransitionMessagePayloadBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CustomLineItemStateTransitionMessagePayloadBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CustomLineItemStateTransitionMessagePayloadBuilder transitionDate( final java.time.ZonedDateTime transitionDate) {
      this.transitionDate = transitionDate;
      return this;
   }
   
   
   public com.commercetools.models.State.StateReference getToState(){
      return this.toState;
   }
   
   
   public com.commercetools.models.State.StateReference getFromState(){
      return this.fromState;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.time.ZonedDateTime getTransitionDate(){
      return this.transitionDate;
   }

   public CustomLineItemStateTransitionMessagePayload build() {
       return new CustomLineItemStateTransitionMessagePayloadImpl(toState, fromState, customLineItemId, quantity, transitionDate);
   }
   
   public static CustomLineItemStateTransitionMessagePayloadBuilder of() {
      return new CustomLineItemStateTransitionMessagePayloadBuilder();
   }
   
   public static CustomLineItemStateTransitionMessagePayloadBuilder of(final CustomLineItemStateTransitionMessagePayload template) {
      CustomLineItemStateTransitionMessagePayloadBuilder builder = new CustomLineItemStateTransitionMessagePayloadBuilder();
      builder.toState = template.getToState();
      builder.fromState = template.getFromState();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.quantity = template.getQuantity();
      builder.transitionDate = template.getTransitionDate();
      return builder;
   }
   
}