
package com.commercetools.api.models.api_client;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ApiClient
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApiClientImpl implements ApiClient, ModelBase {

    private String id;

    private String name;

    private String scope;

    private String secret;

    private java.time.LocalDate lastUsedAt;

    private java.time.ZonedDateTime deleteAt;

    private java.time.ZonedDateTime createdAt;

    private Integer accessTokenValiditySeconds;

    private Integer refreshTokenValiditySeconds;

    @JsonCreator
    ApiClientImpl(@JsonProperty("id") final String id, @JsonProperty("name") final String name,
            @JsonProperty("scope") final String scope, @JsonProperty("secret") final String secret,
            @JsonProperty("lastUsedAt") final java.time.LocalDate lastUsedAt,
            @JsonProperty("deleteAt") final java.time.ZonedDateTime deleteAt,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("accessTokenValiditySeconds") final Integer accessTokenValiditySeconds,
            @JsonProperty("refreshTokenValiditySeconds") final Integer refreshTokenValiditySeconds) {
        this.id = id;
        this.name = name;
        this.scope = scope;
        this.secret = secret;
        this.lastUsedAt = lastUsedAt;
        this.deleteAt = deleteAt;
        this.createdAt = createdAt;
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    }

    public ApiClientImpl() {
    }

    /**
     *  <p>The OAuth2 <code>client_id</code> that can be used to obtain an access token.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Name of the APIClient.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Whitespace-separated list of OAuth scopes that can be used when obtaining an access token.</p>
     */

    public String getScope() {
        return this.scope;
    }

    /**
     *  <p>Only shown once in the response of creating the APIClient. This is the OAuth2 <code>client_secret</code> that can be used to obtain an access token.</p>
     */

    public String getSecret() {
        return this.secret;
    }

    /**
     *  <p>Date of the last day this APIClient was used to obtain an access token.</p>
     */

    public java.time.LocalDate getLastUsedAt() {
        return this.lastUsedAt;
    }

    /**
     *  <p>If set, the Client will be deleted on (or shortly after) this point in time.</p>
     */

    public java.time.ZonedDateTime getDeleteAt() {
        return this.deleteAt;
    }

    /**
     *  <p>Date and time (UTC) the APIClient was initially created at.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Expiration time in seconds for each access token obtained by the APIClient. Only present when set with the APIClientDraft. If not present the default value applies.</p>
     */

    public Integer getAccessTokenValiditySeconds() {
        return this.accessTokenValiditySeconds;
    }

    /**
     *  <p>Inactivity expiration time in seconds for each refresh token obtained by the APIClient. Only present when set with the APIClientDraft. If not present the default value applies.</p>
     */

    public Integer getRefreshTokenValiditySeconds() {
        return this.refreshTokenValiditySeconds;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setScope(final String scope) {
        this.scope = scope;
    }

    public void setSecret(final String secret) {
        this.secret = secret;
    }

    public void setLastUsedAt(final java.time.LocalDate lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }

    public void setDeleteAt(final java.time.ZonedDateTime deleteAt) {
        this.deleteAt = deleteAt;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setAccessTokenValiditySeconds(final Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    }

    public void setRefreshTokenValiditySeconds(final Integer refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApiClientImpl that = (ApiClientImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(name, that.name)
                .append(scope, that.scope)
                .append(secret, that.secret)
                .append(lastUsedAt, that.lastUsedAt)
                .append(deleteAt, that.deleteAt)
                .append(createdAt, that.createdAt)
                .append(accessTokenValiditySeconds, that.accessTokenValiditySeconds)
                .append(refreshTokenValiditySeconds, that.refreshTokenValiditySeconds)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(name)
                .append(scope)
                .append(secret)
                .append(lastUsedAt)
                .append(deleteAt)
                .append(createdAt)
                .append(accessTokenValiditySeconds)
                .append(refreshTokenValiditySeconds)
                .toHashCode();
    }

}
