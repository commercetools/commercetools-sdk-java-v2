package com.commercetools.api.models.store;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.store.StoreDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoreDraftBuilder {
   
   
   private com.commercetools.api.models.common.LocalizedString name;
   
   
   private String key;
   
   public StoreDraftBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public StoreDraftBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public StoreDraft build() {
       return new StoreDraftImpl(name, key);
   }
   
   public static StoreDraftBuilder of() {
      return new StoreDraftBuilder();
   }
   
   public static StoreDraftBuilder of(final StoreDraft template) {
      StoreDraftBuilder builder = new StoreDraftBuilder();
      builder.name = template.getName();
      builder.key = template.getKey();
      return builder;
   }
   
}
