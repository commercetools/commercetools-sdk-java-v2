package com.commercetools.models.product_type;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.product_type.AttributeType;
import com.commercetools.models.product_type.AttributeReferenceType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeReferenceTypeBuilder {
   
   
   private com.commercetools.models.common.ReferenceTypeId referenceTypeId;
   
   public AttributeReferenceTypeBuilder referenceTypeId( final com.commercetools.models.common.ReferenceTypeId referenceTypeId) {
      this.referenceTypeId = referenceTypeId;
      return this;
   }
   
   
   public com.commercetools.models.common.ReferenceTypeId getReferenceTypeId(){
      return this.referenceTypeId;
   }

   public AttributeReferenceType build() {
       return new AttributeReferenceTypeImpl(referenceTypeId);
   }
   
   public static AttributeReferenceTypeBuilder of() {
      return new AttributeReferenceTypeBuilder();
   }
   
   public static AttributeReferenceTypeBuilder of(final AttributeReferenceType template) {
      AttributeReferenceTypeBuilder builder = new AttributeReferenceTypeBuilder();
      builder.referenceTypeId = template.getReferenceTypeId();
      return builder;
   }
   
}