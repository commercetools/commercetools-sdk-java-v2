package com.commercetools.models.DiscountCode;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.DiscountCode.DiscountCode;
import com.commercetools.models.DiscountCode.DiscountCodeReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.DiscountCode.DiscountCode obj;
   
   public DiscountCodeReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public DiscountCodeReferenceBuilder obj(@Nullable final com.commercetools.models.DiscountCode.DiscountCode obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.DiscountCode.DiscountCode getObj(){
      return this.obj;
   }

   public DiscountCodeReference build() {
       return new DiscountCodeReferenceImpl(id, obj);
   }
   
   public static DiscountCodeReferenceBuilder of() {
      return new DiscountCodeReferenceBuilder();
   }
   
   public static DiscountCodeReferenceBuilder of(final DiscountCodeReference template) {
      DiscountCodeReferenceBuilder builder = new DiscountCodeReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}