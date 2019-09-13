package com.commercetools.models.error;

import java.lang.String;
import com.commercetools.models.error.ErrorByExtension;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ErrorByExtensionBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public ErrorByExtensionBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ErrorByExtensionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ErrorByExtension build() {
       return new ErrorByExtensionImpl(id, key);
   }
   
   public static ErrorByExtensionBuilder of() {
      return new ErrorByExtensionBuilder();
   }
   
   public static ErrorByExtensionBuilder of(final ErrorByExtension template) {
      ErrorByExtensionBuilder builder = new ErrorByExtensionBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}