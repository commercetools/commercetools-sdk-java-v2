package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.TypeUpdateAction;
import com.commercetools.api.generated.models.type.TypeSetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeSetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   public TypeSetDescriptionActionBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
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