package com.commercetools.models.Common;

import java.lang.String;
import com.commercetools.models.Common.UpdateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class UpdateActionBuilder {
   
   
   private java.lang.String action;
   
   public UpdateActionBuilder action( final java.lang.String action) {
      this.action = action;
      return this;
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }

   public UpdateAction build() {
       return new UpdateActionImpl(action);
   }
   
   public static UpdateActionBuilder of() {
      return new UpdateActionBuilder();
   }
   
   public static UpdateActionBuilder of(final UpdateAction template) {
      UpdateActionBuilder builder = new UpdateActionBuilder();
      builder.action = template.getAction();
      return builder;
   }
   
}