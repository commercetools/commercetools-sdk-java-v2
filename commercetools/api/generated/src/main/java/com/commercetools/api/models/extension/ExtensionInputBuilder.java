package com.commercetools.api.models.extension;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.extension.ExtensionAction;
import com.commercetools.api.models.extension.ExtensionInput;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExtensionInputBuilder {


   private com.commercetools.api.models.common.Reference resource;


   private com.commercetools.api.models.extension.ExtensionAction action;

   public ExtensionInputBuilder resource( final com.commercetools.api.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }

   public ExtensionInputBuilder action( final com.commercetools.api.models.extension.ExtensionAction action) {
      this.action = action;
      return this;
   }


   public com.commercetools.api.models.common.Reference getResource(){
      return this.resource;
   }


   public com.commercetools.api.models.extension.ExtensionAction getAction(){
      return this.action;
   }

   public ExtensionInput build() {
       return new ExtensionInputImpl(resource, action);
   }

   public static ExtensionInputBuilder of() {
      return new ExtensionInputBuilder();
   }

   public static ExtensionInputBuilder of(final ExtensionInput template) {
      ExtensionInputBuilder builder = new ExtensionInputBuilder();
      builder.resource = template.getResource();
      builder.action = template.getAction();
      return builder;
   }

}
