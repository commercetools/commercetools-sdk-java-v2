package com.commercetools.api.generated.models.api_client;


import com.commercetools.api.generated.models.api_client.ApiClientDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ApiClientDraftBuilder {
   
   @Nullable
   private Long deleteDaysAfterCreation;
   
   
   private String scope;
   
   
   private String name;
   
   public ApiClientDraftBuilder deleteDaysAfterCreation(@Nullable final Long deleteDaysAfterCreation) {
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
      return this;
   }
   
   public ApiClientDraftBuilder scope( final String scope) {
      this.scope = scope;
      return this;
   }
   
   public ApiClientDraftBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   @Nullable
   public Long getDeleteDaysAfterCreation(){
      return this.deleteDaysAfterCreation;
   }
   
   
   public String getScope(){
      return this.scope;
   }
   
   
   public String getName(){
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