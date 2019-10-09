package com.commercetools.models.state;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.state.StateUpdateAction;
import com.commercetools.models.state.StateSetNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateSetNameActionBuilder {
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   public StateSetNameActionBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }

   public StateSetNameAction build() {
       return new StateSetNameActionImpl(name);
   }
   
   public static StateSetNameActionBuilder of() {
      return new StateSetNameActionBuilder();
   }
   
   public static StateSetNameActionBuilder of(final StateSetNameAction template) {
      StateSetNameActionBuilder builder = new StateSetNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}