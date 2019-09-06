package com.commercetools.models.Type;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Type.FieldType;
import java.lang.String;
import com.commercetools.models.Type.CustomFieldReferenceType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldReferenceTypeBuilder {
   
   
   private com.commercetools.models.Common.ReferenceTypeId referenceTypeId;
   
   public CustomFieldReferenceTypeBuilder referenceTypeId( final com.commercetools.models.Common.ReferenceTypeId referenceTypeId) {
      this.referenceTypeId = referenceTypeId;
      return this;
   }
   
   
   public com.commercetools.models.Common.ReferenceTypeId getReferenceTypeId(){
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