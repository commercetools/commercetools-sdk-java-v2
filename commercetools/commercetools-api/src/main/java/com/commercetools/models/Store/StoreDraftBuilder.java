package com.commercetools.models.store;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.store.StoreDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StoreDraftBuilder {
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   
   private String key;
   
   public StoreDraftBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public StoreDraftBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
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