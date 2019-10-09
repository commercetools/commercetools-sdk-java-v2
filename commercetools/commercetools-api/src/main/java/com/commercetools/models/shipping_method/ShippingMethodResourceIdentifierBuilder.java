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
   private String id;
   
   @Nullable
   private String key;
   
   public ShippingMethodResourceIdentifierBuilder id(@Nullable final String id) {
      this.id = id;
      return this;
   }
   
   public ShippingMethodResourceIdentifierBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public String getKey(){
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