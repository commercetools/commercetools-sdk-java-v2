package com.commercetools.models.Store;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Store.StoreUpdateAction;
import java.lang.String;
import com.commercetools.models.Store.StoreSetNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StoreSetNameActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString name;
   
   public StoreSetNameActionBuilder name(@Nullable final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }

   public StoreSetNameAction build() {
       return new StoreSetNameActionImpl(name);
   }
   
   public static StoreSetNameActionBuilder of() {
      return new StoreSetNameActionBuilder();
   }
   
   public static StoreSetNameActionBuilder of(final StoreSetNameAction template) {
      StoreSetNameActionBuilder builder = new StoreSetNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}