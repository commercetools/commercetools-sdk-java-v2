package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.TypeUpdateAction;
import com.commercetools.api.generated.models.type.TypeChangeLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeChangeLabelActionBuilder {
   
   
   private String fieldName;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString label;
   
   public TypeChangeLabelActionBuilder fieldName( final String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeChangeLabelActionBuilder label( final com.commercetools.api.generated.models.common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   
   public String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getLabel(){
      return this.label;
   }

   public TypeChangeLabelAction build() {
       return new TypeChangeLabelActionImpl(fieldName, label);
   }
   
   public static TypeChangeLabelActionBuilder of() {
      return new TypeChangeLabelActionBuilder();
   }
   
   public static TypeChangeLabelActionBuilder of(final TypeChangeLabelAction template) {
      TypeChangeLabelActionBuilder builder = new TypeChangeLabelActionBuilder();
      builder.fieldName = template.getFieldName();
      builder.label = template.getLabel();
      return builder;
   }
   
}