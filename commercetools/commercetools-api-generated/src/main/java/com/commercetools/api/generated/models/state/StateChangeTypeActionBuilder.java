package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.state.StateTypeEnum;
import com.commercetools.api.generated.models.state.StateUpdateAction;
import com.commercetools.api.generated.models.state.StateChangeTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateChangeTypeActionBuilder {
   
   
   private com.commercetools.api.generated.models.state.StateTypeEnum type;
   
   public StateChangeTypeActionBuilder type( final com.commercetools.api.generated.models.state.StateTypeEnum type) {
      this.type = type;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.state.StateTypeEnum getType(){
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