package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.common.ResourceIdentifier;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StateResourceIdentifierBuilder {
   
   @Nullable
   private String id;
   
   @Nullable
   private String key;
   
   public StateResourceIdentifierBuilder id(@Nullable final String id) {
      this.id = id;
      return this;
   }
   
   public StateResourceIdentifierBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public StateResourceIdentifier build() {
       return new StateResourceIdentifierImpl(id, key);
   }
   
   public static StateResourceIdentifierBuilder of() {
      return new StateResourceIdentifierBuilder();
   }
   
   public static StateResourceIdentifierBuilder of(final StateResourceIdentifier template) {
      StateResourceIdentifierBuilder builder = new StateResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}