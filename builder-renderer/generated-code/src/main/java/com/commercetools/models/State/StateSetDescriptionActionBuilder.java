package com.commercetools.models.State;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.State.StateUpdateAction;
import java.lang.String;
import com.commercetools.models.State.StateSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateSetDescriptionActionBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString description;
   
   public StateSetDescriptionActionBuilder description( final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }

   public StateSetDescriptionAction build() {
       return new StateSetDescriptionActionImpl(description);
   }
   
   public static StateSetDescriptionActionBuilder of() {
      return new StateSetDescriptionActionBuilder();
   }
   
   public static StateSetDescriptionActionBuilder of(final StateSetDescriptionAction template) {
      StateSetDescriptionActionBuilder builder = new StateSetDescriptionActionBuilder();
      builder.description = template.getDescription();
      return builder;
   }
   
}