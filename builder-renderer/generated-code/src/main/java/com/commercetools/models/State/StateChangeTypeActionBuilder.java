package com.commercetools.models.State;

import com.commercetools.models.State.StateTypeEnum;
import com.commercetools.models.State.StateUpdateAction;
import java.lang.String;
import com.commercetools.models.State.StateChangeTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateChangeTypeActionBuilder {
   
   
   private com.commercetools.models.State.StateTypeEnum type;
   
   public StateChangeTypeActionBuilder type( final com.commercetools.models.State.StateTypeEnum type) {
      this.type = type;
      return this;
   }
   
   
   public com.commercetools.models.State.StateTypeEnum getType(){
      return this.type;
   }

   public StateChangeTypeAction build() {
       return new StateChangeTypeActionImpl(type);
   }
   
   public static StateChangeTypeActionBuilder of() {
      return new StateChangeTypeActionBuilder();
   }
   
   public static StateChangeTypeActionBuilder of(final StateChangeTypeAction template) {
      StateChangeTypeActionBuilder builder = new StateChangeTypeActionBuilder();
      builder.type = template.getType();
      return builder;
   }
   
}