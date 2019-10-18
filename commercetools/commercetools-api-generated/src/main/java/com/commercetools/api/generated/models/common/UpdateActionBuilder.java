package com.commercetools.api.generated.models.common;


import com.commercetools.api.generated.models.common.UpdateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class UpdateActionBuilder {
   
   
   private String action;
   
   public UpdateActionBuilder action( final String action) {
      this.action = action;
      return this;
   }
   
   
   public String getAction(){
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