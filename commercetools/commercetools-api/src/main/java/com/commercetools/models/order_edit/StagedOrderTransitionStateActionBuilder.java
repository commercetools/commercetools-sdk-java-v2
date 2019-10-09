package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.state.StateResourceIdentifier;
import com.commercetools.models.order_edit.StagedOrderTransitionStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderTransitionStateActionBuilder {
   
   @Nullable
   private Boolean force;
   
   
   private com.commercetools.models.state.StateResourceIdentifier state;
   
   public StagedOrderTransitionStateActionBuilder force(@Nullable final Boolean force) {
      this.force = force;
      return this;
   }
   
   public StagedOrderTransitionStateActionBuilder state( final com.commercetools.models.state.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   @Nullable
   public Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.state.StateResourceIdentifier getState(){
      return this.state;
   }

   public StagedOrderTransitionStateAction build() {
       return new StagedOrderTransitionStateActionImpl(force, state);
   }
   
   public static StagedOrderTransitionStateActionBuilder of() {
      return new StagedOrderTransitionStateActionBuilder();
   }
   
   public static StagedOrderTransitionStateActionBuilder of(final StagedOrderTransitionStateAction template) {
      StagedOrderTransitionStateActionBuilder builder = new StagedOrderTransitionStateActionBuilder();
      builder.force = template.getForce();
      builder.state = template.getState();
      return builder;
   }
   
}