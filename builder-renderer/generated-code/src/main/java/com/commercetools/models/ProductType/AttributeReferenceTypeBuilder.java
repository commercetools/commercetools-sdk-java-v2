package com.commercetools.models.ProductType;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeReferenceType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeReferenceTypeBuilder {
   
   
   private com.commercetools.models.Common.ReferenceTypeId referenceTypeId;
   
   public AttributeReferenceTypeBuilder referenceTypeId( final com.commercetools.models.Common.ReferenceTypeId referenceTypeId) {
      this.referenceTypeId = referenceTypeId;
      return this;
   }
   
   
   public com.commercetools.models.Common.ReferenceTypeId getReferenceTypeId(){
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