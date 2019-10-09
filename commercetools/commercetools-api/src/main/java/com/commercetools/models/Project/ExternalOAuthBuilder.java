package com.commercetools.models.project;


import com.commercetools.models.project.ExternalOAuth;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExternalOAuthBuilder {
   
   
   private String authorizationHeader;
   
   
   private String url;
   
   public ExternalOAuthBuilder authorizationHeader( final String authorizationHeader) {
      this.authorizationHeader = authorizationHeader;
      return this;
   }
   
   public ExternalOAuthBuilder url( final String url) {
      this.url = url;
      return this;
   }
   
   
   public String getAuthorizationHeader(){
      return this.authorizationHeader;
   }
   
   
   public String getUrl(){
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