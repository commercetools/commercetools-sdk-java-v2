package com.commercetools.models.api_client;

import java.lang.Long;
import java.lang.String;
import com.commercetools.models.api_client.ApiClientDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ApiClientDraftImpl.class)
public interface ApiClientDraft  {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   @NotNull
   @JsonProperty("scope")
   public String getScope();
   
   
   @JsonProperty("deleteDaysAfterCreation")
   public Long getDeleteDaysAfterCreation();

   public void setName(final String name);
   
   public void setScope(final String scope);
   
   public void setDeleteDaysAfterCreation(final Long deleteDaysAfterCreation);
   
   public static ApiClientDraftImpl of(){
      return new ApiClientDraftImpl();
   }
   

   public static ApiClientDraftImpl of(final ApiClientDraft template) {
      ApiClientDraftImpl instance = new ApiClientDraftImpl();
      instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
      instance.setScope(template.getScope());
      instance.setName(template.getName());
      return instance;
   }

}