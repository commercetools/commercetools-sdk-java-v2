
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
     *  <p>The OAuth2 <code>client_id</code> that can be used to obtain an access token.</p>
     */

    public ApiClientBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Name of the APIClient.</p>
     */

    public ApiClientBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Whitespace-separated list of OAuth scopes that can be used when obtaining an access token.</p>
     */

    public ApiClientBuilder scope(final String scope) {
        this.scope = scope;
        return this;
    }

    /**
     *  <p>Only shown once in the response of creating the APIClient. This is the OAuth2 <code>client_secret</code> that can be used to obtain an access token.</p>
     */

    public ApiClientBuilder secret(@Nullable final String secret) {
        this.secret = secret;
        return this;
    }

    /**
     *  <p>Date of the last day this APIClient was used to obtain an access token.</p>
     */

    public ApiClientBuilder lastUsedAt(@Nullable final java.time.LocalDate lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
        return this;
    }

    /**
     *  <p>If set, the Client will be deleted on (or shortly after) this point in time.</p>
     */

    public ApiClientBuilder deleteAt(@Nullable final java.time.ZonedDateTime deleteAt) {
        this.deleteAt = deleteAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the APIClient was initially created at.</p>
     */

    public ApiClientBuilder createdAt(@Nullable final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Expiration time in seconds for each access token obtained by the APIClient. Only present when set with the APIClientDraft. If not present the default value applies.</p>
     */

    public ApiClientBuilder accessTokenValiditySeconds(@Nullable final Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
        return this;
    }

    /**
     *  <p>Inactivity expiration time in seconds for each refresh token obtained by the APIClient. Only present when set with the APIClientDraft. If not present the default value applies.</p>
     */

    public ApiClientBuilder refreshTokenValiditySeconds(@Nullable final Integer refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getScope() {
        return this.scope;
    }

    @Nullable
    public String getSecret() {
        return this.secret;
    }

    @Nullable
    public java.time.LocalDate getLastUsedAt() {
        return this.lastUsedAt;
    }

    @Nullable
    public java.time.ZonedDateTime getDeleteAt() {
        return this.deleteAt;
    }

    @Nullable
    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public Integer getAccessTokenValiditySeconds() {
        return this.accessTokenValiditySeconds;
    }

    @Nullable
    public Integer getRefreshTokenValiditySeconds() {
        return this.refreshTokenValiditySeconds;
    }

    public ApiClient build() {
        Objects.requireNonNull(id, ApiClient.class + ": id is missing");
        Objects.requireNonNull(name, ApiClient.class + ": name is missing");
        Objects.requireNonNull(scope, ApiClient.class + ": scope is missing");
        return new ApiClientImpl(id, name, scope, secret, lastUsedAt, deleteAt, createdAt, accessTokenValiditySeconds,
            refreshTokenValiditySeconds);
    }

    /**
     * builds ApiClient without checking for non null required values
     */
    public ApiClient buildUnchecked() {
        return new ApiClientImpl(id, name, scope, secret, lastUsedAt, deleteAt, createdAt, accessTokenValiditySeconds,
            refreshTokenValiditySeconds);
    }

    public static ApiClientBuilder of() {
        return new ApiClientBuilder();
    }

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
