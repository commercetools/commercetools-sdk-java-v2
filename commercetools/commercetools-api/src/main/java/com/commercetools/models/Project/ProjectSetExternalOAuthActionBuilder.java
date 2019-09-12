package com.commercetools.models.Project;

import com.commercetools.models.Project.ExternalOAuth;
import com.commercetools.models.Project.ProjectUpdateAction;
import java.lang.String;
import com.commercetools.models.Project.ProjectSetExternalOAuthAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProjectSetExternalOAuthActionBuilder {
   
   @Nullable
   private com.commercetools.models.Project.ExternalOAuth externalOAuth;
   
   public ProjectSetExternalOAuthActionBuilder externalOAuth(@Nullable final com.commercetools.models.Project.ExternalOAuth externalOAuth) {
      this.externalOAuth = externalOAuth;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Project.ExternalOAuth getExternalOAuth(){
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