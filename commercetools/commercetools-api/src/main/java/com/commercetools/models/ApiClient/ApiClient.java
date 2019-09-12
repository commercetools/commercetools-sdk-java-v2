package com.commercetools.models.ApiClient;

import java.lang.String;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import com.commercetools.models.ApiClient.ApiClientImpl;

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
@JsonDeserialize(as = ApiClientImpl.class)
public interface ApiClient  {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   @NotNull
   @JsonProperty("scope")
   public String getScope();
   
   
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   
   
   @JsonProperty("lastUsedAt")
   public LocalDate getLastUsedAt();
   
   
   @JsonProperty("deleteAt")
   public ZonedDateTime getDeleteAt();
   
   
   @JsonProperty("secret")
   public String getSecret();

   public void setId(final String id);
   
   public void setName(final String name);
   
   public void setScope(final String scope);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastUsedAt(final LocalDate lastUsedAt);
   
   public void setDeleteAt(final ZonedDateTime deleteAt);
   
   public void setSecret(final String secret);
   
   public static ApiClientImpl of(){
      return new ApiClientImpl();
   }
   

   public static ApiClientImpl of(final ApiClient template) {
      ApiClientImpl instance = new ApiClientImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setDeleteAt(template.getDeleteAt());
      instance.setLastUsedAt(template.getLastUsedAt());
      instance.setScope(template.getScope());
      instance.setName(template.getName());
      instance.setSecret(template.getSecret());
      instance.setId(template.getId());
      return instance;
   }

}