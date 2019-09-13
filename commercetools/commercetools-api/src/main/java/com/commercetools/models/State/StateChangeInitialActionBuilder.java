package com.commercetools.models.state;

import com.commercetools.models.state.StateUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.state.StateChangeInitialAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateChangeInitialActionBuilder {
   
   
   private java.lang.Boolean initial;
   
   public StateChangeInitialActionBuilder initial( final java.lang.Boolean initial) {
      this.initial = initial;
      return this;
   }
   
   
   public java.lang.Boolean getInitial(){
      return this.initial;
   }

   public StateChangeInitialAction build() {
       return new StateChangeInitialActionImpl(initial);
   }
   
   public static StateChangeInitialActionBuilder of() {
      return new StateChangeInitialActionBuilder();
   }
   
   public static StateChangeInitialActionBuilder of(final StateChangeInitialAction template) {
      StateChangeInitialActionBuilder builder = new StateChangeInitialActionBuilder();
      builder.initial = template.getInitial();
      return builder;
   }
   
}