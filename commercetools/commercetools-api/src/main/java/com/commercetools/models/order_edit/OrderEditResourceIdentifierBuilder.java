package com.commercetools.models.order_edit;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.order_edit.OrderEditResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public OrderEditResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public OrderEditResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
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

   public OrderEditResourceIdentifier build() {
       return new OrderEditResourceIdentifierImpl(id, key);
   }
   
   public static OrderEditResourceIdentifierBuilder of() {
      return new OrderEditResourceIdentifierBuilder();
   }
   
   public static OrderEditResourceIdentifierBuilder of(final OrderEditResourceIdentifier template) {
      OrderEditResourceIdentifierBuilder builder = new OrderEditResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}