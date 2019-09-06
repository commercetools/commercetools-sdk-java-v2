package com.commercetools.models.State;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.State.StateUpdateAction;
import java.lang.String;
import com.commercetools.models.State.StateSetNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateSetNameActionBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   public StateSetNameActionBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
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