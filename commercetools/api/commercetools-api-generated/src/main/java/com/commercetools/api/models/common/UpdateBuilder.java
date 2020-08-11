package com.commercetools.api.models.common;

import com.commercetools.api.models.common.UpdateAction;
import com.commercetools.api.models.common.Update;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class UpdateBuilder {


   private java.util.List<com.commercetools.api.models.common.UpdateAction> actions;


   private Long version;

   public UpdateBuilder actions( final java.util.List<com.commercetools.api.models.common.UpdateAction> actions) {
      this.actions = actions;
      return this;
   }

   public UpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }


   public java.util.List<com.commercetools.api.models.common.UpdateAction> getActions(){
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
