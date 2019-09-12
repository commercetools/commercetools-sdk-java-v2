package com.commercetools.models.State;

import com.commercetools.models.State.StateUpdateAction;
import java.lang.String;
import com.commercetools.models.State.StateChangeKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateChangeKeyActionBuilder {
   
   
   private java.lang.String key;
   
   public StateChangeKeyActionBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public StateChangeKeyAction build() {
       return new StateChangeKeyActionImpl(key);
   }
   
   public static StateChangeKeyActionBuilder of() {
      return new StateChangeKeyActionBuilder();
   }
   
   public static StateChangeKeyActionBuilder of(final StateChangeKeyAction template) {
      StateChangeKeyActionBuilder builder = new StateChangeKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}