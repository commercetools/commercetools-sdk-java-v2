package com.commercetools.models.Type;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeNameActionBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   public TypeChangeNameActionBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }

   public TypeChangeNameAction build() {
       return new TypeChangeNameActionImpl(name);
   }
   
   public static TypeChangeNameActionBuilder of() {
      return new TypeChangeNameActionBuilder();
   }
   
   public static TypeChangeNameActionBuilder of(final TypeChangeNameAction template) {
      TypeChangeNameActionBuilder builder = new TypeChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}