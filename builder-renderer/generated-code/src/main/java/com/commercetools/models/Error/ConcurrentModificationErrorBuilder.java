package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Error.ConcurrentModificationError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ConcurrentModificationErrorBuilder {
   
   
   private java.lang.String message;
   
   @Nullable
   private java.lang.Long currentVersion;
   
   public ConcurrentModificationErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public ConcurrentModificationErrorBuilder currentVersion(@Nullable final java.lang.Long currentVersion) {
      this.currentVersion = currentVersion;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   @Nullable
   public java.lang.Long getCurrentVersion(){
      return this.currentVersion;
   }

   public ConcurrentModificationError build() {
       return new ConcurrentModificationErrorImpl(message, currentVersion);
   }
   
   public static ConcurrentModificationErrorBuilder of() {
      return new ConcurrentModificationErrorBuilder();
   }
   
   public static ConcurrentModificationErrorBuilder of(final ConcurrentModificationError template) {
      ConcurrentModificationErrorBuilder builder = new ConcurrentModificationErrorBuilder();
      builder.message = template.getMessage();
      builder.currentVersion = template.getCurrentVersion();
      return builder;
   }
   
}