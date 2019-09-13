package com.commercetools.models.state;

import com.commercetools.models.state.StateTypeEnum;
import com.commercetools.models.state.StateUpdateAction;
import java.lang.String;
import com.commercetools.models.state.StateChangeTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateChangeTypeActionBuilder {
   
   
   private com.commercetools.models.state.StateTypeEnum type;
   
   public StateChangeTypeActionBuilder type( final com.commercetools.models.state.StateTypeEnum type) {
      this.type = type;
      return this;
   }
   
   
   public com.commercetools.models.state.StateTypeEnum getType(){
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