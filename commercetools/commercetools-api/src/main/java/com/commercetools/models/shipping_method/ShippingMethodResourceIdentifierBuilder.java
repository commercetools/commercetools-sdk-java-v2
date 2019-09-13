package com.commercetools.models.shipping_method;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public ShippingMethodResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ShippingMethodResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ShippingMethodResourceIdentifier build() {
       return new ShippingMethodResourceIdentifierImpl(id, key);
   }
   
   public static ShippingMethodResourceIdentifierBuilder of() {
      return new ShippingMethodResourceIdentifierBuilder();
   }
   
   public static ShippingMethodResourceIdentifierBuilder of(final ShippingMethodResourceIdentifier template) {
      ShippingMethodResourceIdentifierBuilder builder = new ShippingMethodResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}