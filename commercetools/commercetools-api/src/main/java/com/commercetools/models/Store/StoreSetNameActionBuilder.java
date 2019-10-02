package com.commercetools.models.store;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.store.StoreUpdateAction;
import com.commercetools.models.store.StoreSetNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StoreSetNameActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.LocalizedString name;
   
   public StoreSetNameActionBuilder name(@Nullable final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getName(){
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