
package com.commercetools.api.models.api_client;

import java.time.*;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ApiClient
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApiClient apiClient = ApiClient.builder()
 *             .id("{id}")
 *             .name("{name}")
 *             .scope("{scope}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApiClientImpl.class)
public interface ApiClient extends com.commercetools.api.models.Identifiable<ApiClient> {

    /**
     *  <p>The OAuth2 <code>client_id</code> that can be used to <span>obtain an access token</span>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Name of the APIClient.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Whitespace-separated list of <span>OAuth scopes</span> that can be used when <span>obtaining an access token</span>.</p>
     * @return scope
     */
    @NotNull
    @JsonProperty("scope")
    public String getScope();

    /**
     *  <p>Only shown once in the response of creating the APIClient. This is the OAuth2 <code>client_secret</code> that can be used to <span>obtain an access token</span>.</p>
     * @return secret
     */

    @JsonProperty("secret")
    public String getSecret();

    /**
     *  <p>Date of the last day this APIClient was used to <span>obtain an access token</span>.</p>
     * @return lastUsedAt
     */

    @JsonProperty("lastUsedAt")
    public LocalDate getLastUsedAt();

    /**
     *  <p>If set, the Client will be deleted on (or shortly after) this point in time.</p>
     * @return deleteAt
     */

    @JsonProperty("deleteAt")
    public ZonedDateTime getDeleteAt();

    /**
     *  <p>Date and time (UTC) the APIClient was initially created.</p>
     * @return createdAt
     */

    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Expiration time in seconds for each access token obtained by the APIClient. Only present when set with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClientDraft" rel="nofollow">APIClientDraft</a>. If not present the default value applies.</p>
     * @return accessTokenValiditySeconds
     */

    @JsonProperty("accessTokenValiditySeconds")
    public Integer getAccessTokenValiditySeconds();

    /**
     *  <p>Inactivity expiration time in seconds for each refresh token obtained by the APIClient. Only present when set with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClientDraft" rel="nofollow">APIClientDraft</a>. If not present the default value applies.</p>
     * @return refreshTokenValiditySeconds
     */

    @JsonProperty("refreshTokenValiditySeconds")
    public Integer getRefreshTokenValiditySeconds();

    /**
     *  <p>The OAuth2 <code>client_id</code> that can be used to <span>obtain an access token</span>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Name of the APIClient.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Whitespace-separated list of <span>OAuth scopes</span> that can be used when <span>obtaining an access token</span>.</p>
     * @param scope value to be set
     */

    public void setScope(final String scope);

    /**
     *  <p>Only shown once in the response of creating the APIClient. This is the OAuth2 <code>client_secret</code> that can be used to <span>obtain an access token</span>.</p>
     * @param secret value to be set
     */

    public void setSecret(final String secret);

    /**
     *  <p>Date of the last day this APIClient was used to <span>obtain an access token</span>.</p>
     * @param lastUsedAt value to be set
     */

    public void setLastUsedAt(final LocalDate lastUsedAt);

    /**
     *  <p>If set, the Client will be deleted on (or shortly after) this point in time.</p>
     * @param deleteAt value to be set
     */

    public void setDeleteAt(final ZonedDateTime deleteAt);

    /**
     *  <p>Date and time (UTC) the APIClient was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Expiration time in seconds for each access token obtained by the APIClient. Only present when set with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClientDraft" rel="nofollow">APIClientDraft</a>. If not present the default value applies.</p>
     * @param accessTokenValiditySeconds value to be set
     */

    public void setAccessTokenValiditySeconds(final Integer accessTokenValiditySeconds);

    /**
     *  <p>Inactivity expiration time in seconds for each refresh token obtained by the APIClient. Only present when set with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClientDraft" rel="nofollow">APIClientDraft</a>. If not present the default value applies.</p>
     * @param refreshTokenValiditySeconds value to be set
     */

    public void setRefreshTokenValiditySeconds(final Integer refreshTokenValiditySeconds);

    /**
     * factory method
     * @return instance of ApiClient
     */
    public static ApiClient of() {
        return new ApiClientImpl();
    }

    /**
     * factory method to create a shallow copy ApiClient
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApiClient of(final ApiClient template) {
        ApiClientImpl instance = new ApiClientImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setSecret(template.getSecret());
        instance.setLastUsedAt(template.getLastUsedAt());
        instance.setDeleteAt(template.getDeleteAt());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setAccessTokenValiditySeconds(template.getAccessTokenValiditySeconds());
        instance.setRefreshTokenValiditySeconds(template.getRefreshTokenValiditySeconds());
        return instance;
    }

    public ApiClient copyDeep();

    /**
     * factory method to create a deep copy of ApiClient
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApiClient deepCopy(@Nullable final ApiClient template) {
        if (template == null) {
            return null;
        }
        ApiClientImpl instance = new ApiClientImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setSecret(template.getSecret());
        instance.setLastUsedAt(template.getLastUsedAt());
        instance.setDeleteAt(template.getDeleteAt());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setAccessTokenValiditySeconds(template.getAccessTokenValiditySeconds());
        instance.setRefreshTokenValiditySeconds(template.getRefreshTokenValiditySeconds());
        return instance;
    }

    /**
     * builder factory method for ApiClient
     * @return builder
     */
    public static ApiClientBuilder builder() {
        return ApiClientBuilder.of();
    }

    /**
     * create builder for ApiClient instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApiClientBuilder builder(final ApiClient template) {
        return ApiClientBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApiClient(Function<ApiClient, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApiClient> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApiClient>() {
            @Override
            public String toString() {
                return "TypeReference<ApiClient>";
            }
        };
    }
}
