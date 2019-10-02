package com.commercetools.models.state;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.state.StateUpdateAction;
import com.commercetools.models.state.StateSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateSetDescriptionActionBuilder {
   
   
   private com.commercetools.models.common.LocalizedString description;
   
   public StateSetDescriptionActionBuilder description( final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
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