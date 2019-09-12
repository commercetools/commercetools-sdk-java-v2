package com.commercetools.models.ShippingMethod;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.ShippingMethod.ShippingMethod;
import com.commercetools.models.ShippingMethod.ShippingMethodReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.ShippingMethod.ShippingMethod obj;
   
   public ShippingMethodReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ShippingMethodReferenceBuilder obj(@Nullable final com.commercetools.models.ShippingMethod.ShippingMethod obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.ShippingMethod.ShippingMethod getObj(){
      return this.obj;
   }

   public ShippingMethodReference build() {
       return new ShippingMethodReferenceImpl(id, obj);
   }
   
   public static ShippingMethodReferenceBuilder of() {
      return new ShippingMethodReferenceBuilder();
   }
   
   public static ShippingMethodReferenceBuilder of(final ShippingMethodReference template) {
      ShippingMethodReferenceBuilder builder = new ShippingMethodReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}