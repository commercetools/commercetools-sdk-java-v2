package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.state.StateReference;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.message.CustomLineItemStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomLineItemStateTransitionMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.state.StateReference toState;
   
   
   private com.commercetools.api.generated.models.state.StateReference fromState;
   
   
   private String customLineItemId;
   
   
   private Long quantity;
   
   
   private java.time.ZonedDateTime transitionDate;
   
   public CustomLineItemStateTransitionMessagePayloadBuilder toState( final com.commercetools.api.generated.models.state.StateReference toState) {
      this.toState = toState;
      return this;
   }
   
   public CustomLineItemStateTransitionMessagePayloadBuilder fromState( final com.commercetools.api.generated.models.state.StateReference fromState) {
      this.fromState = fromState;
      return this;
   }
   
   public CustomLineItemStateTransitionMessagePayloadBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CustomLineItemStateTransitionMessagePayloadBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CustomLineItemStateTransitionMessagePayloadBuilder transitionDate( final java.time.ZonedDateTime transitionDate) {
      this.transitionDate = transitionDate;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.state.StateReference getToState(){
      return this.toState;
   }
   
   
   public com.commercetools.api.generated.models.state.StateReference getFromState(){
      return this.fromState;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public Long getQuantity(){
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