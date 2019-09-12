package com.commercetools.models.Store;

import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Store.StoreDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StoreDraftBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   
   private java.lang.String key;
   
   public StoreDraftBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public StoreDraftBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.lang.String getKey(){
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