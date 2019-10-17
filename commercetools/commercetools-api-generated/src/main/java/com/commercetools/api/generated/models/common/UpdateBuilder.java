package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.UpdateAction;
import com.commercetools.api.generated.models.common.Update;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class UpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.common.UpdateAction> actions;
   
   
   private Long version;
   
   public UpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.common.UpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public UpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.UpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public Update build() {
       return new UpdateImpl(actions, version);
   }
   
   public static UpdateBuilder of() {
      return new UpdateBuilder();
   }
   
   public static UpdateBuilder of(final Update template) {
      UpdateBuilder builder = new UpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}