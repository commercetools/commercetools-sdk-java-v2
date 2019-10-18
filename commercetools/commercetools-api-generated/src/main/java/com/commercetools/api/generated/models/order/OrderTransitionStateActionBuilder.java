package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import com.commercetools.api.generated.models.order.OrderTransitionStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderTransitionStateActionBuilder {
   
   @Nullable
   private Boolean force;
   
   
   private com.commercetools.api.generated.models.state.StateResourceIdentifier state;
   
   public OrderTransitionStateActionBuilder force(@Nullable final Boolean force) {
      this.force = force;
      return this;
   }
   
   public OrderTransitionStateActionBuilder state( final com.commercetools.api.generated.models.state.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   @Nullable
   public Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getState(){
      return this.state;
   }

   public OrderTransitionStateAction build() {
       return new OrderTransitionStateActionImpl(force, state);
   }
   
   public static OrderTransitionStateActionBuilder of() {
      return new OrderTransitionStateActionBuilder();
   }
   
   public static OrderTransitionStateActionBuilder of(final OrderTransitionStateAction template) {
      OrderTransitionStateActionBuilder builder = new OrderTransitionStateActionBuilder();
      builder.force = template.getForce();
      builder.state = template.getState();
      return builder;
   }
   
}