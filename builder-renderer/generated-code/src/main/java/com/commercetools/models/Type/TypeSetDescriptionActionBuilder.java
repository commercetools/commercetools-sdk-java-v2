package com.commercetools.models.Type;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeSetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   public TypeSetDescriptionActionBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }

   public TypeSetDescriptionAction build() {
       return new TypeSetDescriptionActionImpl(description);
   }
   
   public static TypeSetDescriptionActionBuilder of() {
      return new TypeSetDescriptionActionBuilder();
   }
   
   public static TypeSetDescriptionActionBuilder of(final TypeSetDescriptionAction template) {
      TypeSetDescriptionActionBuilder builder = new TypeSetDescriptionActionBuilder();
      builder.description = template.getDescription();
      return builder;
   }
   
}