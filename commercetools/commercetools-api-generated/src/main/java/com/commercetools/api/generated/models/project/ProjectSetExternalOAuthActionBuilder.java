package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ExternalOAuth;
import com.commercetools.api.generated.models.project.ProjectUpdateAction;
import com.commercetools.api.generated.models.project.ProjectSetExternalOAuthAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectSetExternalOAuthActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.project.ExternalOAuth externalOAuth;
   
   public ProjectSetExternalOAuthActionBuilder externalOAuth(@Nullable final com.commercetools.api.generated.models.project.ExternalOAuth externalOAuth) {
      this.externalOAuth = externalOAuth;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.project.ExternalOAuth getExternalOAuth(){
      return this.externalOAuth;
   }

   public ProjectSetExternalOAuthAction build() {
       return new ProjectSetExternalOAuthActionImpl(externalOAuth);
   }
   
   public static ProjectSetExternalOAuthActionBuilder of() {
      return new ProjectSetExternalOAuthActionBuilder();
   }
   
   public static ProjectSetExternalOAuthActionBuilder of(final ProjectSetExternalOAuthAction template) {
      ProjectSetExternalOAuthActionBuilder builder = new ProjectSetExternalOAuthActionBuilder();
      builder.externalOAuth = template.getExternalOAuth();
      return builder;
   }
   
}