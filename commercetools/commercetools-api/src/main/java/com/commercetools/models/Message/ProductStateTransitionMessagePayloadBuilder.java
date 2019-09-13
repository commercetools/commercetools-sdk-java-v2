package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.state.StateReference;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.message.ProductStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductStateTransitionMessagePayloadBuilder {
   
   
   private java.lang.Boolean force;
   
   
   private com.commercetools.models.state.StateReference state;
   
   public ProductStateTransitionMessagePayloadBuilder force( final java.lang.Boolean force) {
      this.force = force;
      return this;
   }
   
   public ProductStateTransitionMessagePayloadBuilder state( final com.commercetools.models.state.StateReference state) {
      this.state = state;
      return this;
   }
   
   
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.state.StateReference getState(){
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