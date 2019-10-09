package com.commercetools.models.extension;

import com.commercetools.models.extension.ExtensionUpdateAction;
import com.commercetools.models.extension.ExtensionSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionSetKeyActionBuilder {
   
   @Nullable
   private String key;
   
   public ExtensionSetKeyActionBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public ExtensionSetKeyAction build() {
       return new ExtensionSetKeyActionImpl(key);
   }
   
   public static ExtensionSetKeyActionBuilder of() {
      return new ExtensionSetKeyActionBuilder();
   }
   
   public static ExtensionSetKeyActionBuilder of(final ExtensionSetKeyAction template) {
      ExtensionSetKeyActionBuilder builder = new ExtensionSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}