package com.commercetools.models.Project;

import java.lang.String;
import com.commercetools.models.Project.ExternalOAuth;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExternalOAuthBuilder {
   
   
   private java.lang.String authorizationHeader;
   
   
   private java.lang.String url;
   
   public ExternalOAuthBuilder authorizationHeader( final java.lang.String authorizationHeader) {
      this.authorizationHeader = authorizationHeader;
      return this;
   }
   
   public ExternalOAuthBuilder url( final java.lang.String url) {
      this.url = url;
      return this;
   }
   
   
   public java.lang.String getAuthorizationHeader(){
      return this.authorizationHeader;
   }
   
   
   public java.lang.String getUrl(){
      return this.url;
   }

   public ExternalOAuth build() {
       return new ExternalOAuthImpl(authorizationHeader, url);
   }
   
   public static ExternalOAuthBuilder of() {
      return new ExternalOAuthBuilder();
   }
   
   public static ExternalOAuthBuilder of(final ExternalOAuth template) {
      ExternalOAuthBuilder builder = new ExternalOAuthBuilder();
      builder.authorizationHeader = template.getAuthorizationHeader();
      builder.url = template.getUrl();
      return builder;
   }
   
}