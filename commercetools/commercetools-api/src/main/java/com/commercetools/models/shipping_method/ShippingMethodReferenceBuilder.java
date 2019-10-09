package com.commercetools.models.shipping_method;

import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.shipping_method.ShippingMethod;
import com.commercetools.models.shipping_method.ShippingMethodReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.models.shipping_method.ShippingMethod obj;
   
   public ShippingMethodReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ShippingMethodReferenceBuilder obj(@Nullable final com.commercetools.models.shipping_method.ShippingMethod obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.shipping_method.ShippingMethod getObj(){
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