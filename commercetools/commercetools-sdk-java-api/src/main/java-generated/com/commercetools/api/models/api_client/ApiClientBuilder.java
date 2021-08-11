
package com.commercetools.api.models.api_client;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ApiClientBuilder implements Builder<ApiClient> {

    private String id;

    private String name;

    private String scope;

    @Nullable
    private java.time.ZonedDateTime createdAt;

    @Nullable
    private java.time.LocalDate lastUsedAt;

    @Nullable
    private java.time.ZonedDateTime deleteAt;

    @Nullable
    private String secret;

    public ApiClientBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ApiClientBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ApiClientBuilder scope(final String scope) {
        this.scope = scope;
        return this;
    }

    public ApiClientBuilder createdAt(@Nullable final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ApiClientBuilder lastUsedAt(@Nullable final java.time.LocalDate lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
        return this;
    }

    public ApiClientBuilder deleteAt(@Nullable final java.time.ZonedDateTime deleteAt) {
        this.deleteAt = deleteAt;
        return this;
    }

    public ApiClientBuilder secret(@Nullable final String secret) {
        this.secret = secret;
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
    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
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
    public String getSecret() {
        return this.secret;
    }

    public ApiClient build() {
        Objects.requireNonNull(id, ApiClient.class + ": id is missing");
        Objects.requireNonNull(name, ApiClient.class + ": name is missing");
        Objects.requireNonNull(scope, ApiClient.class + ": scope is missing");
        return new ApiClientImpl(id, name, scope, createdAt, lastUsedAt, deleteAt, secret);
    }

    /**
     * builds ApiClient without checking for non null required values
     */
    public ApiClient buildUnchecked() {
        return new ApiClientImpl(id, name, scope, createdAt, lastUsedAt, deleteAt, secret);
    }

    public static ApiClientBuilder of() {
        return new ApiClientBuilder();
    }

    public static ApiClientBuilder of(final ApiClient template) {
        ApiClientBuilder builder = new ApiClientBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        builder.scope = template.getScope();
        builder.createdAt = template.getCreatedAt();
        builder.lastUsedAt = template.getLastUsedAt();
        builder.deleteAt = template.getDeleteAt();
        builder.secret = template.getSecret();
        return builder;
    }

}
