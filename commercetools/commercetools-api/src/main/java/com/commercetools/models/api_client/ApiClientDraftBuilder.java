package com.commercetools.models.api_client;

import java.lang.Long;
import java.lang.String;
import com.commercetools.models.api_client.ApiClientDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ApiClientDraftBuilder {
   
   @Nullable
   private java.lang.Long deleteDaysAfterCreation;
   
   
   private java.lang.String scope;
   
   
   private java.lang.String name;
   
   public ApiClientDraftBuilder deleteDaysAfterCreation(@Nullable final java.lang.Long deleteDaysAfterCreation) {
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
      return this;
   }
   
   public ApiClientDraftBuilder scope( final java.lang.String scope) {
      this.scope = scope;
      return this;
   }
   
   public ApiClientDraftBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   @Nullable
   public java.lang.Long getDeleteDaysAfterCreation(){
      return this.deleteDaysAfterCreation;
   }
   
   
   public java.lang.String getScope(){
      return this.scope;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }

   public ApiClientDraft build() {
       return new ApiClientDraftImpl(deleteDaysAfterCreation, scope, name);
   }
   
   public static ApiClientDraftBuilder of() {
      return new ApiClientDraftBuilder();
   }
   
   public static ApiClientDraftBuilder of(final ApiClientDraft template) {
      ApiClientDraftBuilder builder = new ApiClientDraftBuilder();
      builder.deleteDaysAfterCreation = template.getDeleteDaysAfterCreation();
      builder.scope = template.getScope();
      builder.name = template.getName();
      return builder;
   }
   
}