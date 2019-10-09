package com.commercetools.models.store;

import com.commercetools.models.common.KeyReference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.store.StoreKeyReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StoreKeyReferenceBuilder {
   
   
   private String key;
   
   public StoreKeyReferenceBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public String getKey(){
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