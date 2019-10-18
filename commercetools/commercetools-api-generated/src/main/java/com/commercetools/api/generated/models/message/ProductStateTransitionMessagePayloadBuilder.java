package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.message.ProductStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductStateTransitionMessagePayloadBuilder {
   
   
   private Boolean force;
   
   
   private com.commercetools.api.generated.models.state.StateReference state;
   
   public ProductStateTransitionMessagePayloadBuilder force( final Boolean force) {
      this.force = force;
      return this;
   }
   
   public ProductStateTransitionMessagePayloadBuilder state( final com.commercetools.api.generated.models.state.StateReference state) {
      this.state = state;
      return this;
   }
   
   
   public Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.api.generated.models.state.StateReference getState(){
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