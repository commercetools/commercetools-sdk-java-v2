package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.state.StateUpdateAction;
import com.commercetools.api.generated.models.state.StateSetNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StateSetNameActionBuilder {
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   public StateSetNameActionBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
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