package com.commercetools.models.state;

import com.commercetools.models.state.StateResourceIdentifier;
import com.commercetools.models.state.StateUpdateAction;
import java.lang.String;
import com.commercetools.models.state.StateSetTransitionsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateSetTransitionsActionBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.state.StateResourceIdentifier> transitions;
   
   public StateSetTransitionsActionBuilder transitions(@Nullable final java.util.List<com.commercetools.models.state.StateResourceIdentifier> transitions) {
      this.transitions = transitions;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.state.StateResourceIdentifier> getTransitions(){
      return this.transitions;
   }

   public StateSetTransitionsAction build() {
       return new StateSetTransitionsActionImpl(transitions);
   }
   
   public static StateSetTransitionsActionBuilder of() {
      return new StateSetTransitionsActionBuilder();
   }
   
   public static StateSetTransitionsActionBuilder of(final StateSetTransitionsAction template) {
      StateSetTransitionsActionBuilder builder = new StateSetTransitionsActionBuilder();
      builder.transitions = template.getTransitions();
      return builder;
   }
   
}