package com.commercetools.models.type;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.type.FieldType;
import java.lang.String;
import com.commercetools.models.type.CustomFieldReferenceType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldReferenceTypeBuilder {
   
   
   private com.commercetools.models.common.ReferenceTypeId referenceTypeId;
   
   public CustomFieldReferenceTypeBuilder referenceTypeId( final com.commercetools.models.common.ReferenceTypeId referenceTypeId) {
      this.referenceTypeId = referenceTypeId;
      return this;
   }
   
   
   public com.commercetools.models.common.ReferenceTypeId getReferenceTypeId(){
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