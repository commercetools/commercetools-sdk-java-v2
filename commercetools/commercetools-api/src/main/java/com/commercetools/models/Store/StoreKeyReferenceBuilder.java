package com.commercetools.models.Store;

import com.commercetools.models.Common.KeyReference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Store.StoreKeyReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StoreKeyReferenceBuilder {
   
   
   private java.lang.String key;
   
   public StoreKeyReferenceBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public StoreKeyReference build() {
       return new StoreKeyReferenceImpl(key);
   }
   
   public static StoreKeyReferenceBuilder of() {
      return new StoreKeyReferenceBuilder();
   }
   
   public static StoreKeyReferenceBuilder of(final StoreKeyReference template) {
      StoreKeyReferenceBuilder builder = new StoreKeyReferenceBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}