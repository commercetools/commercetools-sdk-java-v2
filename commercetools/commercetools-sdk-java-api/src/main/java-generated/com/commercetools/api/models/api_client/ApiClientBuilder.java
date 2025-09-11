
package com.commercetools.api.models.api_client;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApiClientBuilder
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
public class ApiClientBuilder implements Builder<ApiClient> {

    private String id;

    private String name;

    private String scope;

    @Nullable
    private String secret;

    @Nullable
    private java.time.LocalDate lastUsedAt;

    @Nullable
    private java.time.ZonedDateTime deleteAt;

    @Nullable
    private java.time.ZonedDateTime createdAt;

    @Nullable
    private Integer accessTokenValiditySeconds;

    @Nullable
    private Integer refreshTokenValiditySeconds;

    /**
     *  <p>The OAuth2 <code>client_id</code> that can be used to <span>obtain an access token</span>.</p>
     * @param id value to be set
     * @return Builder
     */

    public ApiClientBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Name of the APIClient.</p>
     * @param name value to be set
     * @return Builder
     */

    public ApiClientBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Whitespace-separated list of <span>OAuth scopes</span> that can be used when <span>obtaining an access token</span>.</p>
     * @param scope value to be set
     * @return Builder
     */

    public ApiClientBuilder scope(final String scope) {
        this.scope = scope;
        return this;
    }

    /**
     *  <p>Only shown once in the response of creating the APIClient. This is the OAuth2 <code>client_secret</code> that can be used to <span>obtain an access token</span>.</p>
     * @param secret value to be set
     * @return Builder
     */

    public ApiClientBuilder secret(@Nullable final String secret) {
        this.secret = secret;
        return this;
    }

    /**
     *  <p>Date of the last day this APIClient was used to <span>obtain an access token</span>.</p>
     * @param lastUsedAt value to be set
     * @return Builder
     */

    public ApiClientBuilder lastUsedAt(@Nullable final java.time.LocalDate lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
        return this;
    }

    /**
     *  <p>If set, the Client will be deleted on (or shortly after) this point in time.</p>
     * @param deleteAt value to be set
     * @return Builder
     */

    public ApiClientBuilder deleteAt(@Nullable final java.time.ZonedDateTime deleteAt) {
        this.deleteAt = deleteAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the APIClient was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ApiClientBuilder createdAt(@Nullable final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Expiration time in seconds for each access token obtained by the APIClient. Only present when set with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClientDraft" rel="nofollow">APIClientDraft</a>. If not present the default value applies.</p>
     * @param accessTokenValiditySeconds value to be set
     * @return Builder
     */

    public ApiClientBuilder accessTokenValiditySeconds(@Nullable final Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
        return this;
    }

    /**
     *  <p>Inactivity expiration time in seconds for each refresh token obtained by the APIClient. Only present when set with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClientDraft" rel="nofollow">APIClientDraft</a>. If not present the default value applies.</p>
     * @param refreshTokenValiditySeconds value to be set
     * @return Builder
     */

    public ApiClientBuilder refreshTokenValiditySeconds(@Nullable final Integer refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
        return this;
    }

    /**
     *  <p>The OAuth2 <code>client_id</code> that can be used to <span>obtain an access token</span>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Name of the APIClient.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Whitespace-separated list of <span>OAuth scopes</span> that can be used when <span>obtaining an access token</span>.</p>
     * @return scope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     *  <p>Only shown once in the response of creating the APIClient. This is the OAuth2 <code>client_secret</code> that can be used to <span>obtain an access token</span>.</p>
     * @return secret
     */

    @Nullable
    public String getSecret() {
        return this.secret;
    }

    /**
     *  <p>Date of the last day this APIClient was used to <span>obtain an access token</span>.</p>
     * @return lastUsedAt
     */

    @Nullable
    public java.time.LocalDate getLastUsedAt() {
        return this.lastUsedAt;
    }

    /**
     *  <p>If set, the Client will be deleted on (or shortly after) this point in time.</p>
     * @return deleteAt
     */

    @Nullable
    public java.time.ZonedDateTime getDeleteAt() {
        return this.deleteAt;
    }

    /**
     *  <p>Date and time (UTC) the APIClient was initially created.</p>
     * @return createdAt
     */

    @Nullable
    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Expiration time in seconds for each access token obtained by the APIClient. Only present when set with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClientDraft" rel="nofollow">APIClientDraft</a>. If not present the default value applies.</p>
     * @return accessTokenValiditySeconds
     */

    @Nullable
    public Integer getAccessTokenValiditySeconds() {
        return this.accessTokenValiditySeconds;
    }

    /**
     *  <p>Inactivity expiration time in seconds for each refresh token obtained by the APIClient. Only present when set with the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClientDraft" rel="nofollow">APIClientDraft</a>. If not present the default value applies.</p>
     * @return refreshTokenValiditySeconds
     */

    @Nullable
    public Integer getRefreshTokenValiditySeconds() {
        return this.refreshTokenValiditySeconds;
    }

    /**
     * builds ApiClient with checking for non-null required values
     * @return ApiClient
     */
    public ApiClient build() {
        Objects.requireNonNull(id, ApiClient.class + ": id is missing");
        Objects.requireNonNull(name, ApiClient.class + ": name is missing");
        Objects.requireNonNull(scope, ApiClient.class + ": scope is missing");
        return new ApiClientImpl(id, name, scope, secret, lastUsedAt, deleteAt, createdAt, accessTokenValiditySeconds,
            refreshTokenValiditySeconds);
    }

    /**
     * builds ApiClient without checking for non-null required values
     * @return ApiClient
     */
    public ApiClient buildUnchecked() {
        return new ApiClientImpl(id, name, scope, secret, lastUsedAt, deleteAt, createdAt, accessTokenValiditySeconds,
            refreshTokenValiditySeconds);
    }

    /**
     * factory method for an instance of ApiClientBuilder
     * @return builder
     */
    public static ApiClientBuilder of() {
        return new ApiClientBuilder();
    }

    /**
     * create builder for ApiClient instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApiClientBuilder of(final ApiClient template) {
        ApiClientBuilder builder = new ApiClientBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        builder.scope = template.getScope();
        builder.secret = template.getSecret();
        builder.lastUsedAt = template.getLastUsedAt();
        builder.deleteAt = template.getDeleteAt();
        builder.createdAt = template.getCreatedAt();
        builder.accessTokenValiditySeconds = template.getAccessTokenValiditySeconds();
        builder.refreshTokenValiditySeconds = template.getRefreshTokenValiditySeconds();
        return builder;
    }

}
