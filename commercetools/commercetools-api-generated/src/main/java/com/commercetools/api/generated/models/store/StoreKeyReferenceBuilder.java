package com.commercetools.api.generated.models.store;

import com.commercetools.api.generated.models.common.KeyReference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.store.StoreKeyReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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