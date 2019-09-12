package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.State.StateResourceIdentifier;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderTransitionStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderTransitionStateActionBuilder {
   
   @Nullable
   private java.lang.Boolean force;
   
   
   private com.commercetools.models.State.StateResourceIdentifier state;
   
   public StagedOrderTransitionStateActionBuilder force(@Nullable final java.lang.Boolean force) {
      this.force = force;
      return this;
   }
   
   public StagedOrderTransitionStateActionBuilder state( final com.commercetools.models.State.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.State.StateResourceIdentifier getState(){
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