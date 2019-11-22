package com.commercetools.api.generated.models.api_client;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.api_client.ApiClientImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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

   /**
   	<p>The unique ID of the API client.
   	This is the OAuth2 <code>client_id</code> and can be used to obtain a token.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
   /**
   	
   */
   @NotNull
   @JsonProperty("name")
   public String getName();
   /**
   	<p>A whitespace separated list of the OAuth scopes.
   	This is the OAuth2 <code>scope</code> and can be used to obtain a token.</p>
   */
   @NotNull
   @JsonProperty("scope")
   public String getScope();
   /**
   	
   */
   
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   /**
   	<p>The last day this API Client was used to obtain a token.</p>
   */
   
   @JsonProperty("lastUsedAt")
   public LocalDate getLastUsedAt();
   /**
   	<p>If set, the client will be deleted on (or shortly after) this point in time.</p>
   */
   
   @JsonProperty("deleteAt")
   public ZonedDateTime getDeleteAt();
   /**
   	<p>The secret is only shown once in the response of creating the API Client.
   	This is the OAuth2 <code>client_secret</code> and can be used to obtain a token.</p>
   */
   
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