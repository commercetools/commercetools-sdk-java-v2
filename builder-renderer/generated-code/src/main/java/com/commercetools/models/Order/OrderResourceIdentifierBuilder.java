package com.commercetools.models.Order;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.Order.OrderResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public OrderResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public OrderResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
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

   public OrderResourceIdentifier build() {
       return new OrderResourceIdentifierImpl(id, key);
   }
   
   public static OrderResourceIdentifierBuilder of() {
      return new OrderResourceIdentifierBuilder();
   }
   
   public static OrderResourceIdentifierBuilder of(final OrderResourceIdentifier template) {
      OrderResourceIdentifierBuilder builder = new OrderResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}