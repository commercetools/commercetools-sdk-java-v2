package com.commercetools.models.state;

import com.commercetools.models.state.StateUpdateAction;
import com.commercetools.models.state.StateUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.state.StateUpdateAction> actions;
   
   
   private Long version;
   
   public StateUpdateBuilder actions( final java.util.List<com.commercetools.models.state.StateUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public StateUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.state.StateUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public StateUpdate build() {
       return new StateUpdateImpl(actions, version);
   }
   
   public static StateUpdateBuilder of() {
      return new StateUpdateBuilder();
   }
   
   public static StateUpdateBuilder of(final StateUpdate template) {
      StateUpdateBuilder builder = new StateUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}