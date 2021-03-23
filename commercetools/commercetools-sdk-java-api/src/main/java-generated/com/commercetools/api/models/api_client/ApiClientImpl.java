
package com.commercetools.api.models.api_client;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ApiClientImpl implements ApiClient {

    private String id;

    private String name;

    private String scope;

    private java.time.ZonedDateTime createdAt;

    private java.time.LocalDate lastUsedAt;

    private java.time.ZonedDateTime deleteAt;

    private String secret;

    @JsonCreator
    ApiClientImpl(@JsonProperty("id") final String id, @JsonProperty("name") final String name,
            @JsonProperty("scope") final String scope,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastUsedAt") final java.time.LocalDate lastUsedAt,
            @JsonProperty("deleteAt") final java.time.ZonedDateTime deleteAt,
            @JsonProperty("secret") final String secret) {
        this.id = id;
        this.name = name;
        this.scope = scope;
        this.createdAt = createdAt;
        this.lastUsedAt = lastUsedAt;
        this.deleteAt = deleteAt;
        this.secret = secret;
    }

    public ApiClientImpl() {
    }

    /**
    *  <p>The unique ID of the API client.
    *  This is the OAuth2 <code>client_id</code> and can be used to obtain a token.</p>
    */
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    /**
    *  <p>A whitespace separated list of the OAuth scopes.
    *  This is the OAuth2 <code>scope</code> and can be used to obtain a token.</p>
    */
    public String getScope() {
        return this.scope;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
    *  <p>The last day this API Client was used to obtain a token.</p>
    */
    public java.time.LocalDate getLastUsedAt() {
        return this.lastUsedAt;
    }

    /**
    *  <p>If set, the client will be deleted on (or shortly after) this point in time.</p>
    */
    public java.time.ZonedDateTime getDeleteAt() {
        return this.deleteAt;
    }

    /**
    *  <p>The secret is only shown once in the response of creating the API Client.
    *  This is the OAuth2 <code>client_secret</code> and can be used to obtain a token.</p>
    */
    public String getSecret() {
        return this.secret;
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

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastUsedAt(final java.time.LocalDate lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }

    public void setDeleteAt(final java.time.ZonedDateTime deleteAt) {
        this.deleteAt = deleteAt;
    }

    public void setSecret(final String secret) {
        this.secret = secret;
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
                .append(createdAt, that.createdAt)
                .append(lastUsedAt, that.lastUsedAt)
                .append(deleteAt, that.deleteAt)
                .append(secret, that.secret)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(name)
                .append(scope)
                .append(createdAt)
                .append(lastUsedAt)
                .append(deleteAt)
                .append(secret)
                .toHashCode();
    }

}
