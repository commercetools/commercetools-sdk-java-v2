package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.state.StateReference;
import java.time.ZonedDateTime;
import com.commercetools.api.models.message.LineItemStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LineItemStateTransitionMessagePayloadBuilder {


   private com.commercetools.api.models.state.StateReference toState;


   private com.commercetools.api.models.state.StateReference fromState;


   private Long quantity;


   private String lineItemId;


   private java.time.ZonedDateTime transitionDate;

   public LineItemStateTransitionMessagePayloadBuilder toState( final com.commercetools.api.models.state.StateReference toState) {
      this.toState = toState;
      return this;
   }

   public LineItemStateTransitionMessagePayloadBuilder fromState( final com.commercetools.api.models.state.StateReference fromState) {
      this.fromState = fromState;
      return this;
   }

   public LineItemStateTransitionMessagePayloadBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }

   public LineItemStateTransitionMessagePayloadBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }

   public LineItemStateTransitionMessagePayloadBuilder transitionDate( final java.time.ZonedDateTime transitionDate) {
      this.transitionDate = transitionDate;
      return this;
   }


   public com.commercetools.api.models.state.StateReference getToState(){
      return this.toState;
   }


   public com.commercetools.api.models.state.StateReference getFromState(){
      return this.fromState;
   }


   public Long getQuantity(){
      return this.quantity;
   }


   public String getLineItemId(){
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
