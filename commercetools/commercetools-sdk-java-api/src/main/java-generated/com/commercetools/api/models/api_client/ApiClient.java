
package com.commercetools.api.models.api_client;

import java.time.*;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ApiClientImpl.class)
public interface ApiClient {

    /**
    *  <p>Unique ID of the API client.
    *  This is the OAuth2 <code>client_id</code> that can be used to <a href="/../api/authorization#requesting-an-access-token-using-commercetools-oauth-20-server">obtain an access token</a>.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>Name of the API Client.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>Whitespace-separated list of <a href="/../api/scopes">OAuth scopes</a> that can be used when <a href="/../api/authorization#requesting-an-access-token-using-commercetools-oauth-20-server">obtaining an access token</a>.</p>
    */
    @NotNull
    @JsonProperty("scope")
    public String getScope();

    /**
    *  <p>Only shown once in the response of creating the API Client.
    *  This is the OAuth2 <code>client_secret</code> that can be used to <a href="/../api/authorization#requesting-an-access-token-using-commercetools-oauth-20-server">obtain an access token</a>.</p>
    */

    @JsonProperty("secret")
    public String getSecret();

    /**
    *  <p>Date of the last day this API Client was used to <a href="/../api/authorization#requesting-an-access-token-using-commercetools-oauth-20-server">obtain an access token</a>.</p>
    */

    @JsonProperty("lastUsedAt")
    public LocalDate getLastUsedAt();

    /**
    *  <p>If set, the client will be deleted on (or shortly after) this point in time.</p>
    */

    @JsonProperty("deleteAt")
    public ZonedDateTime getDeleteAt();

    /**
    *  <p>Date and time (UTC) the API Client was initially created.</p>
    */

    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    public void setId(final String id);

    public void setName(final String name);

    public void setScope(final String scope);

    public void setSecret(final String secret);

    public void setLastUsedAt(final LocalDate lastUsedAt);

    public void setDeleteAt(final ZonedDateTime deleteAt);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public static ApiClient of() {
        return new ApiClientImpl();
    }

    public static ApiClient of(final ApiClient template) {
        ApiClientImpl instance = new ApiClientImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setSecret(template.getSecret());
        instance.setLastUsedAt(template.getLastUsedAt());
        instance.setDeleteAt(template.getDeleteAt());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    public static ApiClientBuilder builder() {
        return ApiClientBuilder.of();
    }

    public static ApiClientBuilder builder(final ApiClient template) {
        return ApiClientBuilder.of(template);
    }

    default <T> T withApiClient(Function<ApiClient, T> helper) {
        return helper.apply(this);
    }
}
