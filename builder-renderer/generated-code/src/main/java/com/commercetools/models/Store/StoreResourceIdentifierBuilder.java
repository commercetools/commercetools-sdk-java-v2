package com.commercetools.models.Store;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.Store.StoreResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StoreResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public StoreResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public StoreResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
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

   public StoreResourceIdentifier build() {
       return new StoreResourceIdentifierImpl(id, key);
   }
   
   public static StoreResourceIdentifierBuilder of() {
      return new StoreResourceIdentifierBuilder();
   }
   
   public static StoreResourceIdentifierBuilder of(final StoreResourceIdentifier template) {
      StoreResourceIdentifierBuilder builder = new StoreResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}