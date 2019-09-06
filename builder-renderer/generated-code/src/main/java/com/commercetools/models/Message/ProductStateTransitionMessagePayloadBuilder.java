package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.State.StateReference;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Message.ProductStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductStateTransitionMessagePayloadBuilder {
   
   
   private java.lang.Boolean force;
   
   
   private com.commercetools.models.State.StateReference state;
   
   public ProductStateTransitionMessagePayloadBuilder force( final java.lang.Boolean force) {
      this.force = force;
      return this;
   }
   
   public ProductStateTransitionMessagePayloadBuilder state( final com.commercetools.models.State.StateReference state) {
      this.state = state;
      return this;
   }
   
   
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.State.StateReference getState(){
      return this.state;
   }

   public ProductStateTransitionMessagePayload build() {
       return new ProductStateTransitionMessagePayloadImpl(force, state);
   }
   
   public static ProductStateTransitionMessagePayloadBuilder of() {
      return new ProductStateTransitionMessagePayloadBuilder();
   }
   
   public static ProductStateTransitionMessagePayloadBuilder of(final ProductStateTransitionMessagePayload template) {
      ProductStateTransitionMessagePayloadBuilder builder = new ProductStateTransitionMessagePayloadBuilder();
      builder.force = template.getForce();
      builder.state = template.getState();
      return builder;
   }
   
}