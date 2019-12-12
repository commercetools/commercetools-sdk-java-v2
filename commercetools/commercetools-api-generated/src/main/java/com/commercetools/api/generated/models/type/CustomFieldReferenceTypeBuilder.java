package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.CustomFieldReferenceType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomFieldReferenceTypeBuilder {
   
   
   private com.commercetools.api.generated.models.common.ReferenceTypeId referenceTypeId;
   
   public CustomFieldReferenceTypeBuilder referenceTypeId( final com.commercetools.api.generated.models.common.ReferenceTypeId referenceTypeId) {
      this.referenceTypeId = referenceTypeId;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.ReferenceTypeId getReferenceTypeId(){
      return this.referenceTypeId;
   }

   public CustomFieldReferenceType build() {
       return new CustomFieldReferenceTypeImpl(referenceTypeId);
   }
   
   public static CustomFieldReferenceTypeBuilder of() {
      return new CustomFieldReferenceTypeBuilder();
   }
   
   public static CustomFieldReferenceTypeBuilder of(final CustomFieldReferenceType template) {
      CustomFieldReferenceTypeBuilder builder = new CustomFieldReferenceTypeBuilder();
      builder.referenceTypeId = template.getReferenceTypeId();
      return builder;
   }
   
}